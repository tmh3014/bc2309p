import java.util.Arrays;

public class DemoArray2 {
    public static void main(String[] args) {
        //
        int[] arr = new int[] {10, 4, 2, 100, -3};
        // [-3, 2, 4, 10, 100] -> ascending order sorting
        int max = Integer.MIN_VALUE; // max = -1
        int idx = -1;
        int temp = -1; //TBC.
        for (int i = arr.length - 1; i >= 1; i--) {
            max = -1;
            for (int j = i; j >= 0; j--) {
                if (arr[j] > max) {
                max = arr[j];
                idx = j;
            }
        }
            // swap ...
            if (i != idx) {
                temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
            }
            System.out.println(Arrays.toString(arr));
        }
    

    public static int[] bubbleSort(int[] arr) {
        int max = Integer.MIN_VALUE; // max = -1
        int idx = -1;
        int temp = -1; //TBC.
        for (int i = arr.length - 1; i >= 1; i--) {
            max = -1;
            for (int j = i; j >= 0; j--) {
                if (arr[j] > max) {
                max = arr[j];
                idx = j;
            }
        }
            // swap ...
            if (i != idx) {
                temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
    }
    }
    }
