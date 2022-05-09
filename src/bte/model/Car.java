package bte.model;

import bte.annotation.BtaNumber;
import bte.util.Color;

import java.util.Scanner;

import static bte.util.Print.print;

public class Car {
    private static final int MIN_WEINGHT = 1200;
    private static final int MAX_WEIGHT = 2500;
    private static final int MIN_PRICE = 10000;
    private static final int MAX_PRICE = 100000;


    @BtaNumber(min = MIN_PRICE, max = MAX_PRICE)
    private int price;

    @BtaNumber(min = MIN_WEINGHT, max = MAX_WEIGHT)
    private int weight;


    private Color color;

    public Car() {


//        final int price = 22_000;//TODO implement at home console input
//        final int weight = 1_400;//TODO implement at home console input

        this(22_000, 1_400, getColorFromConsole());
    }

    private static Color getColorFromConsole() {
        final var scanner = new Scanner(System.in);
        print("Please input the color (RED, WHITE, BLACK): ...");
        final var colorFromConsole = scanner.nextLine();
        return Color.valueOf(colorFromConsole);
    }

    public Car(final int price, final int weight, final Color color) {
        checkWeight(weight);
        checkPrice(price);
        this.price = price;
        this.weight = weight;
        this.color = color;
        //+ random for price and weight
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        checkPrice(price);
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        checkWeight(weight);
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private void checkWeight(int weightToValidate) {
        if (weightToValidate > MAX_WEIGHT || weightToValidate < MIN_WEINGHT) {
            print("Weight is invalid, must be bigger than: " + MIN_WEINGHT + " and less than: "
                    + MAX_WEIGHT);
            throw new RuntimeException("Invalid weight");
        }
    }

    private void checkPrice(int priceToValidate) {
        if (priceToValidate > MAX_PRICE || priceToValidate < MIN_PRICE) {
            print("Price is invalid, must be bigger than: " + MIN_PRICE +
                    " and less than: " + MAX_PRICE);
            throw new RuntimeException("Invalid price");
        }
    }


}
