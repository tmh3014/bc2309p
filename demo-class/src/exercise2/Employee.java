package exercise2;

public class Employee { // static block -> main -> 如果有constructor就會load返constructor
    
    private String name;

    private static String x;

    static { 
        System.out.println("Step 3.");
        
    }

    {
        System.out.println("Step 1. this is initialization block when you new an object of this class"); // 視乎佢個位置而定，唔係跟static -> main -> constructor呢個次序
        name = "abc";
    }

    public Employee(String name) {
        System.out.println("Step 2. this is constructor");
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        System.out.println("start");
        Employee employee1 = new Employee("John");
        System.out.println(employee1.name);
        System.out.println("end");
    }
}
