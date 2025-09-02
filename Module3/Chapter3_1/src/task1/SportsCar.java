package task1;

public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            // SportsCar accelerates faster and consumes more gasoline
            for (int i = 0; i < 2; i++) { // double acceleration
                super.accelerate();
            }
            gasolineLevel -= 2; // extra consumption
        } else {
            System.out.println("Out of gasoline!");
        }
    }

    @Override
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            // decelerates faster
            super.decelerate(amount * 2);
            gasolineLevel -= 1; // extra consumption
        } else {
            System.out.println("Out of gasoline!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Car regularCar = new Car("Regular Car");
        SportsCar sportsCar = new SportsCar("Sports Car");

        // Fill tanks
        regularCar.fillTank();
        sportsCar.fillTank();

        // Accelerate once
        regularCar.accelerate();
        sportsCar.accelerate();

        // Print speeds and gasoline
        System.out.println(regularCar.getTypeName() + " speed: " + regularCar.getSpeed() + ", gasoline: " + regularCar.getGasolineLevel());
        System.out.println(sportsCar.getTypeName() + " speed: " + sportsCar.getSpeed() + ", gasoline: " + sportsCar.getGasolineLevel());

        // Decelerate
        regularCar.decelerate(5);
        sportsCar.decelerate(5);

        // Print speeds and gasoline again
        System.out.println("After deceleration:");
        System.out.println(regularCar.getTypeName() + " speed: " + regularCar.getSpeed() + ", gasoline: " + regularCar.getGasolineLevel());
        System.out.println(sportsCar.getTypeName() + " speed: " + sportsCar.getSpeed() + ", gasoline: " + sportsCar.getGasolineLevel());
    }
}
