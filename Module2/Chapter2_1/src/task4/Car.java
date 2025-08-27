package task4;
public class Car {

    private double speed;
    private double gasolineLevel;
    private final String typeName;

    // Cruise Controls
    private boolean cruiseControlOn;
    private double targetSpeed;
    private static final double minCruiseSpeed = 20;
    private static final double maxCruiseSpeed = 120;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        cruiseControlOn = false;
        targetSpeed = 0;
    }

    // --- Basic methods ---
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }

    // Cruise control methods
    public boolean turnOnCruiseControl(double targetSpeed) {
        if (targetSpeed < minCruiseSpeed || targetSpeed > maxCruiseSpeed || gasolineLevel <= 0) {
            cruiseControlOn = false;
            return false;
        }
        this.targetSpeed = targetSpeed;
        cruiseControlOn = true;
        return true;
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
        targetSpeed = 0;
    }

    public double getCruiseTargetSpeed() {
        return targetSpeed;
    }

    public void updateCruiseControl() {
        if (!cruiseControlOn) return;

        if (gasolineLevel <= 0) {
            turnOffCruiseControl(); // can't maintain without gas
            return;
        }

        if (Math.abs(speed - targetSpeed) < 1) {
            speed = targetSpeed; // close enough
        } else if (speed < targetSpeed) {
            accelerate();
        } else {
            decelerate(5); // gentle deceleration
        }
    }
}

