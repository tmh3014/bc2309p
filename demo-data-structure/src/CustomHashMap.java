import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class CustomHashMap {
    public static void main(String[] args) {
        Map<Integer, OrderItem> itemMap = new HashMap<>();
        itemMap.put(1, new OrderItem(3, 4.5));
        itemMap.put(2, new OrderItem(4, 4));
        itemMap.put(3, new OrderItem(2, 7.5));

        OrderItem orderItem = itemMap.get(3);
        System.out.println(orderItem.getUnitPrice()); // 7.5

        Map<Customer, List<Order>> cusMap = new HashMap<>();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("John");
        cusMap.put(c1, List.of(new Order(), new Order()));
        cusMap.put(c2, List.of(new Order(), new Order(), new Order()));
        System.out.println(cusMap.size()); // 1
        System.out.println(cusMap.get(c1).size()); // 3
        System.out.println(cusMap.get(c1).size()); // 3


    }

}
