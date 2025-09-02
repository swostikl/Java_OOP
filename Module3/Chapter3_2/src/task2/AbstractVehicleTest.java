package task2;

public class AbstractVehicleTest {
    public static void main(String[] args) {
        Car car = new Car ("Toyota", "white", "Petrol",4);
        Bus bus = new Bus ("byd", "Blue","Gasoline",20);
        Motorcycle motorcycle = new Motorcycle("Honda", "white", "Petrol",2);

       car.start();
       car.stop();
       car.getInfo();
       car.displayInfo();
       System.out.println();


       motorcycle.start();
       motorcycle.stop();
       motorcycle.getInfo();
       motorcycle.displayInfo();
       System.out.println();

       bus.start();
       bus.stop();
       bus.getInfo();
       bus.displayInfo();


    }
}
