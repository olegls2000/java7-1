package bte;

public class Lesson15 {
    public static void main(String[] args) {
        boolean b = 4 > 9;
        int y = 0;
        if (b) {
            y = 1;
        } else {
            y = 2;
        }
        System.out.println("y = " + y);
        String ss = 5 > 8 ? "1 + 6" : "2 - 1";
        y = 5 > 8 ? 1 + 6 : 2 - 1 + 5 == 5 ? 1 : 2;
        System.out.println("y = " + y);
    }
}
