public class Test1 {
    
    class Solution {
        public String finalString(String s) {
            // StringBuilder sb = new StringBuilder();
            String str = "";
            for (int i = 0; i < s.length(); i++) {
            if (isFaultyChar(s.charAt(i)))
                // sb.reverse();
                System.out.println(str);
                // str = reverse(str);
                else
                // sb.append(s.charAt(i));
                str = str.concat(String.valueOf(s.charAt(i)));
            }
            // return sb.toString();
            return str;
        }
            public static boolean isFaultyChar(char c) {
                return c == 'i';
            }

            public static String reverse(String str) {
                char[] chars = str.toCharArray();
                char temp = ' ';
                // swap
                for (int i = 0; i < str.length() / 2; i++) {
                    temp = chars[i];
                    chars[i] = chars[chars.length -1 -i];
                    chars[chars.length - 1 - i] = temp;
                }
                return String.valueOf(chars);
            }
    }
}
