public class Helloworld {
    // This is a space for any comments
    public static void main(String[] args) {
        // Tool: System.out.println
        System.out.println("Hello!!!");

        String str = "hello";
        System.out.println(str.charAt(0));

        int a = 5;
        int b = a++; // b is 5, a is 6 (post-increment)
        System.out.println(a);
        System.out.println(b);
        int c = ++a; // c is 7, a is 7 (pre-increment)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int d = a++ + ++b; // d is 13, a is 8, b is 6 (a++ is used first, then ++b)
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        int e = ++a + b++; // e is 15, a is 9, b is 7 (++a and b++ are used first, then added)
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);

        int x = 3;
        int y = (x++ + 3) * x++;
        System.out.println(x);
        System.out.println(y);
    }
}
