import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
public class Order {
    private final int orderId;
    private LinkedList<MenuItem> items;
    private  LocalDateTime timestamp;

    public Order(int orderId, LinkedList<MenuItem> items) {
        this.orderId = orderId;
        this.items = items;
        this.timestamp = LocalDateTime.now();
    }

    public int getOrderId() {
        return orderId;
    }


    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (MenuItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void addMenuItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    public void displayOrderItems() {
        System.out.println("Order ID: "+this.getOrderId());
        System.out.println("Order Items:");

        if (!items.isEmpty()) {
            for (MenuItem item : items) {
                System.out.println("- " + item.getItemName() + " (Price: $" + item.getPrice() + ")");

            }
            System.out.println("Total Price: $" + calculateTotalPrice());
            System.out.println("Order Placed at: "+this.timestamp);
        } else {
            System.out.println("No items in the order.");
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + " TotalPrice: $" + calculateTotalPrice();
    }

    public LinkedList<MenuItem> getItems() {
        return items;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime time) {
        this.timestamp =time;
    }
}
