package bte.model;

import bte.annotation.BtaNumber;
import bte.util.WeekDay;

import java.util.Scanner;

public class Car {
    private static final int MIN_WEIGHT = 1200;
    private static final int MAX_WEIGHT = 2500;
    private static final int MIN_PRICE = 10_000;
    private static final int MAX_PRICE = 100_000;

    @BtaNumber(min = MIN_PRICE, max = MAX_PRICE)
    private int price;

    @BtaNumber(min = MIN_WEIGHT, max = MAX_WEIGHT)
    private int weight;

    private Color color;

    public Car() {
        //TODO implement at home console input
        //TODO implement at home console input

        this(22_000, 1_400, getColorFromConsole());
    }

    public Car(final int price, final int weight, final Color color) {
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    private static Color getColorFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input the color (RED, WHITE or BLACK): ...");
        final var colorFromConsole = scanner.nextLine();
        return Color.valueOf(colorFromConsole);
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
