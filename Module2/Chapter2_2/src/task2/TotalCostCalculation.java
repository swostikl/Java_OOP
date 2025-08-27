package task2;

import java.util.HashMap;
import java.util.Map;

public class TotalCostCalculation {

    // store item and its cost
    private final HashMap<String, Double> groceryList;

    public TotalCostCalculation() {
        groceryList = new HashMap<>();
    }

    // Adding an item with cost
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
        System.out.println("Added: " + item + " $" + cost );
    }

    // Removing an item
    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println("Removed: " + item);
        } else {
            System.out.println("Item " + item + " is not found in the list.");
        }
    }

    // Display all items with costs
    public void displayItems() {
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            System.out.println("Grocery List are : ");
            int i = 1;
            for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
                System.out.println(i + ". " + entry.getKey() + " - $" + entry.getValue());
                i++;
            }
        }
    }

    // Check if an item exists
    public void checkItem(String item) {
        boolean exists = groceryList.containsKey(item);
        System.out.println("Is " + item + " in the grocery list? " + exists);
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
    }


    // Main method to demonstrate functionality
    public static void main(String[] args) {
        TotalCostCalculation groceryList = new TotalCostCalculation();

        // Add items
       groceryList.addItem("Apple", 2.95);
       groceryList.addItem("Milk", 2.0);
       groceryList.addItem("Bread", 1.99);

        // Display items
        groceryList.displayItems();

        // Check for an item
        groceryList.checkItem("Milk");
        groceryList.checkItem("Cheese");

        // Calculate total cost
        double total = groceryList.calculateTotalCost();
        System.out.println("Total cost: $" + total);

        // Remove an ite
        groceryList.removeItem("Milk");
        groceryList.displayItems();

        // Calculate updated total
        total = groceryList.calculateTotalCost();
        System.out.println("Updated total cost: $" + total);
    }
}
