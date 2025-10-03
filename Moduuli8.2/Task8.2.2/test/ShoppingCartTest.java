import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    @AfterEach
    public void putSpacesToTerminal() {
        System.out.println("\n");
    }

    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);

        assertEquals(2, cart.getItemCount());
        cart.showItems();

        cart.addItem("Banana", 0.5); // Lisää tuote, jota on jo listassa
        assertEquals(3, cart.getItemCount());
        assertEquals(2.0, cart.calculateTotal(), 0.01); // Kokonaishinta nousi
        cart.showItems();
    }

    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");

        assertEquals(2, cart.getItemCount());
        assertEquals(1.0, cart.calculateTotal(), 0.01);
        cart.showItems();

        cart.removeItem("Apple"); // Poista tuote, joka on jo poistettu
        assertEquals(2, cart.getItemCount());
        assertEquals(1.0, cart.calculateTotal(), 0.01);
        cart.showItems();

        cart.removeItem("Banana"); // Poista tuote, jota on usemapi kappale
        assertEquals(1, cart.getItemCount());
        assertEquals(0.5, cart.calculateTotal(), 0.01);
        cart.showItems();

        cart.removeItem("Banana"); // Poista viimeinen tuote
        assertEquals(0, cart.getItemCount());
        assertEquals(0.00, cart.calculateTotal(), 0.01);
        cart.showItems();
    }

    @Test
    public void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);

        assertEquals(3.25, cart.calculateTotal(), 0.01); // Kolmas parametri on sallittu virhemarginaali (delta)
    }
}
