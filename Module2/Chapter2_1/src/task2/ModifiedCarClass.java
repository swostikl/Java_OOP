package task2;

// Modify Car class so that it has an additional constructor with gasoline tank capacity and speed arguments.

// Here I just additional gasolineTankCapacity and speed arguments in the example of car class.

public class ModifiedCarClass {
    private double speed;
    private double gasolineLevel;
    private final int gasolineTankCapacity;
    private final String typeName;


    // Constructor

    public ModifiedCarClass (String typeName){
        speed = 0;
        gasolineLevel = 0;
        gasolineTankCapacity = 100;
        this.typeName = typeName;

    }
    // creating additional constructor

    public ModifiedCarClass(String typeName,int gasolineTankCapacity, int speed){
        this.typeName = typeName;
        this.speed = speed;
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.gasolineLevel = 0;

    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
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
    int getGasolineTankCapacity() {
        return gasolineTankCapacity;
    }
}
