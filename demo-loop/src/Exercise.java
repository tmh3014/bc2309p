public class Exercise {
    public static void main (String [] args) {
        // sum of 1,2,3,4,5,6,7,8,9,10
        int sum = 0;
        for (int i = 1; i < 11; i++) { // 今次不是count次數，所以不用由零開始也可以
            sum += i;

        }
        System.out.println(sum); // 55

        // sum of 2,4,6,8,10
        // for loop, if
        int sum1 = 0;
        for (int i = 1; i < 11; i++ ) {
            if (i % 2 == 0) {
                sum1 += i;
            }

        }
        System.out.println(sum1); // 30

        // 1 - 1000
        // 1 - 300 (add all even numbers)
        // 300 - 699 (add all odd numbers)
        // 700 - 1000 (add all numbers can be divided by 3)

        int s = 0;
        for (int i = 1; i < 1000; i++) { // 1,2,...,1000
            if (i < 300) {
                if (i % 2 == 0) {
                    s += i;
                }
            
            }  else if (i < 700) {
                if (i % 2 == 1) {
                    s += i;
                }

            }  else {
                if (i % 3 == 0) {
                    s += i;
                }
            }
            System.out.println(s);
        }
    }
}
