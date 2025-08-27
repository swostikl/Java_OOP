package task5;

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

public class GroceryTestTester {

    private final ArrayList<Item> groceryList;

    public GroceryTestTester() {
        groceryList = new ArrayList<>();
    }

    // Add an item with category and quantity
    public void addItem(String name, double cost, String category, int quantity) {
        Item item = new Item(name, cost, category, quantity);
        groceryList.add(item);
        System.out.println("Added: " + name + " ($" + cost + ") in category: "
                + category + " Quantity: " + quantity);
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
                System.out.println(i + ". " + item.name + " - $" + item.cost + " ("
                        + item.category + ") Quantity: " + item.quantity);
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
                System.out.println(i + ". " + item.name + " - $" + item.cost + " ("
                        + item.category + ") Quantity: " + item.quantity);
                i++;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available items in the list.");
        }
    }

    // Display items by category
    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);
        boolean found = false;
        int i = 1;
        for (Item item : groceryList) {
            if (item.category.equalsIgnoreCase(category)) {
                System.out.println(i + ". " + item.name + " - $" + item.cost
                        + " Quantity: " + item.quantity);
                i++;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found in this category.");
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

    //Main method to test new features
    public static void main(String[] args) {
        GroceryTestTester groceryList    = new GroceryTestTester();

        //  Test total cost with quantities
        groceryList.addItem("Apple", 1.5, "Fruits", 3);
        groceryList.addItem("Milk", 2.0, "Dairy", 2);
        groceryList.addItem("Bread", 1.2, "Bakery", 1);
        groceryList.addItem("Banana", 1.0, "Fruits", 5);

        System.out.println("\n Display All Items : ");
       groceryList.displayItems();

        double total = groceryList.calculateTotalCost();
        System.out.println("Total cost of groceries: $" + total);

        //Test categories
        System.out.println("\n--- Display Fruits Category ---");
        groceryList.displayByCategory("Fruits");

        System.out.println("\n--- Display Dairy Category ---");
        groceryList.displayByCategory("Dairy");

        // Test quantity updates
        System.out.println("\n--- Update Quantity ---");
        groceryList.updateQuantity("Bread", 4); // update existing
        groceryList.updateQuantity("Tomato", 2); // item not in list

        System.out.println("\n--- Available Items After Update ---");
        groceryList.displayAvailableItems();

        double updatedTotal = groceryList.calculateTotalCost();
        System.out.println("Updated total cost: $" + updatedTotal);
    }
}
