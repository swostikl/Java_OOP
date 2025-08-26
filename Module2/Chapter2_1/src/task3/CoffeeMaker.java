package task3;

public class CoffeeMaker {
    private String coffeeType;
    private int coffeeAmount;
    private boolean on;

    // options for coffee
    private final String[] coffeeTypes = {"normal", "espresso"};
    private final int[] coffeeAmounts = {10, 20, 30, 40, 50, 60, 70, 80};

    public CoffeeMaker() {
        this.on = false;
        this.coffeeType = "normal";
        this.coffeeAmount = 10;
    }

    public void switchOn() {
        this.on = true;
    }

    public void switchOff() {
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void setCoffeeType(String Type) {
        if (on) {
            for (String option : coffeeTypes) {
                if (option.equalsIgnoreCase(Type)) {
                    coffeeType = option;
                    return;
                }
            }
        }
    }

    public void setCoffeeAmount(int ml) {
        if (on) {
            for (int option : coffeeAmounts) {
                if (option == ml) {
                    coffeeAmount = ml;
                    return;
                }
            }
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
