public class MenuItem {
    private static int nextItemId = 1;
    private int itemId;
    private String itemName;
    private double price;
    private String description;
    private String category;

    public MenuItem(String itemName, double price, String description, String category) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.itemId = nextItemId++;
    }
    public int getItemId() {
        return itemId;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
