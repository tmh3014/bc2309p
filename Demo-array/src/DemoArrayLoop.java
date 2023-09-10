public class DemoArrayLoop {
    public static void main (String [] args) {
        int[] nums = new int[4];
        nums[0] = 100;
        nums[1] = 109;
        nums[2] = 1000;
        nums[3] = 1005;
        for (int i = 0; i < 4; i++) { // 0,1,2,3
            System.out.println(nums[i]);
        }

        // nums.length -> 4
        //for (int i = 0; i < nums.length; i++) { // 0,1,2,3
            //System.out.println(nums[i]);
            // }
        // sum
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            System.out.println(sum);

        // Find the max value in the array
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
        if (nums[i] > max) {
            max = nums[i];
        }
        }

        // Find the min value in the array
        int min = 100000;
       // for (int i = 0; i < nums.length; i++); {
       // if (nums[i] < min) {
         //   min = nums[i];

        }
        //System.out.println(min);
        //}

        // Find the average value of the array
        int length = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
       }
       int average = sum / length;
       System.out.println(average);
    }
        }
    

