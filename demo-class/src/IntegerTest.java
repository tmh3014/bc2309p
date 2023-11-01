public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = 127; // auto-box from int to Integer
        System.out.println(i1.equals(127)); // if you want to compare the value of i1
        System.out.println(i1 == 127); // true

        Integer i2 = 128;
        System.out.println(i2 == 128); // true

        Integer i3 = 127;
        System.out.println(i1 == i3); // true

        Integer i4 = 128;
        System.out.println(i2 == i4); // false

        // Internal Cache (Byte, Short, Integer, Long), only applies to -128 to 127


        // Integer: valueOf vs new
        Integer i5 = 5;
        Integer i6 = new Integer(5); // diff
        Integer i7 = Integer.valueOf(5); // diff
        Integer i8 = Integer.valueOf(5); // i8 will reuse the object of i7

        Long l1 = 3L;
        Long l2 = Long.valueOf(3); // upcast int -> long -> Long

        Short s1 = Short.valueOf("3");
        Short s2  Short.valueOf((short)3);

        Double.valueOf(3.4f); // float -> double -> Double
        float f1 = Float.valueOf((float) 3.5d);

    }
}
