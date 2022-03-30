package bte;

public class Main {
    public static void main(String[] args) {
        //jvm - Java Virtual Machine  - RUNTIME!!!
        //JDK - Java Development Kit!!!
        byte b = 6;
        byte a = 5;
        //byte c = a + b;
        System.out.println("b = " + b);
        System.out.println("c = " + (a + b));
        System.out.println();

        short sh = 1111;
        int i = 11111111;
        long l = 99999999999999l;
        float f = 7.88989f;
        double d = 9.6565656d;

        boolean myBoolean = true;
        boolean boO = false;
        String str = "Text ...";
        System.out.println(str);

        int i1 = 56;
        long l1 = 8999999999999999999l;
        //l1 = i1;
        i1 = (int) d;   //DOWN CASTING!!!
        d = i1;         //UP CASTING!!!


        System.out.println("After casting, i1: " + i1);
        System.out.println("After casting, d: " + d);
        //  CTRL+ALT+L

        double t = 2; //UP CASTING!!!
        System.out.println("Afte casting, t: " + t);
        double result = (3 + 9) % (9 + 3) + 1;
        System.out.println("result = " + result);

        //Create a program that calculate and print out next state:
        // 121 * ⅓ +388^3   Output example: 121 * ⅓ +388^3 = ...

        //Create a program that calculate and print out next state:
        // 14/209+14ˣ(29-13²+14/3).
        // Also extract 14 to the separate variable with a proper type.

        int var = 14;
        double result1 = var / 209 + var * (29 - Math.pow(13, 2) + var / 3);
        System.out.println(var + "/209+" + var + "ˣ(29-13²+" + var + "/3)=" + result1);

        int r = 5;
        // r++;     // -> r = r + 1; postfix increment!!
        // --r; prefix decrement!!
        r--;      // -> r = r - 1; postfix decrement!!
        r += 8;   // -> r = r + 8;
        r -= 10; // -> r = r -10;
        r *= 7; // r = r * 7;
        r /= 6; // r = r / 6;
        System.out.println("r = " + r);

        boolean b2 = 7 + 6 * 2 > 8 + 5 * 4;
        b2 = 6 != 5;
        // >
        // <
        // >=
        // <=
        // ==
        // !=

        int t1 = 7;
        int t2 = 85;
        boolean rest = t1 > t2;

        if (rest) {
            System.out.println(t1 + " is bigger");
        } else {
            System.out.println(t2 + " is bigger");
        }
        System.out.println("b2 = " + b2);

        //Create a program that define and print out information if
        //number odd or even. Output example: "10 is even" or "11 is odd".

/*        Create a program that define and print out one from
        two numbers n and m which  is closer to 100.
        Output example: "m=5, n=90; 90 is closer to 100"*/
    }
}
