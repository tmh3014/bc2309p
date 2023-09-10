public class DemoConversion {
    public static void main(String [] args) {
        //Primitives
        //upcast(promotion)
        // byte -> short -> int -> long (integer)
        byte b = 10;
        short s = b; // upcast: from byte to short, java不容許downcast
        int i = s;
        long l = i;

        // floar -> double
        float f = 10.323f;
        double d = f; //upcast

        // char -> int, upcast
        char c = 'a'; //in ascii 97
        int w = c; //upcast
        System.out.println(w);

        //char c2 = w; // int range larger than char range -> can't proceed
        
        // downcast
        short s3 = 10;
        byte b3 = (byte) s3; //強行去downcast
        System.out.println(b3); //10

        short s4 = 30000;
        byte b4 = (byte) s4;
        System.out.println(b4); //Java behavior (Overflow): 48

        short s5 = 128;
        byte b5 = (byte) s5;
        System.out.println(b5); //-128

        double d5 = 10.234d;
        float f5 = (float) d5;
        System.out.println(f5);

        short s6 = 32767;
        s6++;
        System.out.println(s6); //-32768

        // int -> char (6xxxx)
        int i6 = 99; // 'c' 
        char c6 = (char) i6;
        System.out.println(c6); // 'c'

        // char can be made comparison

        char c8 = 'A';
        char c9 = 'a';
        if (c8 > c9) { // conversion: char -> int
            System.out.println("c8 > c9 in ascii");
        } else {
                System.out.println("c9 >= c8 in ascii"); // print
            }
        
            byte b9 = 100;
            short s9 = 101;
            if (s9 > b9) { // conversion: byte -> short
                System.out.println("s9 > b9"); // print
                
            } else {
                System.out.println("b9 >= s9");
            }

        
        



        }
    
}

