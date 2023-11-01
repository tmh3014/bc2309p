public class Test1 {
    
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hell";
        String str3 = str2 + "o";
        System.out.println(str1);
        System.out.println(str3);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

        String str4 = new String("hello").intern();
        String str5 = "hello";
        System.out.println(str4);

        Integer i1 = 127;
        Integer i2 = 128;
        Integer i3 = 127;
        System.out.println(i1 == i3);
        Integer i4 = 128;
        System.out.println(i2 == i4);

        StringBuilder sb = new StringBuilder("Hello, world");
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (!Character.isLetter(c) || Character.isWhitespace(c)) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        String result = sb.toString();
        System.out.println(result);

    }
}
