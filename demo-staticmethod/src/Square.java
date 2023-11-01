public class Square {

    public static short area(int length) { // int can change to short, return (short) (length * length)
        return (short) (length * length); // int * int = must be an int, can up-cast to long, or down-cast to short
        // return a variable, which type should match the method return type
    }

    // practice: Try to design 2 method A & B.
    // You have to call method A, and the method A will reply on Method B for calculation
    // main() -> Method A -> Method B
    
    public static int area2(int length) {
        return length * length; // length * length
    }

    public static double area3(int length) {// 2 * 2 -> 4.0
        return Math.pow(length, 2); // 
    }

    public static int profit(int length) {
        return length * length / (10 * 4) - length;
    }

    public static int max(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        //        max = arr[i];
        //    }
        max = Math.max(arr[i], max);
        }
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(area2(10));; // 100
        System.out.println(Square2.area2(7)); // 49

        int x = 10;
        int area = -1;
        if (x > 8) {
            area = Square2.area2(x);
        } else {
            area = (int) Square2.area3(x);
        }

        // max()
        int[] integers = new int[] {100, 103, 5, 20};
        System.out.println(Square2.max(integers)); // 103
        System.out.println(Square2.max(new int[] {50, 23, 10, 80})); // 80
    }
}
