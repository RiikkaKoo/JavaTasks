public class Item {
    private String itemName;
    private  String itemCategory;
    private double itemCost;
    private int itemQuantity;

    public Item(String name, String category, double cost, int q) {
        this.itemName = name;
        this.itemCategory = category;
        this.itemCost = cost;
        this.itemQuantity = q;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getItemCategory() {
        return this.itemCategory;
    }

    public double getItemCost() {
        return this.itemCost;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int newQuantity) {
        this.itemQuantity = newQuantity;
    }
}
