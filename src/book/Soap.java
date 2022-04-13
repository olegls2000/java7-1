package book;

import static bte.util.Print.print;

public class Soap {
    private String s;

    Soap() {
        print("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}


