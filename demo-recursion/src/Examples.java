public class Examples {
    // when x = 5, return 5 + 4 + 3 + 2 + 1
    public static int sum(int x) {
        if (x == 1)
        return 1;
        return x + sum(x - 1); 
        // return 5 + sum(4)
        // return 4 + sum(3)
        // return 3 + sum(2)
        // return 2 + sum(1)
    }
    public static void main(String[] args) {
       System.out.println(Examples.sum(10)); // 10
       System.out.println(Examples.sum(5)); // 5
    }
}
