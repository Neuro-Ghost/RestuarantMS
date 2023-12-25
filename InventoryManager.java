public class InventoryManager {
    private InventoryItem root;

    public InventoryManager() {
        this.root = null;
    }

    // Function to add an item to the inventory
    public void addItem(String itemName, int quantity) {
        root = addItemRecursive(root, itemName, quantity);
    }

    private InventoryItem addItemRecursive(InventoryItem root, String itemName, int quantity) {
        if (root == null) {
            return new InventoryItem(itemName, quantity);
        }

        // Compare the item names to decide the direction in the tree
        int compareResult = itemName.compareTo(root.itemName);

        if (compareResult < 0) {
            root.left = addItemRecursive(root.left, itemName, quantity);
        } else if (compareResult > 0) {
            root.right = addItemRecursive(root.right, itemName, quantity);
        } else {
            // If the item already exists, update the quantity
            root.quantity += quantity;
        }

        return root;
    }

    // Function to search for an item in the inventory
    public InventoryItem searchItem(String itemName) {
        return searchItemRecursive(root, itemName);
    }

    private InventoryItem searchItemRecursive(InventoryItem root, String itemName) {
        if (root == null || root.itemName.equals(itemName)) {
            return root;
        }

        // Compare the item names to decide the direction in the tree
        int compareResult = itemName.compareTo(root.itemName);

        if (compareResult < 0) {
            return searchItemRecursive(root.left, itemName);
        } else {
            return searchItemRecursive(root.right, itemName);
        }
    }

    // Function to display the entire inventory
    public void displayInventory() {
        displayInventoryRecursive(root);
    }

    private void displayInventoryRecursive(InventoryItem root) {
        if (root != null) {
            displayInventoryRecursive(root.left);
            System.out.println("Item: " + root.itemName + ", Quantity: " + root.quantity);
            displayInventoryRecursive(root.right);
        }
    }
    // Functions to display the low stock items from inventory

    public void displayLowStockItems() {
        displayLowStockItemsRecursive(root, 5);
    }

    private void displayLowStockItemsRecursive(InventoryItem root, int threshold) {
        if (root != null) {
            displayLowStockItemsRecursive(root.left, threshold);

            if (root.quantity < threshold) {
                System.out.println("Low Stock Item: " + root.itemName + ", Quantity: " + root.quantity);
            }

            displayLowStockItemsRecursive(root.right, threshold);
        }
    }

}