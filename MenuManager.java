import java.util.LinkedList;

public class MenuManager {
    private LinkedList<MenuItem> menuItems;

    public MenuManager() {
        this.menuItems = new LinkedList<>();
    }

    public void addMenuItem(String itemName, double price, String description, String category) {
        MenuItem newItem = new MenuItem(itemName, price, description, category);
        menuItems.add(newItem);
    }

    public MenuItem getMenuItem(String itemName) {
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getItemName().equals(itemName)) {
                return menuItem;
            }
        }
        return null;
    }

    public void removeMenuItem(String itemName) {
        MenuItem itemToRemove = null;
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getItemName().equals(itemName)) {
                itemToRemove = menuItem;
                break;
            }
        }
        if (itemToRemove != null) {
            menuItems.remove(itemToRemove);
            System.out.println("Item removed: " + itemName);
        } else {
            System.out.println("Item not found: " + itemName);
        }
    }

    public void displayAllMenuItems() {
        System.out.println("All Menu Items:");
        for (MenuItem item : menuItems) {
            System.out.println("- "+item.getItemId()+". " + item.getItemName() + " (Category: " + item.getCategory() + ", Price: $" + item.getPrice() +
                    ", Description: " + item.getDescription() + ")");
        }
        System.out.println();
    }

    public void displayMenuItemsByCategory(String category) {
        System.out.println("Menu Items in Category '" + category + "':");
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals(category)) {
                System.out.println(item.getItemId()+"- " + item.getItemName() + " (Price: $" + item.getPrice() +
                        ", Description: " + item.getDescription() + ")");
            }
        }
        System.out.println();
    }

    public void searchByName(String itemName) {
        System.out.println("Search Results for '" + itemName + "':");
        for (MenuItem item : menuItems) {
            if (item.getItemName().toLowerCase().contains(itemName.toLowerCase())) {
                System.out.println("- " + item.getItemName() + " (Category: " + item.getCategory() + ", Price: $" + item.getPrice() +
                        ", Description: " + item.getDescription() + ")");
            }
        }
        System.out.println();
    }

    public void searchByNameAndCategory(String itemName, String category) {
        System.out.println("Search Results for '" + itemName + "' in Category '" + category + "':");
        for (MenuItem item : menuItems) {
            if (item.getItemName().toLowerCase().contains(itemName.toLowerCase()) && item.getCategory().equals(category)) {
                System.out.println("- " + item.getItemName() + " (Price: $" + item.getPrice() +
                        ", Description: " + item.getDescription() + ")");
            }
        }
        System.out.println();
    }

    public void filterAbovePrice(double price) {
        System.out.println("Items with Price Above $" + price + ":");
        for (MenuItem item : menuItems) {
            if (item.getPrice() > price) {
                System.out.println("- " + item.getItemName() + " (Category: " + item.getCategory() + ", Price: $" + item.getPrice() +
                        ", Description: " + item.getDescription() + ")");
            }
        }
        System.out.println();
    }

    public void filterBelowPrice(double price) {
        System.out.println("Items with Price Below $" + price + ":");
        for (MenuItem item : menuItems) {
            if (item.getPrice() < price) {
                System.out.println("- " + item.getItemName() + " (Category: " + item.getCategory() + ", Price: $" + item.getPrice() +
                        ", Description: " + item.getDescription() + ")");
            }
        }
        System.out.println();
    }

    public void filterBetweenPrices(double minPrice, double maxPrice) {
        System.out.println("Items with Price Between $" + minPrice + " and $" + maxPrice + ":");
        for (MenuItem item : menuItems) {
            if (item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
                System.out.println("- " + item.getItemName() + " (Category: " + item.getCategory() + ", Price: $" + item.getPrice() +
                        ", Description: " + item.getDescription() + ")");
            }
        }
        System.out.println();
    }
    public LinkedList<MenuItem> getMenuItemsByCategory(String category) {
        LinkedList<MenuItem> itemsInCategory = new LinkedList<>();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                itemsInCategory.add(item);
            }
        }
        return itemsInCategory;
    }
    public void suggestRandomAppetizer() {
        // Retrieve all appetizers from the "Appetizers" category
        LinkedList<MenuItem> appetizers = getMenuItemsByCategory("Appetizers");

        if (appetizers.isEmpty()) {
            System.out.println("Sorry, no appetizers available at the moment.");
        } else {
            // Generate a random suggestion
            int randomIndex = (int) (Math.random() * appetizers.size());
            MenuItem randomAppetizer = appetizers.get(randomIndex);

            System.out.println("Not sure? How about trying our " + randomAppetizer.getItemName() +
                    ". Priced at $" + randomAppetizer.getPrice() + ".");
        }
    }
    public MenuItem getMenuItemById(int itemId) {
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getItemId() == itemId) {
                return menuItem;
            }
        }
        return null;
    }
}
