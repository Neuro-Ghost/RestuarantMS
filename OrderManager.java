import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

public class OrderManager {
    private Queue<Order> orders;

    public OrderManager() {
        this.orders = new LinkedList<>();
    }

    public void addOrder(int orderId, LinkedList<MenuItem> items) {
        Order newOrder = new Order(orderId, items);
        newOrder.setTimestamp(LocalDateTime.now()); // Set the current timestamp
        orders.add(newOrder);
        System.out.println("Order added: ");
        newOrder.displayOrderItems();
    }

    public void displayOrders() {
        System.out.println("Current Orders:");
        for (Order order : orders) {
            order.displayOrderItems();
        }
        System.out.println();
    }

    public void deleteOrder(int orderId) {
        Order orderToRemove = null;
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                orderToRemove = order;
                break;
            }
        }
        if (orderToRemove != null) {
            orders.remove(orderToRemove);
            System.out.println("Order removed: " + orderToRemove);
        } else {
            System.out.println("Order not found: " + orderId);
        }
    }
}
