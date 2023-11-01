public class TestNumber {
    public static void main(String[] args) {
        Object x = 1000;
        Integer x2 = 100; // Integer.class extends Number.class extends Object.class

        Number n = Integer.valueOf(100); // Number is abstract class, can't "new"
        // n = Double.valueOf(10.3d);
        // n = Float.valueOf(10.33f);
        n = Long.valueOf(100);

        if ( n instanceof Integer) {
            Integer integer = (Integer) n;
            System.out.println("Integer:" + integer.intValue());
        } else if (n instanceof Double) {
            Double double2 = (Double) n;
            System.out.println("Double:" + double2.doubleValue());
        } else if (n instanceof Long) {
            Long long2 = (Long) n;
            System.out.println("Long:" + long2.longValue());
        } else if (n instanceof Float) {
            Float float1 = (Float) n;
            System.out.println("Float" + float1.floatValue());
        }


    }
}
