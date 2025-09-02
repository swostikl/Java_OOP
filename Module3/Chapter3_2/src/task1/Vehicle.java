package task1;

// Creating Interfaces name vehicle with start(), stop() and getInfo() method
// note : interface method does not have a body

interface Vehicle {
    // methods
    void start();
    void stop();
    void getInfo();
}

class Car implements Vehicle {
    private String Type;
    private String Fuel;
    private String Color;

    public Car(String fuel, String color) {
        this.Type = "Car";
        this.Fuel = fuel;
        this.Color = color;
    }

    @Override
    public void start() {
        System.out.println("Car starts...");
    }

    @Override
    public void stop() {
        System.out.println("Car stops...");
    }

    @Override
    public void getInfo() {
        System.out.println("Car Information:");
        System.out.println("Type: " + Type);
        System.out.println("Fuel: " + Fuel);
        System.out.println("Color: " + Color);
        System.out.println();
    }
}

class MotorCycle implements Vehicle {
    private String Type;
    private String Fuel;
    private String Color;

    public MotorCycle(String fuel, String color) {
        this.Type = "Motorcycle";
        this.Fuel = fuel;
        this.Color = color;
    }

    @Override
    public void start() {
        System.out.println("MotorCycle starts...");
    }

    @Override
    public void stop() {
        System.out.println("MotorCycle stops...");
    }

    @Override
    public void getInfo() {
        System.out.println("MotorCycle Information:");
        System.out.println("Type: " + Type);
        System.out.println("Fuel: " + Fuel);
        System.out.println("Color: " + Color);
        System.out.println();
    }
}

class Bus implements Vehicle {
    private String Type;
    private String Fuel;
    private String Color;

    public Bus(String fuel, String color) {
        this.Type = "Bus";
        this.Fuel = fuel;
        this.Color = color;
    }

    @Override
    public void start() {
        System.out.println("Bus starts...");
    }

    @Override
    public void stop() {
        System.out.println("Bus stops...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus Information:");
        System.out.println("Type: " + Type);
        System.out.println("Fuel: " + Fuel);
        System.out.println("Color: " + Color);
        System.out.println();
    }
}


