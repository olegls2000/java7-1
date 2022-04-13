package bte.model.simple;

public class SimpleRectangle implements WithPerimeter, WithArea {
    private int a;
    private int b;

    public SimpleRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
@Override
    public double getPerimeter(){
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return a * b;
    }
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object instanceof SimpleRectangle){
            SimpleRectangle simpleRectangle = (SimpleRectangle) object;
            return simpleRectangle.a == this.a && simpleRectangle.b == this.b;
        }
        return false;
    }
}