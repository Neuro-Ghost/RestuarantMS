import java.util.LinkedList;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        MenuManager menuManager = new MenuManager();

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
        // Displaying all menu items
        menuManager.displayAllMenuItems();
        System.out.println("︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻");
        System.out.println(" ⧉ Welcome to BeirutBazalt! Feel free to navigate through our menu. ⧉");
        System.out.println("︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼");

        // Interactive menu exploration
        int userChoice;
        do {
            // Display menu categories and prompt user
            System.out.println("\n⧉ We offer various categories, select one! (use the numbers)");
            System.out.println("1. Drinks \uD83C\uDF7E");
            System.out.println("2. Main Dish \uD83C\uDF71");
            System.out.println("3. Appetizers \uD83C\uDF58 ");
            System.out.println("4. Desserts\uD83C\uDF70");
            System.out.println("0. I'm not sure, surprise me! \uD83E\uDD14");
            System.out.println("-1. Exit \uD83D\uDD1A");
            // Get user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            userChoice = scanner.nextInt();

            // Process user input
            switch (userChoice) {
                case 1:
                    menuManager.displayMenuItemsByCategory("Drinks");
                    break;
                case 2:
                    menuManager.displayMenuItemsByCategory("Main Dish");
                    break;
                case 3:
                    menuManager.displayMenuItemsByCategory("Appetizers");
                    break;
                case 4:
                    menuManager.displayMenuItemsByCategory("Desserts");
                    break;
                case 0:
                    menuManager.suggestRandomAppetizer();
                    break;
                case -1:
                    System.out.println("Thank you for exploring Bazalt's menu. We hope to serve you soon! \uD83D\uDE0B");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (userChoice != -1);

        int userChoice2;
        Scanner scanner = new Scanner(System.in);
        do {
            // Display menu options and prompt user
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Search by Name");
            System.out.println("2. Search by Name and Category");
            System.out.println("3. Filter Above Price ↗\uFE0F");
            System.out.println("4. Filter Below Price ↘\uFE0F");
            System.out.println("5. Filter Between Prices ↔\uFE0F");
            System.out.println("-1. Exit \uD83D\uDD1A");
            // Get user input
            System.out.print("Enter your choice: ");
            userChoice2 = scanner.nextInt();

            // Process user input
            switch (userChoice2) {
                case 1:
                    // Search by Name
                    System.out.print("Enter item name to search: ");
                    scanner.nextLine(); // Consume newline
                    String itemName = scanner.nextLine();
                    menuManager.searchByName(itemName);
                    break;
                case 2:
                    // Search by Name and Category
                    System.out.print("Enter item name to search: ");
                    scanner.nextLine(); // Consume newline
                    itemName = scanner.nextLine();
                    System.out.print("Enter category to search: ");
                    String category = scanner.nextLine();
                    menuManager.searchByNameAndCategory(itemName, category);
                    break;
                case 3:
                    // Filter Above Price
                    System.out.print("Enter the price threshold: ");
                    double abovePrice = scanner.nextDouble();
                    menuManager.filterAbovePrice(abovePrice);
                    break;
                case 4:
                    // Filter Below Price
                    System.out.print("Enter the price threshold: ");
                    double belowPrice = scanner.nextDouble();
                    menuManager.filterBelowPrice(belowPrice);
                    break;
                case 5:
                    // Filter Between Prices
                    System.out.print("Enter the minimum price: ");
                    double minPrice = scanner.nextDouble();
                    System.out.print("Enter the maximum price: ");
                    double maxPrice = scanner.nextDouble();
                    menuManager.filterBetweenPrices(minPrice, maxPrice);
                    break;
                case -1:
                    System.out.println("Thank you for exploring our program operations.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (userChoice2 != -1);
        // Close the scanner
        scanner.close();
    }
}