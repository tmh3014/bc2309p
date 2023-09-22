public class App {
    public static void main(String[] args) throws Exception {

        //Primitives - byte, short, int, long, float, double, char, boolean
        //String
        //Wrapper class - Byte, Short, Integer, Long, Float, Double, Character, Boolean

        //Conversion between Primitives and Wrapper class
        short s1 = 10;
        int i1 = s1; // upcast
        Integer i11 = i1; // auto-boxing or auto-box
        int i2 = i11; // un-box

        //error, cannot direct assign short variable to Integer directly
        // Integer i12 = s1;
       Integer i12 = (int) s1; // short (cast) -> int (auto-box) -> Integer

        boolean b1 = true;
        Boolean b11 = b1; //auto-box

        char c1 = 'u';
        Character c11 = c1; // auto-box

        Float f11 = 9.3f; // auto-box, 9.3f is a float value
        Integer i13 = 100; // auto-box, 100 is a int value
        Long l11 = 5L; // auto-box, 5L is a long value
        Double d11 = 8.3d;

        // Wrapper class has null value (default value)
        // Primitves has default value, int -> 0, double -> 0.0, boolean -> false, char -> '\u0000'
        // String default value is null as well
        Integer i15 = 4;
        System.out.println(i15);
        i15 = null;
        System.out.println(i15);
        Short s15 = 4;
        System.out.println(s15);
        s15 = null;
        System.out.println(s15);

        Integer i16 = 8; //new Integer(8);
        Integer i17 = new Integer(8);
        System.out.println(i16.equals(i17)); // comparing the values -> true
        System.out.println(i16.compareTo(8)); // 0
        System.out.println(i16.compareTo(9));  // -1, less than 9
        System.out.println(i16.compareTo(7)); // 1, larger than 7
        System.out.println(i16 > 7); // true, 不過不建議用呢個寫，除非make sure呢個7係hard code 7
        System.out.println(i16 == 8); // comparing Integer and int, Integer i16 will be unboxed




    }
}
