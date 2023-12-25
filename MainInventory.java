public class MainInventory {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        // Adding items to the inventory
        inventoryManager.addItem("Filet Mignon", 20);
        inventoryManager.addItem("Crab", 30);
        inventoryManager.addItem("Pineapple", 35);
        inventoryManager.addItem("Coconut", 4);
        inventoryManager.addItem("Lemon", 45);
        inventoryManager.addItem("Mango", 30);
        inventoryManager.addItem("Chai", 20);
        inventoryManager.addItem("Blackberry", 40);
        inventoryManager.addItem("Lobster", 25);
        inventoryManager.addItem("Truffle Butter", 15);
        inventoryManager.addItem("Scallops", 18);
        inventoryManager.addItem("Duck", 12);
        inventoryManager.addItem("Salmon", 25);
        inventoryManager.addItem("Mushroom", 20);
        inventoryManager.addItem("Crab", 71);
        inventoryManager.addItem("Onion", 99);
        inventoryManager.addItem("Avocado", 5);
        inventoryManager.addItem("Eggs", 100);

        // Displaying the entire inventory
        System.out.println("Full Inventory:");
        inventoryManager.displayInventory();

        // Searching for an item
        String searchItemName = "Lobster";
        InventoryItem searchedItem = inventoryManager.searchItem(searchItemName);
        if (searchedItem != null) {
            System.out.println("\nSearching for '" + searchItemName + "': Found - Quantity: " + searchedItem.quantity);
        } else {
            System.out.println("\nSearching for '" + searchItemName + "': Not Found");
        }

        // Displaying low stock items
        System.out.println("\nLow Stock Items:");
        inventoryManager.displayLowStockItems();
    }
}
