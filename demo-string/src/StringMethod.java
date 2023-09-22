public class StringMethod {
    public static void main (String[] args) {
        String s1 = "hello world";
        System.out.println(s1.substring(1, 7)); // "ello w" (index of w = 6)
        System.out.println(s1.substring(2)); // "llo world"
        
        String s2 = "";
        String s3 = " ";
        String s4 = "hello";
        if(!s2.isBlank())
            System.out.println("s2 is not blank"); // no print
        if(!s3.isBlank())
            System.out.println("s3 is not blank"); // no print
        if(!s4.isBlank())
            System.out.println("s4 is not blank");  // print

        String[] strings = new String[] {"Hello", "HELLO", "hello", "hello ", 
            "world", " hello! "};
        // How many "hello" here? ignore case and ignore space
        int count = 0;
        for (String s : strings) {
            if(s.trim().toLowerCase().equals("hello"))
            count++;
        }
        System.out.println("count=" + count);
    }
}
