package bte.model;

import bte.util.CircleUtils;

public class Circle {
    public Point getCenter;
    public String getRadius;
    private int radius;
    private Point center;

    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int newRadius){
        this.radius = newRadius;
    }
    public Point getCenter(){
        return this.center;
    }
    public void setCenter(int newCenter){
        this.radius = newCenter;
    }


    public void move(int xDelta, int yDelta){
       this.center.x = this.center.x +xDelta;
        this.center.y = this.center.y +xDelta;
    }
    public Circle(int radius, Point center){
        System.out.println("Constructor initialisation block");
        this.radius = radius;
    }
    public double getArea(){
        return CircleUtils.PI * Math.pow(radius, 2);
    }
    public double getLength(){ return 2 * Math.PI * radius; }
    {
        System.out.println("Instance initialisation block");
    }
    static {
        System.out.println("Static initialisation block");
    }
    /*public int moveCir(int x, int y){

    }*/
}
