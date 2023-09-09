public class Review20230902 {
    public static void main (String [] args) {
        String box = "Bee";
        String aaa = "Honey ";
        System.out.println(aaa + box);
        System.out.println(aaa + "box");

        int x = 1000;
        int salary = x * 20;
        System.out.println(salary + x);
        int bonus = x * 10 / 4;
        System.out.println(salary + bonus);
        System.out.println(3000 + salary + bonus);

        System.out.println(aaa + salary);
        System.out.println("box " + bonus / 2);
        
        int j = 0;
        j = j + 1;
        j += 1;
        System.out.println(j);
        j++;
        ++j;
        System.out.println(j);

        int j2 = 5;
        j2 = j2 - 1;
        j2 -= 1;
        System.out.println(j2);
        j2--;
        --j2;
        System.out.println(j2);

        int j3 = 3;
        j3 = j3 * 3;
        j3 *= 2;
        System.out.println(j3);

        int j4 = 4;
        j4 = j4 / 2;
        j4 /= 2;
        System.out.println(j4);

        double d = 4.5;
        d = d + 0.3 - 0.1 * 2;
        System.out.println(d);
        d = d - 0.9 / 0.3;
        System.out.println(d);
        double d2 = 4;
        System.out.println(d2);

        boolean a = true;
        System.out.println(a);
        boolean a2 = false;
        System.out.println(a2);

        char a3 = 'a';
        char a4 = 'b';
        int a5 = a3 + a4;
        System.out.println(a5);

        byte b = -1;
        byte b2 = -5 ;
        byte b3 = 4;
        int b4 = b2 + b3;
        System.out.println(b4);

        short sh = 300;
        int r2 = sh + 500;
        System.out.println(r2);

        long l1 = 20000;
        l1 += 5000;
        l1 -= 2000;
        l1 *= 5;
        l1 /= 10;
        System.out.println(l1);

        String k2 = "Honey ";
        k2 += "Bee";
        System.out.println(k2);
        String k3 = "Happy ";
        System.out.println(k3 + "Day");


        int i = 0;
        i = i + 1;
        System.out.println(i);
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        i += 3;
        System.out.println(i);

        int i1 = 3;
        i1 = i1 - 2;
        i1 -= 4;
        System.out.println(i1);
        i1--;
        --i1;
        System.out.println(i1);

        int aa1 = 5;
        int res1 = aa1++;
        System.out.println("result1 = " + res1);
        System.out.println(res1 + aa1);

        int aa2 = 5;
        int res2 = ++aa2;
        System.out.println("result2 = " + res2);
        System.out.println(res2 + aa2);

        int aa3 = 3;
        int res3 = aa3--;
        System.out.println("result3 = " + res3);
        System.out.println(res3 + aa3);

        int aa4 = 3;
        int res4 = --aa4;
        System.out.println("result4 = " + res4);
        System.out.println(res4 + aa4);

        int aa5 = 7 % 5 - 2 * 8 / 4;
        System.out.println(aa5);

        int h2 = (10 - (1 + 2)) * 4;
        System.out.println(h2);

        // true && false ->false, &&的情況只要有false就係false，一定要both true先係true
        // true || false -> true, ||的情況一定要both false先係false

        int aa6 = 5 % 2;
        System.out.println(aa6);

        int t = 50;
        if (t > 50) {
            System.out.println("t is larger than 50");
        }   else {System.out.println("t is not larger than 50");
        }
        
        int s = 6; 
        if (s < 5) {
            System.out.println("aaa");
        } if (s < 7) {
            System.out.println("bbb");
        } if (s < 12) {
            System.out.println("ccc");
        }
        
        }








        










    }
