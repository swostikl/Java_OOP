package task3;

public class CoffeeMakerDriver {
    public static void main(String[] args){
        CoffeeMaker coffee = new CoffeeMaker();

        coffee.switchOn();
        coffee.setCoffeeType("espresso");
        coffee.setCoffeeAmount(50);

        System.out.println("Coffee maker is switched on.");
        System.out.println("Selected coffee type: " + coffee.getCoffeeType());
        System.out.println("Selected coffee amount: " + coffee.getCoffeeAmount() + "ml");

        coffee.switchOff();
        System.out.println("Coffee maker is switched off.");
        System.out.println("Selected coffee type: " + coffee.getCoffeeType());
        System.out.println("Selected coffee amount: " + coffee.getCoffeeAmount() + "ml");
    }
}
