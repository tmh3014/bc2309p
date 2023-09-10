public class DemoArray {
    public static void main (String [] args) throws Exception {
        int i1 = 100;
        int i2 = 105;
        int i3 = 108;

        //array
        int[] array; //declaration
        array = new int[3]; //initialization //搵連續3個格仔裝著3個數

        int[] arr = new int[3]; // 0, 1, 2 -> index of the array
        // assign values to array
        // arr[-1] = 99; // array can't be negative
        arr[0] = 100;
        arr[1] = 105;
        arr[2] = 108;
        // arr[3] = 110; // run-time error

        arr[1] = 106; // just like int i = 106, 可以隨時更改
        System.out.println(arr[0]); // 100
        System.out.println(arr[1]); // 106
        System.out.println(arr[2]); // 108

        int o = arr[0]; // arr[0] -> int
        System.out.println(o); // 100
        // arr[1] = 3L; // can't assign long value to int variable

        //declaration array with size 6, and assign value
        arr[0] = 11;
        arr[1] = 21;
        arr[2] = 31;
        arr[3] = 41;
        arr[4] = 51;
        arr[5] = 61;

        int[] arr1 = new int[] {11, 21, 31, 41, 51, 61};
        System.out.println(array.length);



        for(arr[0] = 0; arr[0] < 100; arr[0]++) {
            System.out.println(arr[0]);
        }

        //int[] arr2 = new int[]

       // char[] arr3 = new char

        int[] arr5 = new int[] {100, 99, 1005, 2000};
        arr5[3] = 3000;
        // arr5[4] = 30000; // run-time error 因為沒有第五個數字

        arr5 = new int[] {1, 2, 3, 4, 5};

        



    }
    
}
