
//Create a Java program that simulates a ticket reservation system for a limited number of seats in a theater. Implement
// synchronization to ensure that multiple threads representing customers can reserve seats without exceeding the
// available capacity.
public class TicketReservationSystem {
    private int availableSeats;
    public static int totalReserved = 0;

    public TicketReservationSystem(int availableSeats) {
        this.availableSeats = availableSeats;

    }

    public synchronized boolean reserveSeats(String customerName, int numberOfSeatReserved) {
        if (numberOfSeatReserved <= availableSeats) {
            System.out.println(customerName + " reserved " + numberOfSeatReserved + " tickets.");
            availableSeats -= numberOfSeatReserved;
            totalReserved += numberOfSeatReserved; // update total reserved seat
            return true;
        } else {
            System.out.println(customerName + " couldn't reserve " + numberOfSeatReserved + " tickets.");
            return false;
        }
    }

    public int getAvailableSeats(){
        return availableSeats;
    }
}

class Customer extends Thread {
    private TicketReservationSystem system;
    private String customerName;
    private int numberOfSeatReserved  ;

    public Customer(TicketReservationSystem system, String customerName, int numberOfSeatReserved) {
        this.system = system;
        this.customerName = customerName;
        this.numberOfSeatReserved = numberOfSeatReserved;
    }

    @Override
    public void run() {
        system.reserveSeats(customerName, numberOfSeatReserved);
    }
}

class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem(10); // Total available seats

        //Multiple customer trying to reserve seat
        Customer c1 = new Customer(system, "Mahesh", 3);
        Customer c2 = new Customer(system, "Ram", 2);
        Customer c3 = new Customer(system, "Sailesh", 5);
        Customer c4 = new Customer(system, "Puun", 3);
        Customer c5 = new Customer(system,"Shyam",1);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            c5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total reserved seat." + TicketReservationSystem.totalReserved);
        System.out.println(" remaing available seats : " + system.getAvailableSeats());


    }
}
