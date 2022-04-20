package bte.util;

import static bte.util.Print.print;

public final class ArrayUtils {
    private ArrayUtils(){
        throw new RuntimeException("Instance impossible");
    }

    public static <T> T printAndReturnFigureWithPerimeter(T figura){
        print(figura);
        return figura;
    }
}
