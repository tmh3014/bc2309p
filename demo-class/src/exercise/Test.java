package exercise;

public class Test {

    public static void main(String[] args) {
        
    int[] integers = {20, 10, 40};
    byte[] bytes = new byte[] {2, 4, 1};
    int score = 0;

    for(int i = 0; i < 3; i++) {
        if (i % 2 == 1) {
            score += integers[i];
        } else {
            score += bytes[i];
        }
        System.out.println(score);

        int a = 1;
        System.out.println(a % 2);

    }


    }

    }

