package bte.model;

import bte.anatation.BtaNumber;

import static bte.utils.NumberUtils.getRandom;

public class Point {
    @BtaNumber(min = 0, max = 100)
    private int x;
    @BtaNumber(min = 0, max = 100)
    private int y;
    private boolean bool;

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public boolean isBool() {
        return bool;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = getRandom(0,10);
        this.y = getRandom(0,10);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
