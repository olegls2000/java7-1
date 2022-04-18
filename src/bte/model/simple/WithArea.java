package bte.model.simple;

public interface WithArea {
    int COUNT = 0; // public static final CONST

    double getArea();

    default void newMethod() {
        System.out.println("Do nothing");
    }
}
