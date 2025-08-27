import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    Map<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, cost);
        } else {
            System.out.println(item + " is already on the list.\n");
        }
    }

    public void removeItem(String item) {
        if (!groceryList.containsKey(item)) {
            System.out.println("No " + item + " on the list.\n");
        } else {
            groceryList.remove(item);
        }
    }

    public void displayList() {
        int position = 1;
        System.out.println("Grocery List: ");
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(position + ". " + entry.getKey() + " -- " + entry.getValue() + "€");
            position++;
        }

    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            totalCost += entry.getValue();
        }
        return totalCost;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager(); // Luodaan uusi GroceryListManager olio.
        manager.addItem("Carrots", 1.25);
        manager.addItem("Eggs", 2.59);
        manager.addItem("Sugar", 1.75);
        manager.addItem("Cinnamon", 0.89);
        manager.addItem("Cinnamon", 0.89); // No duplicates

        manager.displayList();

        System.out.println("\nIs " + '"' + "Sugar" + '"' + " on the list?  " + manager.checkItem("Sugar") + "\n");
        System.out.println("The total cost of the items is: " + manager.calculateTotalCost() + "€\n");

        manager.removeItem("Sugar");
        manager.removeItem("Milk"); // No removing of non-existent items

        manager.displayList();
        System.out.println("The total cost of the items is: " + manager.calculateTotalCost() + "€\n");
    }
}