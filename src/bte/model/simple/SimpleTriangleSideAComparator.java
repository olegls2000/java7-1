package bte.model.simple;

import java.util.Comparator;

public class SimpleTriangleSideAComparator implements Comparator<SimpleTriangle> {
    @Override
    public int compare(SimpleTriangle o1, SimpleTriangle o2) {
        return o1.getA() - o2.getA();
    }
}
