package task4;

public class CarDrive {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");

        myCar.fillTank();
        System.out.println("Car type: " + myCar.getTypeName());

        // Try cruise control
        boolean turnedOn = myCar.turnOnCruiseControl(80);
        if (turnedOn) {
            System.out.println("Cruise control set to " + myCar.getCruiseTargetSpeed() + " km/h");
        } else {
            System.out.println("Failed to enable cruise control.");
        }

        // Simulate car updating speed
        for (int i = 0; i < 10; i++) {
            myCar.updateCruiseControl();
            System.out.println("Current speed: " + myCar.getSpeed());
        }

        // Turn off cruise control
        myCar.turnOffCruiseControl();
        System.out.println("Cruise control turned off.");
    }
}

