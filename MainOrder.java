import java.util.Scanner;
import java.util.LinkedList;
public class MainOrder {
    public static void main(String[] args) {
        MenuManager menuManager = new MenuManager();
        OrderManager orderManager = new OrderManager();
        Scanner scanner = new Scanner(System.in);
        // Adding menu items for Drinks category
        menuManager.addMenuItem("Sparkling Raspberry Lemonade", 3.99, "Refreshing blend of raspberries and lemonade with sparkling water", "Drinks");
        menuManager.addMenuItem("Cucumber Mint Cooler", 4.49, "Cooling cucumber mixed with fresh mint for a crisp and revitalizing drink", "Drinks");
        menuManager.addMenuItem("Pineapple Basil Smash", 5.99, "A tropical twist with pineapple and basil, perfect for a summer day", "Drinks");
        menuManager.addMenuItem("Blueberry Lavender Lemonade", 4.99, "Lemonade infused with blueberries and a hint of soothing lavender", "Drinks");
        menuManager.addMenuItem("Ginger Turmeric Elixir", 5.49, "A health-packed elixir with the goodness of ginger and turmeric", "Drinks");
        menuManager.addMenuItem("Hibiscus Rose Iced Tea", 3.99, "Iced tea infused with hibiscus and a touch of fragrant rose petals", "Drinks");
        menuManager.addMenuItem("Mango Tango Smoothie", 5.99, "A vibrant and fruity smoothie featuring the goodness of ripe mangoes", "Drinks");
        menuManager.addMenuItem("Chai Latte Supreme", 4.49, "Rich and creamy chai latte with a blend of exotic spices", "Drinks");
        menuManager.addMenuItem("Blackberry Sage Lemon Fizz", 5.49, "A fizzy concoction of blackberries, sage, and zesty lemon", "Drinks");
        menuManager.addMenuItem("Coconut Pineapple Paradise", 6.99, "A tropical delight with coconut and pineapple, served in a chilled glass", "Drinks");

        // Adding menu items for Main Dish category
        menuManager.addMenuItem("Truffle Butter Lobster Risotto", 18.99, "Creamy lobster risotto infused with truffle butter for a luxurious dining experience", "Main Dish");
        menuManager.addMenuItem("Filet Mignon with Red Wine Reduction", 21.99, "Tender filet mignon cooked to perfection, drizzled with a rich red wine reduction", "Main Dish");
        menuManager.addMenuItem("Pan-Seared Scallops with Lemon Beurre Blanc", 19.99, "Scallops delicately seared and served with a velvety lemon beurre blanc sauce", "Main Dish");
        menuManager.addMenuItem("Crispy Duck Confit with Orange Glaze", 20.49, "Duck confit slow-cooked to crisp perfection, glazed with a sweet and tangy orange sauce", "Main Dish");
        menuManager.addMenuItem("Pesto Grilled Salmon with Sun-Dried Tomato Quinoa", 17.99, "Grilled salmon topped with pesto, served over a bed of sun-dried tomato-infused quinoa", "Main Dish");
        menuManager.addMenuItem("Vegetarian Truffle Mushroom Risotto", 16.99, "Creamy truffle-infused mushroom risotto, a delightful option for vegetarians", "Main Dish");
        menuManager.addMenuItem("Chicken Marsala with Wild Mushroom Medley", 18.49, "Tender chicken breast cooked in a Marsala wine sauce, accompanied by a wild mushroom medley", "Main Dish");
        menuManager.addMenuItem("Shrimp and Saffron Paella", 19.99, "Classic Spanish paella with succulent shrimp and aromatic saffron-infused rice", "Main Dish");
        menuManager.addMenuItem("Grilled Vegetable Stack with Balsamic Glaze", 16.49, "Layers of grilled vegetables stacked high, drizzled with a balsamic glaze", "Main Dish");
        menuManager.addMenuItem("Lobster Ravioli in Champagne Cream Sauce", 20.99, "Delicate lobster-filled ravioli served in a luxurious champagne-infused cream sauce", "Main Dish");

        // Adding menu items for Appetizers category
        menuManager.addMenuItem("Prosciutto-Wrapped Melon Bites", 8.99, "Sweet melon wrapped in salty prosciutto, a delightful combination of flavors", "Appetizers");
        menuManager.addMenuItem("Caprese Salad Skewers", 7.49, "Cherry tomatoes, fresh mozzarella, and basil drizzled with balsamic glaze on skewers", "Appetizers");
        menuManager.addMenuItem("Crispy Calamari with Lemon Aioli", 9.99, "Lightly battered calamari rings served with a zesty lemon aioli for dipping", "Appetizers");
        menuManager.addMenuItem("Stuffed Mushrooms with Garlic Herb Cream Cheese", 8.49, "Mushroom caps filled with a savory cream cheese mixture, baked to perfection", "Appetizers");
        menuManager.addMenuItem("Brie and Cranberry Phyllo Cups", 7.99, "Flaky phyllo cups filled with creamy Brie cheese and tangy cranberry compote", "Appetizers");
        menuManager.addMenuItem("Spinach Artichoke Dip with Pita Chips", 9.49, "A classic blend of spinach and artichokes in a creamy dip, served with crispy pita chips", "Appetizers");
        menuManager.addMenuItem("Bruschetta with Tomato and Basil", 7.99, "Toasted baguette slices topped with diced tomatoes, fresh basil, and a drizzle of olive oil", "Appetizers");
        menuManager.addMenuItem("Cheese and Charcuterie Board", 10.99, "A carefully curated selection of artisanal cheeses and cured meats, served with accompaniments", "Appetizers");
        menuManager.addMenuItem("Cajun Shrimp Skewers", 9.99, "Skewers of shrimp seasoned with Cajun spices, grilled to perfection", "Appetizers");
        menuManager.addMenuItem("Avocado Egg Rolls with Chipotle Ranch", 8.49, "Crispy egg rolls filled with avocado, sun-dried tomatoes, and cilantro, served with chipotle ranch dipping sauce", "Appetizers");

        // Adding menu items for Desserts category
        menuManager.addMenuItem("Chocolate Fondant with Raspberry Coulis", 7.99, "Decadent chocolate fondant with a luscious raspberry coulis center", "Desserts");
        menuManager.addMenuItem("Lemon Blueberry Cheesecake", 6.99, "Creamy cheesecake infused with the bright flavors of lemon and blueberries", "Desserts");
        menuManager.addMenuItem("Pistachio Rosewater Tiramisu", 8.49, "A unique twist on tiramisu, featuring layers of pistachio and rosewater-infused goodness", "Desserts");
        menuManager.addMenuItem("Mango Coconut Panna Cotta", 7.49, "Smooth and creamy coconut panna cotta topped with fresh mango compote", "Desserts");
        menuManager.addMenuItem("Red Velvet Molten Lava Cake", 7.99, "Indulgent red velvet molten lava cake with a gooey chocolate center", "Desserts");
        menuManager.addMenuItem("Black Forest Parfait", 6.49, "Layers of chocolate cake, cherry compote, and whipped cream in a delightful parfait", "Desserts");
        menuManager.addMenuItem("Hazelnut Praline Profiteroles", 8.99, "Light and airy profiteroles filled with hazelnut praline cream, drizzled with chocolate", "Desserts");
        menuManager.addMenuItem("Tropical Fruit Tarte Tatin", 7.99, "A tropical twist on the classic tarte Tatin, featuring caramelized fruits on a buttery crust", "Desserts");
        menuManager.addMenuItem("Matcha Green Tea Mochi Ice Cream", 6.99, "Chewy mochi encasing a scoop of rich matcha green tea ice cream", "Desserts");
        menuManager.addMenuItem("Cherry Almond Bakewell Tart", 8.49, "A delightful tart with almond frangipane, cherry compote, and a buttery crust", "Desserts");



        System.out.println("Welcome to Bazalt! We're delighted to have you.");

        for (int userId = 1; userId <= 5; userId++) {
            System.out.println("\nWelcome User " + userId + "!");

            // Display items in fixed categories
            System.out.println("Displaying Main Dish Items:");
            menuManager.displayMenuItemsByCategory("Main Dish");

            System.out.println("Displaying Appetizer Items:");
            menuManager.displayMenuItemsByCategory("Appetizers");

            System.out.println("Displaying Drink Items:");
            menuManager.displayMenuItemsByCategory("Drinks");

            System.out.println("Displaying Dessert Items:");
            menuManager.displayMenuItemsByCategory("Desserts");

            LinkedList<MenuItem> userOrderItems = new LinkedList<>();

            // Ask user to add items to their order by selecting the item IDs
            int selectedItemId;
            do {
                System.out.print("Enter the ID of the item you want to add to your order (-1 to finish): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid item ID.");
                    scanner.next(); // Consume the invalid input
                }

                selectedItemId = scanner.nextInt();

                if (selectedItemId != -1) {
                    // Get the menu item by ID and add it to the order
                    MenuItem selectedMenuItem = menuManager.getMenuItemById(selectedItemId);
                    if (selectedMenuItem != null) {
                        userOrderItems.add(selectedMenuItem);
                        System.out.println(selectedMenuItem.getItemName() + " added to your order.");
                    } else {
                        System.out.println("Invalid item ID. Please try again.");
                    }
                }

            } while (selectedItemId != -1);

            // Create and display the order
            orderManager.addOrder(userId, userOrderItems);
        }

        // Display all orders at the end
        orderManager.displayOrders();

        // Close the scanner
        scanner.close();
    }
}