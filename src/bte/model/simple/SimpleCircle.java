package bte.model.simple;

public class SimpleCircle implements WithPerimeter, WithArea {
    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    private int radius;

@Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
    return "Simple Circle with radius = " + this.radius;
    }

    public boolean equals(Object object){
    if(this == object){
        return true;
    }
    if(object instanceof SimpleCircle){
        SimpleCircle simpleCircle = (SimpleCircle) object;
        return simpleCircle.radius == this.radius;
    }
    return false;
    }
}
