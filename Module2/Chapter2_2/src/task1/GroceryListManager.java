package task1;

import java.util.ArrayList;

public class GroceryListManager {
    private final ArrayList<String>  groceryList = new ArrayList<>();


    public ArrayList<String> getItems() {

        return groceryList;
    }

    // Adding items
    public void addItem(String item) {
        groceryList.add(item);
        System.out.println("Item added to the list: " + item);
    }

    //removing items
    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("Removing " + item + " from the list");
        } else {
            System.out.println("Item " + item + " is not in the list");
        }
    }

    //displaying the list
    public void displayItems() {
        if (groceryList.isEmpty()) {
            System.out.println("No items in the list");
        } else {
            System.out.println(" Grocery list are :");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        }
    }

    // checking if specific item is present
    public void checkItem(String item) {
        boolean exists = groceryList.contains(item);
        if (exists) {
            System.out.println("Is " + item + " in the grocery list? " + exists);
        } else {
            System.out.println("Is " + item + " not in the grocery list? " + exists);
        }
    }

}

// creating main method in GroceryListManager class to demonstrate the functionality of the methods implemented.

// Add a few items to the grocery list.
// Display the grocery list.
//Check if a specific item is present in the grocery list.
//Remove an item from the grocery list.
//Display the updated grocery list.


class Main{
    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();

        groceryList.addItem("Apple");
        groceryList.addItem("Banana");
        groceryList.addItem("Cheese");

        groceryList.displayItems();

        groceryList.removeItem("Apple");
        groceryList.removeItem("Tomato");

        groceryList.displayItems();

        groceryList.checkItem("Apple");
        groceryList.checkItem("Banana");


        groceryList.displayItems();


    }
}