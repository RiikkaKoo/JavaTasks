
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Double> items = new HashMap<>();
    private Map<String, Integer> itemCount = new HashMap<>();

    public ShoppingCart() {
    }

    public void showItems() {
        System.out.println("\nShopping cart: ");
        for (Map.Entry<String, Double> item : items.entrySet()) {
            System.out.println("Item: " + item.getKey() + " x" + itemCount.get(item.getKey()) + ", Cost: " + item.getValue() + " per item.");
        }
    }


    public void addItem(String item, double cost) {
        if (itemCount.containsKey(item)) {
            System.out.println("Item already in the cart.");
            itemCount.put(item, itemCount.get(item)+1);
        } else {
            System.out.println("Adding item");
            items.put(item, cost);
            itemCount.put(item, 1);
        }
    }

    public int getItemCount() {
        int count = 0;
        for (Map.Entry<String, Integer> item : itemCount.entrySet()) {
            count += item.getValue();
        }
        return count;
    }

    public void removeItem(String item) {
        if (itemCount.containsKey(item)) {
            int count = itemCount.get(item);
            if (count == 1) {
                itemCount.remove(item);
                items.remove(item);
            }
            else {
                itemCount.put(item, itemCount.get(item)-1);
            }
        } else {
            System.out.println("No item in the cart.");
        }
    }

    public double calculateTotal() {
        double cost = 0;
        for (Map.Entry<String, Double> item : items.entrySet()) {
            cost += (item.getValue() * itemCount.get(item.getKey()));
        }
        System.out.println("Total cost: " + cost);
        return cost;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.0);
        cart.showItems();
        cart.addItem("Apple", 1.0);
        cart.showItems();
        System.out.println("Totel cost: " + cart.calculateTotal());
    }
}
