package bte.model;

import bte.annotation.BtaNumber;

import java.util.Scanner;

public class Car {
    private static final int MIN_WEIGHT = 1200;
    private static final int MAX_WEIGHT = 2500;
    private static final int MIN_PRICE = 10000;
    private static final int MAX_PRICE = 100000;
    @BtaNumber(min = MIN_PRICE, max = MAX_PRICE)
    private int price;
    @BtaNumber(min = MIN_WEIGHT, max = MAX_WEIGHT)
    private int weight;
    private Color color;

    public Car(final int price, final int weight, final Color color){
        checkWeight(weight);
        checkPrice(price);
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public Car(){
        final int price = 22000;//doma
        final int weight = 1400;//doma

        //this(price, weight, getColorFromConsole());
    }

    private static Color getColorFromConsole(){
        final var scanner = new Scanner(System.in);
        System.out.println("Please input the color (RED, WHITE, BLACK)");
        String colorFromConsole = scanner.nextLine();
        final var color = Color.valueOf(colorFromConsole);
        return Color.valueOf(colorFromConsole);
    }

    private void checkWeight(int weightToValidate){
        if (weightToValidate > MAX_WEIGHT || weightToValidate < MIN_WEIGHT){
            System.out.println("Weight is invalid, must be bigger than: " + MIN_WEIGHT + "and less than: " + MAX_WEIGHT);
            throw new RuntimeException("Invalid weight!");
        }
    }

    private void checkPrice(int priceToValidate){
        if (priceToValidate > MAX_PRICE || priceToValidate < MIN_PRICE){
            System.out.println("Price is invalid, must be bigger than: " + MIN_PRICE + "and less than: " + MAX_PRICE);
            throw new RuntimeException("Invalid price!");
        }
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
}
