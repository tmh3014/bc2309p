public class Operator {
    public static void main (String[] args) {
        // + - * /
        // ++
        // --
        int i = 0;
        i = i -1; // -1
        i -= 1; // -2
        i--; // -3
        --i; // -4
        int x = 0;
        int result = x++;
        System.out.println("result=" + result);
        System.out.println("x=" + x);

        int y = 0;
        int result2 = ++y;
        System.out.println("result2=" + result2);
        System.out.println("y=" + y);

        int t = 0;
        int result3 = --t;
        System.out.println("result3=" + result3);
        System.out.println("t=" + t);

        // %
        int r = 5 % 2; // the remainder of 5 / 2
        System.out.println(r);

        int w = 10 % 6 + 4 * 8;
        System.out.println(w); // 36

        // && ||
        boolean b = true && true; // true
        boolean b2 = true && false; // false
        boolean b3 = false && true; // false
        boolean b4 = false && false; // false

        boolean b5 = true || true; // true
        boolean b6 = true || false; // true
        boolean b7 = false || true; // true
        boolean b8 = false || false; // false

        boolean combine = true || false && true; // true // && go first
        System.out.println(combine);

        // ! -> NOT
        boolean b9 = !false; // true
        int h = (1 + 2) * 10; // 30
        boolean b10 = !(true && false); // true
        System.out.println(b10);

        // int h2 = [10 - (1 + 2)] * 4
        int h2 = (10 - (1 + 2)) * 4;

        // >, <, >=, <=

        boolean g = 5 > 3; // true
        boolean g2 = 5 >= 6; // false
        boolean g3 = -1 < 1; // true
        boolean g4 = -2 <= -3; // false

        boolean combine2 = (4 + 3) > 5 || (10 * 2) % 3 == 2;
        System.out.println(combine2);
        boolean combine3 = !(5 % 2 == 1) && 10 * 3 != 20;
        System.out.println(combine3);

        // *= , /= , %=

        int a = 2;
        a *= 3;
        System.out.println(a);

        int f =3;
        f /= 1;
        System.out.println(f);

        int e = 10;
        e %= 3;
        System.out.println(e);













    }
}
