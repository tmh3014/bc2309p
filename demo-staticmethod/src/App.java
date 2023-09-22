public class App {
    public static void main(String[] args) { // static method, JVM -> static method main
    int x = 2;
    for (int i = 0; i < 10; i++) {
        x *= 2;
    }
    x = 10;
    for (int i = 0; i < 10; i++) {
        x *= 2;
    }
    int result = add(2, 3);
    System.out.println(result);
    result = add(10, 1000);
    System.out.println(result);
    short r = sum(5, 8);
    System.out.println(r);

    }

    // first int -> return type
    // add -> method name
    // (int x, int y) -> parameters
    public static int add(int x, int y) { // x= 2, y = 3
       int result = x + y;
       return result;
    } 
    // min = 5, max = 8, sum = 5 + 6 + 7 + 8 = 26
    public static short sum(int min, int max) {
        int total = 0;
        for (int i = min; i <= max; i++) {
            total += i;
        }
        return (short) total; // down-cast

    }
}


// terminal command: ls, cd, javac App.java -> 將App.java增加一個file叫 App.class, java App -> run App呢個program