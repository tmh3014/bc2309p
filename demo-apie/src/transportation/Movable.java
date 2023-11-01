package transportation;

public interface Movable { // 合約, contract

    // implicitly "public static final"
    String name = "Car";

    // all methods in interface are implicitly "public abstract" (By default)
    Movable move(); // move() -> method signature, only moethod signature is needed in a method signature

    void accelerate();

    // after java 8 - 2014
    // implicitly public (instance method) , but not static
    default void printWinner(String name) {
        System.out.println(name + " is Winner.");
    }

    // implicitly public (static method)
    static void staticPrintWinner (String name) {
        System.out.println(name + " is Winner.");
    }
    
}
