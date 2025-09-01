package task1;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Petrol", "White");
        Vehicle bike = new MotorCycle("Gasoline", "Black");
        Vehicle bus = new Bus("Diesel", "Blue");

        car.start();
        car.stop();
        car.getInfo();

        bike.start();
        bike.stop();
        bike.getInfo();

        bus.start();
        bus.stop();
        bus.getInfo();
    }
}