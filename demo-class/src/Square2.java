public class Square2 {
    
    int length;

    // constructor
    public Square2() {

    }

    //All arguments constructor (arguments -> parameters)
    public Square2(int length) {
        this.length = length;
    }

    //setter
    public void setLength(int length) {
        this.length = length;
    }

    // area
    public int area() {
        return this.length * this.length;
    } 
    
    public static int area(int length) {
        return length * length; // int * int -> int
    }

    public void abc() { // void 唔會return任何野
        System.out.println("hello. this is abc method");
    }

    // method signature cannot be duplicated
    // method signature = method name + parameters
    public static void abc(String s) {
        System.out.println("hello. this is static abc method. " + s);
    }

    public static String abc(String s, String s2) {
        System.out.println("hello. this is static abc method. " + s + s2);
        return s + s2;
    }
    public static void main(String[] args) {
        // new square
        // Approach 1
        Square2 square3 = new Square2(); // empty constructor
        square3.setLength(3); // assign length into the square object
        System.out.println(square3.area()); // 9

        // Approach 2
        Square2 square4 = new Square2(3);
        System.out.println(square4.area()); // 9

        //static method call
        System.out.println(Square2.area(5));

        // revise square2 length -> 7
        square3.setLength(7);
        System.out.println(square3.area());

        //difference between instance and static method
        // Instance method: new object first -> use the instane variable to
        // static method: in -> out, no object

        square.abc();
        square2.abc()l
    }
}
