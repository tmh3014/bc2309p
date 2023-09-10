import java.util.Arrays;

public class Demo2 {
    public static void main (String[] args) {
        int[] nums = new int[5];
        nums[0] = 100;
        nums[1] = 109;
        nums[2] = 1000;
        nums[3] = 1005;
        nums[4] = 1003;
        for (int i = 0; i < nums.length; i++) { // 0,1,2,3
            System.out.println(nums[i]);
        }

        int length = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
       }
       double average = sum / length;
       System.out.println("The average value is " + average);

       // print odd numbers in the array, from the tail of the array
       for (int i = nums.length -1; i >= 0; i--) {
        Arrays.sort(nums);
            if (nums[i] % 2 == 1) {
                    System.out.println(nums[i]);
                }
                
                
            }

            //
            int[] integers = new int[] {100, 3, 10, 5, -100};
            int target = 10;
            // print index of value 10
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] == target) {
                    System.out.println(integers[i]);
                }
            }
            // when found 'o', replace it by z
            // print str 
            // Approach 1
            String str = "Hello world";
            char[] characters = str.toCharArray();
            String newStr = "";
            for (int i = 0; i < characters.length; i++) {
                if (str.charAt(i) == 'o') {
                    newStr += "z";
                } else {
                    newStr += str.charAt(i);
                }
                
            }
            System.out.println(newStr);

            // Approach 2
            for (int i = 0; i < characters.length; i++) {
                if (characters[i] == 'o') {
                    characters[i] = 'z';
                
                }
            }
            System.out.println(String.valueOf(characters)); // char[] -> String

            //String u = String.valueOf(1); // 1 -> "1"

            // Approach 3
            String str2 = "";
            for (int i = 0; i < characters.length; i++) {
                str2 += characters[i];
            }
            System.out.println(str2);
            



            



       }

    }

