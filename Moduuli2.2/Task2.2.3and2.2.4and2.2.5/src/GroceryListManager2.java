import java.util.HashMap;
import java.util.Map;

public class GroceryListManager2 {
    Map<String, Item> groceryList2 = new HashMap<>();

    public void addItem(String item, String category, double cost, int quantity) {
        if (!groceryList2.containsKey(item)) {
            groceryList2.put(item, new Item(item, category, cost, quantity ));
            //System.out.println(key + " added to the list.");
        } else {
            System.out.println(item + " is already on the list.");
        }
    }

    public void removeItem(String item) {
        if (!groceryList2.containsKey(item)) {
            System.out.println("\nNo " + item + " on the list.");
        } else {
            groceryList2.remove(item);
        }
    }

    public void displayList() {
        int position = 1;
        System.out.println("\nGrocery List: ");
        for (Map.Entry<String, Item> entry : groceryList2.entrySet()) {
            System.out.println(position + ". " + entry.getKey() + " (" + entry.getValue().getItemCategory() + ")"+ " -- "
                    + entry.getValue().getItemQuantity() + " pcs x " + entry.getValue().getItemCost() + "€");
            position++;
        }

    }

    public void displayByCategory(String category) {
        System.out.println("\nItems in \"" + category + "\" category: ");
        for (Map.Entry<String, Item> entry : groceryList2.entrySet()) {
            if (entry.getValue().getItemCategory().equals(category)) {
                System.out.println(entry.getKey() + " -- " + entry.getValue().getItemQuantity()
                        + " pcs x " + entry.getValue().getItemCost() + "€");
            }
        }
    }

    public void displayAvailableItems() {
        System.out.println("\nAvailable items: ");
        for (Map.Entry<String, Item> entry : groceryList2.entrySet()) {
            if (entry.getValue().getItemQuantity() > 0) {
                System.out.println(entry.getKey() + " (" + entry.getValue().getItemCategory() + ")"+ " -- "
                        + entry.getValue().getItemQuantity() + " pcs x " + entry.getValue().getItemCost() + "€");
            }
        }
    }

    public boolean checkItem(String item) {
        return groceryList2.containsKey(item);
    }

    public void updateQuantity(String item, int newQuantity) {
        if (!groceryList2.containsKey(item)) {
            System.out.println("\nNo " + item + " on the list.");
        } else {
            Item updateItem = groceryList2.get(item); // Get the Item2 object from the HashMap with the key (item)
            updateItem.setItemQuantity(newQuantity); // Update the quantity
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Map.Entry<String, Item> entry : groceryList2.entrySet()) {
            totalCost += entry.getValue().getItemCost() * entry.getValue().getItemQuantity();
        }
        return totalCost;
    }

    public static void main(String[] args) {
        GroceryListManager2 manager = new GroceryListManager2(); // Luodaan uusi GroceryListManager olio.

        manager.addItem("Carrots", "Vegetables", 0.19, 5);
        manager.addItem("Potatoes", "Vegetables", 0.09, 10);
        manager.addItem("Eggs", "Eggs", 0.99, 8);
        manager.addItem("Butter", "Dairy", 1.99, 0);
        manager.addItem("Corn", "Vegetables", 0.79, 0);
        manager.addItem("Sugar", "Sugars and sweeteners", 1.75, 1);
        manager.addItem("Cinnamon", "Spices", 0.89, 2);
        manager.addItem("Cinnamon", "Spices", 0.89, 2); // No duplicates
        manager.addItem("Black pepper", "Spices", 0.59, 1);
        manager.addItem("Paprika", "Spices", 0.69, 2);

        manager.displayList();

        System.out.println("\nIs " + '"' + "Sugar" + '"' + " on the list?  " + manager.checkItem("Sugar"));
        System.out.printf("\nThe total cost of the items is: %.2f€\n", manager.calculateTotalCost());

        manager.removeItem("Sugar");
        manager.removeItem("Milk"); // No removing of non-existent items

        manager.displayList();
        System.out.printf("\nThe total cost of the items is: %.2f€\n", manager.calculateTotalCost());

        manager.displayByCategory("Spices");
        manager.displayByCategory("Vegetables");

        manager.updateQuantity("Carrots", 3); // Update "Carrots" quantity from 5 to 3 pcs.
        manager.displayList();

        manager.displayAvailableItems();
    }
}
