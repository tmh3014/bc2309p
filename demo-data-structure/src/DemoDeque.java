import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {
    
    public static void main(String[] args) {
        // Interface (Deque)
        Deque<Customer> customers = new LinkedList<>();
        // Hide the methods of List, it only contains Deque methods
        customers.add(new Customer("Tom"));
        customers.addFirst(new Customer("John"));
        customers.addLast(new Customer("David"));
        customers.add(new Customer("Jason"));
        System.out.println(customers);
        customers.remove(); 
        System.out.println(customers);
        customers.removeFirst();
        customers.removeLast();
        System.out.println(customers);
        customers.push(new Customer("Jenny")); // same as addFirst()
        System.out.println(customers);
        customers.pop(); // same as removeFirst()
        System.out.println(customers);
        customers.peek();

    }

}
