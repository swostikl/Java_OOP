package task3;

import java.util.ArrayList;

class Item {
    String name;
    double cost;
    String category;

    public Item(String name, double cost, String category) {
        this.name = name;
        this.cost = cost;
        this.category = category;
    }
}

public class CategorizingItems {

    private final ArrayList<Item> groceryList;

    public CategorizingItems() {
        groceryList = new ArrayList<>();
    }

    // Add item with category
    public void addItem(String name, double cost, String category) {
        Item item = new Item(name, cost, category);
        groceryList.add(item);
        System.out.println("Added: " + name + " ($" + cost + ") in category: " + category);
    }

    // Display all items
    public void displayItems() {
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            System.out.println("Grocery List:");
            int i = 1;
            for (Item item : groceryList) {
                System.out.println(i + ". " + item.name + " - $" + item.cost + " (" + item.category + ")");
                i++;
            }
        }
    }

    // Display items by category
    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);
        boolean found = false;
        int i = 1;
        for (Item item : groceryList) {
            if (item.category.equalsIgnoreCase(category)) {
                System.out.println(i + ". " + item.name + " - $" + item.cost);
                i++;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found in this category.");
        }
    }

    // Check if an item exists
    public void checkItem(String name) {
        for (Item item : groceryList) {
            if (item.name.equalsIgnoreCase(name)) {
                System.out.println(name + " is in the grocery list.");
                return;
            }
        }
        System.out.println(name + " is not in the grocery list.");
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (Item item : groceryList) {
            total += item.cost;
        }
        return total;
    }

    // Remove an item
    public void removeItem(String name) {
        Item toRemove = null;
        for (Item item : groceryList) {
            if (item.name.equalsIgnoreCase(name)) {
                toRemove = item;
                break;
            }
        }
        if (toRemove != null) {
            groceryList.remove(toRemove);
            System.out.println("Removed: " + name);
        } else {
            System.out.println("Item " + name + " not found.");
        }
    }


    // main method displaying all items in specified category
    public static void main(String[] args) {
        CategorizingItems groceryList = new CategorizingItems();

        groceryList.addItem("Apple", 1.5, "Fruits");
        groceryList.addItem("Milk", 2.0, "Dairy");
        groceryList.addItem("Cheese", 3.5, "Dairy");
        groceryList.addItem("Cake", 1.2, "Bakery");
        groceryList.addItem("Banana", 1.0, "Fruits");

        groceryList.checkItem("Apple");

        System.out.println();
        groceryList.displayItems();

        System.out.println();
        groceryList.displayByCategory("Fruits");

        System.out.println();
        groceryList.displayByCategory("Dairy");

        System.out.println();
        groceryList.displayByCategory("bakery");


    }
}
