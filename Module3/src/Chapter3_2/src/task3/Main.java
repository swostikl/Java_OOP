package task3;

public class Main {
    public static void main (String[] args){
        AbstractVehicle electricCar= new ElectricCar("toyota", " model 2");
        AbstractVehicle electricMotorcycle = new ElectricMotorCycle(" tesla", " model 3");
        AbstractVehicle car = new Car(" Skoda", " model 4");

        electricCar.start();
        electricCar.stop();

        electricCar.charge();

        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.charge();

        car.start();
        car.stop();
        car.charge();
    }
}
