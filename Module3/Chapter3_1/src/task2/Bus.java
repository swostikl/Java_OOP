package task2;

import task1.Car;

public class Bus extends Car {
    private int passengers;
    private int maxPassengerCapacity;

    public Bus(String typeName, int passengers, int maxPassengerCapacity) {
        super(typeName);
        this.passengers = 0;
        this.maxPassengerCapacity = maxPassengerCapacity;
    }
     // getters
    public int getPassengers() {
        return passengers;
    }

    public int getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    // methods i.e if there is space add passenger

    public void passengerEnter(){
        if( passengers < maxPassengerCapacity){
            passengers++;
        }else {
            System.out.println(" There is no space! Bus is full");
        }
    }

    // remove passenger is there are any
    public void passengerExit(){
        if(passengers > 0){
            passengers--;
        }else {
            System.out.println(" There is no passengers  to exit !!!");
        }
    }

}
// main to demonstrate functionality

class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus", 10, 15);

        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();
        System.out.println(" Passengers on board : " + bus.getPassengers());

        bus.passengerEnter();
        bus.passengerEnter();
        System.out.println(" Passengers on board : " + bus.getPassengers());

        bus.passengerExit();
        bus.passengerExit();

        System.out.println(" Passengers on board after exit : " + bus.getPassengers());



    }
}