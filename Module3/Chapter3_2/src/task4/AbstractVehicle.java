package task4;

// abstract class
public class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String Type;
    protected String model;
    protected double FuelEfficiency;

    public AbstractVehicle(String Type, String model, double FuelEfficiency) {
        this.Type = Type;
        this.model = model;
        this.FuelEfficiency = FuelEfficiency;
    }

    @Override
    public void start(){
        System.out.println(" is starting");
    }
    @Override
    public void stop(){
        System.out.println( " is stopping");
    }
    @Override
    public void getInfo() {
        System.out.println("Car Information:");
        System.out.println("Type: " + Type);
        System.out.println("Fuel: " + model);
        System.out.println();
    }
    @Override
    public double calculateFuelEfficiency(){
        return FuelEfficiency;
    }
    @Override
    public void charge(){
        System.out.println(" Not possible to charge"); // set default for non electric vehicle
    }

}
