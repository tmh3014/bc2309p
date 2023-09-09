public class TestString2 {
    public static void main (String [] args) {
        String str1 = "abcd";
        String str2 = "xcyz";
        // print true / false
        // Question: check if two Strings have a common character
        boolean common = false;
       outerLoop: for (int i = 0; i < str1.length(); i++) {
        // i = 0
        for (int j = 0; j < str2.length(); j++) {
            // str1.charAt(i) -> a
            if (str1.charAt(i) == str2.charAt(j)) {
                common = true;
                // break; // break inner loop
                break outerLoop; // break outer loop
            }
        }
       }
       System.out.println(common);
            }
        }
