package task3;

public class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String Type;
    protected String model;

    public AbstractVehicle(String Type, String model){
        this.Type = Type;
        this. model = model;
    }

    @Override
    public void charge() {
        System.out.println("Possible to charge !!!");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}

class ElectricCar extends AbstractVehicle {
    public ElectricCar(String Type, String model){
        super(Type, model);
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
    public ElectricMotorCycle(String Type, String model){
        super(Type, model);
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

// Car.java
class Car extends AbstractVehicle {
    public Car(String Type, String model) {
        super(Type, model);
    }

    @Override
    public void start() {
        System.out.println(Type + " " + model + " car is starting (use fuel).");
    }

    @Override
    public void stop() {
        System.out.println(Type +  " car is stopping.");
    }

    @Override
    public void charge() {
        System.out.println("not possible to charge !!!");
    }
}
