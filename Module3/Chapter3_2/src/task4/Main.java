package task4;

public class Main {
    public static void main (String[] args){
        Vehicle car = new Car("Toyota", "Corolla", 30.0); // mpg
        Vehicle electricMotorcycle = new ElectricMotorCycle("Yamaha", "MT-07", 42.5); // mpg
        ElectricVehicle eCar = new ElectricCar("Tesla", "Model 3", 0.15); // kWh/km
        ElectricVehicle eMoto = new ElectricMotorCycle("Zero", "SR/F", 0.32); // kWh/km

        car.start();
        car.calculateFuelEfficiency();
        car.stop();
        ((ElectricVehicle) car).charge(); // because ElectricVehicle interface has charge so
        System.out.println();

        electricMotorcycle.start();
        electricMotorcycle.calculateFuelEfficiency();
        electricMotorcycle.stop();
        ((ElectricVehicle) electricMotorcycle).charge();
        System.out.println();

        // Electric Car also implements vehicle but complier does not know that so we need to write like this
        // So that it can call methods of Vehicle
        ((Vehicle) eCar).start();
        ((Vehicle) eCar).calculateFuelEfficiency();
        eCar.charge();
        ((Vehicle) eCar).stop();
        System.out.println();


        ((Vehicle) eMoto).start();
        ((Vehicle) eMoto).calculateFuelEfficiency();
        eMoto.charge();
        ((Vehicle) eMoto).stop();
    }
}
