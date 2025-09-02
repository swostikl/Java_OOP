package task4;

// Car.java
public class Car extends AbstractVehicle {
    public Car(String Type, String model, double FuelEfficiency) {
        super(Type, model, FuelEfficiency);
    }

    @Override
    public void start() {
        System.out.println(Type + " " + model + " car is starting.");
    }

    @Override
    public void stop() {
        System.out.println(Type  + " " + model + " car is stopping.");
    }

    @Override
    public double calculateFuelEfficiency() {
        System.out.println("Fuel efficiency (mpg) for " + Type + " " + model + ": " + FuelEfficiency);
        return FuelEfficiency;
    }
}
