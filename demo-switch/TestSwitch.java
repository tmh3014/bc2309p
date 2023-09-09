public class TestSwitch {
    public static void main (String [] args) {
        int score = 70;
        char grade = ' ';
        switch(score) { // check if score match anyone of the following class
            case 90:
            grade = 'A';
            System.out.println("case 90");
            break;
            case 80:
            grade = 'B';
            System.out.println("case 80");
            break;
            case 70:
            grade = 'C';
            System.out.println("case 70");
            break;
            case 60:
            grade = 'D';
            break;
            default:
            grade = 'F';

        }
        System.out.println("The grade is " + score);

        // Alternative, if-else

        int score2 = 90;
        char grade2 = ' ';
        if (score2 >= 90) {
            grade2 = 'A';
        } else if (score2 >= 80) { // 80 - 89
            grade2 = 'B';
        } else if (score2 >= 70) { // 70 - 79
            grade2 = 'C';
        }  else if (score2 >= 60) {
            grade2 = 'D';
        } else {
            grade2 = 'F';
        }

        System.out.println("The grade is " + score2);

    }
}
