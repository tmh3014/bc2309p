public class Testing {

    public static void main (String [] args) {
        String box = "Hello World!!!";
        System.out.println(box);
        System.out.println("box");
        String str;
        box = "Welcome to bootcamp"; // Assignment
        str = "335577";
        System.out.println(str);
        System.out.println(box);

    // Primitives (one kind of data type)
    // int x = "abc" // Type mismatch: cannot convert from String to int
    int x = 1;
    int salary = 1000;
    x = 10;
    System.out.println(x); // 10

    x = x + 2;
    // Always look at the right side
    // 10 + 2,assign 12 back to variable x
    System.out.println(x);

    x = x - 8;
    System.out.println(x);

    salary = salary + x;
    System.out.println(salary);

    int z = salary/2;
    System.out.println(z);

    int k = z * 5;
    System.out.println(k);

    int sum = x + salary + z + k;
    System.out.println(sum);

    int result = sum + 10 / 2;
    System.out.println(result);

    // self + 1
    int j = 0;
    j = j + 1; // Approach 1

    j += 1; // Approach 2, same as j = j + 1, "= j +" -> "+="

    j++; // Approach 3

    ++j; // Approach 4

    System.out.println(j);

// String str = 1, // Not ok, Cannot assign int to String variable
        String s = "hello";
        // s = s / 2; // String nnot divide by 2
        // s = s * 2;
        // s = s - 3;
        s = s + " world."; // String supports + operation
        System.out.println(s);

        String str1 = "abc";
        String str2 = "xyz";
        String e = str1 + str2;
        System.out.println(e);

        System.out.println("e=." + e); // e=abcxyz

        // int -> integer 整數
        // cannot assign decimal to int
        double d = 0.3;
        d = 3.1415;
        System.out.println(d);
        d = d + 0.3 - 0.1 * 2;
        System.out.println(d);
        double d2 = 3; // assign int to variable d2,then convert int to double
        System.out.println(d2); // 

        // boolean (true or false)
        boolean a = true;
        boolean isLeft = false;
        System.out.println(isLeft); // false
        System.out.println(a);

        // String w = true; // cannot assign true/false to String variable
        // boolean doesn't support +/-/*// operation

        boolean isMale = true;

        // char
        char t = 'a';
        System.out.println(t);
        // char = ''; // at least 1 character
        // char = 'ab' // NOT OK, not support more than 1 character
        char o = '$';
        System.out.println(o);

        // byte
        byte b = 1; // within -128 - 127
        // byte b2 = -129; // out of range
        // byte b3 = 128; // out of range
        // b = b + 10;

        // short
        // short sh = -40000; // out of range
        short sh = 128;
        int r2 = sh + 100;
        System.out.println(r2);

        // long (a type has a larger range than int)
        long l1 = 10000;
        l1 += 20000;
        System.out.println(l1);

        l1 -= 5000;
        System.out.println(l1);

        l1 *= 2;
        System.out.println(l1);

        l1 /= 10;
        System.out.println(l1);

        // String supports +=
        String k2 = "abc";
        k2 += " bcd"; // k2 = k2 + " bcd"
        System.out.println(k2);

        // float
        int i = 1; // By default, java treats 1 is an integer
        double d4 = 3.0; // By default, java treats 3.0 is a double value
        double d5 = 3.0d; // Explicitly assign a double value to a variable
        // float f = 3.0; // NOT OK, assign double value to float variable
        float f = 3.0f; // 

        // byte, short, long, int  -> all of them handle integer

        byte b3 = 3;
        short s3 = 4;
        int i3 = 5; // by default is int value
        long l4 = 5; // upcast, ignore today
        long l3 = 5L; // assign long value 5 to a long variable
        



























    }       
}
