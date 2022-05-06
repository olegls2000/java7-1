package bte.model;

import bte.util.NumberUtils;

public class Point {
    public int x;
    public int y;
    private boolean bool;

    //public boolean isBool


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = NumberUtils.getRandom(0, 10);
        this.y = NumberUtils.getRandom(0, 10);
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
