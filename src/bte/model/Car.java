package bte.model;

import bte.util.WeekDay;

public class Car {
    int price;
    int weight;
    Color color;

    public Car(Color color) {
        this.color = color;
        // + random for price and weight
    }

    public Car() {
        //all input from console
        WeekDay sunday =  WeekDay.valueOf("SUNDAYx");

    }
}
