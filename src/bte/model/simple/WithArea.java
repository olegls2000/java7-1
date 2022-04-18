package bte.model.simple;

public interface WithArea {
    int COUNT=1; //public static final
    double getArea();
    default void newMethod() {
        System.out.println();
    }
}
