import java.math.BigDecimal;
import java.util.ArrayList;

public class Customer {

    private String name;
    
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public boolean add(Order order) {
        return this.orders.add(order);
    }

    public boolean isVip() {
        // >= 2 order && order total > 50
        return this.orders.size() >= 2 && totalOrderAmount() > 50.0;
    }

    public double totalOrderAmount() {
        BigDecimal totalOrderAmount = BigDecimal.valueOf();
    }

    public static void main(String[] args) {
        Customer customer = new Customer("John");
        Order order = new Order();
        order.add(new OrderItem(3, 3.4));
        order.add(new OrderItem(9, 1.5));
        customer.add(order);
        System.out.println(customer.totalOrderAmount()); // 23.7
        System.out.println(customer.isVip()); // false

        Order order2 = new Order();
        order2.add(new OrderItem(5, 3.4));
        order2.add(new OrderItem(10, 1.5));
        customer.add(order2);
        System.out.println(customer.totalOrderAmount()); // 55.7
        System.out.println(customer.isVip()); // true
    }
}
