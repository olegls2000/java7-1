package bte.model.simple;

public class SimpleTriangle implements WithPerimeter, WithArea {
    private int a;
    private int b;
    private int c;

    public SimpleTriangle(int a, int b, int c){
        checkTriangle(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getPerimeter(){
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        checkTriangle(a, this.b, this.c);
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        checkTriangle(this.a, b, this.c);
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        checkTriangle(this.a, this.b, c);
        this.c = c;
    }

    public int calculatePerimeter(){
        return a + b + c;
    }
    private void checkTriangle(int a, int b, int c){
        boolean impossible = a + b <= c || b + c <= a || a + c <= b;
        if(impossible){
            throw new RuntimeException("Triangle with combination of side: " + a + "," + b + "," + c + "is impossible");
        }
    }

    public boolean equals(Object object){
        if(this  == object){
            return true;
        }
        if(object instanceof SimpleTriangle){
            SimpleTriangle simpleTriangle = (SimpleTriangle) object;
            return simpleTriangle.a == this.a && simpleTriangle.b == this.b && simpleTriangle.c == this.c ;
        }
        return false;
    }
}
