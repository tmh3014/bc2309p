import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        
        Employee em1 = new Employee(1);
        Employee em2 = new Employee(1);

        Map<Employee, String> map = new HashMap<>();
        map.put(em1, "Jack");
        map.put(em2, "Jack");

        System.out.println(map.size());
    }
}



