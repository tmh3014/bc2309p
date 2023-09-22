import java.util.Random;
import java.util.Scanner;

public class Game2 {
    public static void main (String[] args) {
        int min = 1;
        int max = 100;
        int bomb = new Random().nextInt(100) + 1;
        int input = 1;
        int count = 0;

    do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between " + min + "-" + max + ":");
        input = scanner.nextInt();
        if (input < min || input > max) {
            System.out.println("wrong number. Please try again");
            continue;
        }
        count++;
        if (count >= 10 ) {
            System.out.println("No more trials, see you next time");
            break;
        }
        if (input < bomb) {
            min = input + 1;
        } else if (input > bomb) {
            max = input - 1;
        }
    } while (input != bomb);
    System.out.println("Congrats, you got the bomc");
    }
}
