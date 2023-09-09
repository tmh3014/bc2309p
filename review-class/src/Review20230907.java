public class Review20230907 {
    public static void main (String [] args) {
        char a = 'A';
        System.out.println("The grade is = " + a);

        int age = 25;
        System.out.println("I'm " + age + " years old.");

        double price = 9.89;
        String item = "book";
        System.out.println("This " + item + " costs " + price);

        boolean isJavafun = true;
        System.out.println("Is Java fun? " + isJavafun);

        String str = "Jackie Chan";
        System.out.println(str.length());

        String str1 = "abc";
        String str2 = "abc";
        String str3 = "xyz";
        // System.out.println(str1.equals(str2));
        // System.out.println(str2.equals(str3));
        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        System.out.println(isEqual1);
        System.out.println(isEqual2);

        String str4 = "Happy";
        char ch = str4.charAt(0);
        //char ch1 = str4.charAt(1);
        //char ch2 = str4.charAt(2);
        //char ch3 = str4.charAt(3);
        //char ch4 = str4.charAt(4);
        //char ch5 = str4.charAt(5);
        System.out.println(ch);

        //int x = 5;
        //int y = 10;
        //boolean result1 = x > y;
        //System.out.println(result1);
        //boolean result2 = x <= y;
        //System.out.println(result2);
        //boolean result3 = x != y;
        //System.out.println(result3);

        int x = 5;
        int y = (++x + 3) * ++x;
        System.out.println(y);

        String searchMe = "peter piper picked a peck of pickled peppers";
        int num = 0;

        for (int i = 0; i < searchMe.length(); i++) {
            if (searchMe.charAt(i) != 'p'){
                continue;
            }
            num++; // 如果無呢句結果會等於 0
        }
       System.out.println("Found " + num + " p's in the string");






    }
}
