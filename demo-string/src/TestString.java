public class TestString {
    public static void main (String [] args) {
        String str = "abc";
        // equals() -> method
        // String can use methods e.g. equals
        if ("abc".equals(str)) {
            System.out.println("it is abc");
        }
        boolean result = "abc".equals(str);
        if (result) { // if (result == true)
            System.out.println("it is abc");

        }
        if ("abc".length() == 3) {
            System.out.println("length = 3");
        }
        if (str.length() == 3) {
            System.out.println("length = 3"); // .length可以比較數字
        }

        // str -> "abc", 'a' at position [0]
        // 'b' at position [1]
        // 'c' at position [2]
        // no position [3]
        if (str.charAt(0) == 'a') {
            System.out.println("charAt 0 in String str is a");
        }
        if (str.charAt(1) == 'b' || str.length() < 3) { // true
            System.out.println("ok");
        }

        float f1 = 100.3f;
        long l1 = 22000000000L; // exceed limit
        double d1 = 1.0; // 1.0d
        byte b1 = 127;
        short b2 = 32000; // convert int 32000 to short 32000
        // assign short 32000 to s1;
        short s1 = 32000;

        



    }
}
