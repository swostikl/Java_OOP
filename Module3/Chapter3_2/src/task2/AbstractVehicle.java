package task2;


// creating abstract class which provides shared method and attributes.
abstract class  AbstractVehicle implements Vehicle {
    protected String brand ;
    protected String Color;
    protected String Fuel;
    protected int PassengerCapacity;

    // getters
   public AbstractVehicle(String brand, String color, String fuel, int passengerCapacity) {
       this.brand = brand ;
       this.Color = color ;
       this.Fuel = fuel ;
       this.PassengerCapacity = passengerCapacity ;
   }


    // abstract method
    public void start(){
        System.out.println(getType() + " is starting.");
    }
    public void stop(){
        System.out.println( getType() + " is stopping." );
    }
    public void getInfo(){
        System.out.println( " Getting Information : " );
    }

    public void displayInfo(){
        System.out.println( "Type: " + getType() + "\n" +
                " Brand :" + brand + "\n" +
                " Fuel : " + Fuel + "\n" +
                " Passenger Capacity : " + PassengerCapacity);
    }

}

// subclass inherit from AbstractVehicle

class Car extends AbstractVehicle {

    public Car(String brand, String color, String fuel, int passengerCapacity) {
        super(brand, color, fuel, passengerCapacity);
    }

    @Override
    public String getType() {
        return "Car" ;
    }

    @Override
    public void start(){
        System.out.println(getType() + " is starting");

    }

    @Override
    public void stop(){
        System.out.println( getType() + " is stopping" );
    }

    @Override
    public void getInfo(){
        System.out.println( " Getting Information..." );
    }
}

// subclass inherit from AbstractVehicle
class Motorcycle extends AbstractVehicle {
    public Motorcycle(String brand, String color, String fuel, int passengerCapacity) {
        super(brand, color, fuel, passengerCapacity);
    }
    @Override
    public String getType() {
        return "Motorcycle" ;
    }

    @Override
    public void start(){
        System.out.println(" Motorcycle is starting...");
    }
    @Override
    public void stop(){
        System.out.println( " Motorcycle is stoping..." );
    }
    @Override
    public void getInfo(){
        System.out.println( " Getting Information..." );
    }
}

// subclass inherit from AbstractVehicle
class Bus extends AbstractVehicle {
    public Bus(String brand, String color, String  fuel, int passengerCapacity) {
        super(brand, color, fuel, passengerCapacity);
    }

    @Override
    public String getType() {
        return "Bus" ;
    }
    @Override
    public void start(){
        System.out.println(" Bus is starting...");
    }
    @Override
    public void stop(){
        System.out.println( " Bus is stoping..." );
    }
    @Override
    public void getInfo(){
        System.out.println( " Getting Information..." );
    }
}