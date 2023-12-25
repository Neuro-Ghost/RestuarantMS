  class InventoryItem {
    String itemName;
    int quantity;
    InventoryItem left, right;

    public InventoryItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.left = this.right = null;
    }
}