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
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) { // 80 - 89
            grade = 'B';
        } else if (score >= 70) { // 70 - 79
            grade = 'C';
        }  else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }



    }
}
