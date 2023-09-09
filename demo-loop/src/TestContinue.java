public class TestContinue {
    public static void main(String [] args) {
        

    for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        if (i % 2 == 1) {
            continue;
        }
        System.out.println(i);
    }

    String s = "abcd";
    // charAt, for loop. Print a b c d
    for ( int i = 0; i < s.length(); i++) { // i < 4 -> 0,1,2,3
        System.out.println(s.charAt(i));
    
        }
        // what is the position of c? 2
        for ( int i = 0; i < s.length(); i++) { // times of loop
        if (s.charAt(i) == 'c') {
            System.out.println(i);
        }
        }
        // Find the char 'x' , and print the next char of 'x'
        // If not found, print -1
        String s2 = "ijkxyz";
        boolean found = false;
        char target = ' ';
        for (int i = 0; i < s2.length(); i++) {
            // if (s2.charAt(i2) == 'x') {
               //  System.out.println(i2 + 1);
            
            // } if (s2.charAt(i2) != 'a')
            // System.out.println("-1");
            if (s2.charAt(i) == 'x') {
                target = s2.charAt(i + 1);
                found = true;
                break;
            }

            if (found) { // found == true
                System.out.println(target);
            } else {
                System.out.println("-1");
            }
        }
    }
}

