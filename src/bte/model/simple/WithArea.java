package bte.model.simple;

import static bte.util.Print.print;

public interface WithArea {

    //public static final int COUNT = 0;
    int COUNT = 0;

    double getArea();

    default void newMethod(){
        print("Do nothing");
    }
}
