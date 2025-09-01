package task4;

class ElectricCar extends AbstractVehicle {
    public ElectricCar(String Type, String model, double FuelEfficiency){
        super(Type, model, FuelEfficiency);
    }
    @Override
    public void charge() {
        System.out.println( Type +" is charge !!!");
    }

    @Override
    public void start(){
        System.out.println(Type + " "+ model +" is starting.");
    }

    @Override
    public void stop(){
        System.out.println(Type + " "+ model + " is stopping.");
    }
}
class ElectricMotorCycle  extends AbstractVehicle {
    public ElectricMotorCycle(String Type, String model, double FuelEfficiency){
        super(Type, model, FuelEfficiency);
    }
    @Override
    public void start(){
        System.out.println(Type + " "+ model +" is starting.");
    }

    @Override
    public void stop() {
        System.out.println(Type + " " + model + " is stopping.");
    }

    @Override
    public void charge() {
        System.out.println(Type + " is charging !!!");
    }
}

