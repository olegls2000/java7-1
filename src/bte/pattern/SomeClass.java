package bte.pattern;

import static bte.util.Print.print;

public class SomeClass {
    public static void main(String[] args) {
        print(oddOrNo(9));
    }
    public static boolean oddOrNo(int num){
        return (num & 1) != 0;
    }

}
