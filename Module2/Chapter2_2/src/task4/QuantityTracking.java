package task4;

import java.util.ArrayList;

class Item {
    String name;
    double cost;
    String category;
    int quantity;

    public Item(String name, double cost, String category, int quantity) {
        this.name = name;
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }
}

public class QuantityTracking {

    private final ArrayList<Item> groceryList;

    public QuantityTracking() {
        groceryList = new ArrayList<>();
    }

    // Add an item with category and quantity
    public void addItem(String name, double cost, String category, int quantity) {
        Item item = new Item(name, cost, category, quantity);
        groceryList.add(item);
        System.out.println("Added: " + name + " $" + cost + ") in category: " + category + " Quantity: " + quantity);
    }

    // Update quantity of an existing item
    public void updateQuantity(String name, int newQuantity) {
        boolean found = false;
        for (Item item : groceryList) {
            if (item.name.equalsIgnoreCase(name)) {
                item.quantity = newQuantity;
                found = true;
                System.out.println("Updated quantity of " + name + " to " + newQuantity);
                break;
            }
        }
        if (!found) {
            System.out.println("Item " + name + " not found in the list.");
        }
    }

    // Display all items
    public void displayItems() {
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            System.out.println("Grocery List:");
            int i = 1;
            for (Item item : groceryList) {
                System.out.println(i + ". " + item.name + " - $" + item.cost + " (" + item.category + ") Quantity: " + item.quantity);
                i++;
            }
        }
    }

    // Display items with positive quantity
    public void displayAvailableItems() {
        System.out.println("Available Items:");
        boolean found = false;
        int i = 1;
        for (Item item : groceryList) {
            if (item.quantity > 0) {
                System.out.println(i + ". " + item.name + " - $" + item.cost + " (" + item.category + ") Quantity: " + item.quantity);
                i++;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available items in the list.");
        }
    }

    // Calculate total cost (taking quantity into account)
    public double calculateTotalCost() {
        double total = 0;
        for (Item item : groceryList) {
            total += item.cost * item.quantity;
        }
        return total;
    }

    // main functionality
    public static void main(String[] args) {
        QuantityTracking groceryList = new QuantityTracking();

        // Add items with quantity
       groceryList.addItem("Apple", 2.0, "Fruits", 12);
       groceryList.addItem("Milk", 1.50, "Dairy", 2);
       groceryList.addItem("Bread", 1.2, "Bakery", 2);
       groceryList.addItem("Banana", 1.0, "Fruits", 6);

        System.out.println();
        groceryList.displayItems();

        System.out.println();
        groceryList.displayAvailableItems();

        System.out.println();
        groceryList.updateQuantity("Bread", 2);
        groceryList.updateQuantity("Apple", 1);
        groceryList.displayAvailableItems();

        System.out.println();
        double total = groceryList.calculateTotalCost();
        System.out.println("Total cost: $" + total);


    }
}

