package bte.model;

import bte.annotation.BtaNumber;

import java.util.Scanner;

public class Car {
    private static final int MIN_WEIGHT = 1200;
    private static final int MAX_WEIGHT = 2500;
    private static final int MIN_PRICE = 10000;
    private static final int MAX_PRICE = 100000;

    @BtaNumber(min=MIN_PRICE, max=MAX_PRICE)
    private int price;

    @BtaNumber(min=MIN_WEIGHT, max=MAX_WEIGHT)
    private int weight;
    private Color color;

    public Car() {

        this(printMessage("CAR:"),getPriceFromInput(),
                getWeightFromInput(),
                getColorFromInput());
    }

    private static String printMessage(String message) {
        System.out.println(message);
        return message;
    }

    private static int input(String message) {
        int parameter;
        final var scanner = new Scanner(System.in);
        System.out.println("Please input the " + message + ":...");
        parameter = scanner.nextInt();

        return parameter;
    }

    private static int getPriceFromInput() {
        return input("price");
    }

    private static int getWeightFromInput() {
        return input("weight");
    }

    public static Color getColorFromInput() {
        final var scanner = new Scanner(System.in);
        boolean exists;

        String color;
        Color validColor = Color.RED;
        do {
            try {
                System.out.println("Please input the color (RED, WHITE or BLACK):...");
                color = scanner.nextLine();
                validColor = Color.valueOf(color);
                exists = false;
            } catch (IllegalArgumentException e) {
                exists = true;
                System.out.println("Your input is invalid!");
            }
        } while (exists);

        //  final var colorFromConsole = scanner.nextLine();
        return validColor;
    }

    public Car(final String st, final int price, final int weight, final Color color) {
    //    checkWeight(weight);
    //    checkPrice(price);
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public void checkWeight(int weightToValidate) {
        if (weightToValidate > MAX_WEIGHT || weightToValidate < MIN_WEIGHT) {
            System.out.println("Weight is invalid, must be bigger than: " + MIN_WEIGHT +
                    " and  less than " + MAX_WEIGHT);
            throw new RuntimeException("Invalid weight!");
        }
    }

    public void checkPrice(int priceToValidate) {
        if (priceToValidate > MAX_PRICE || priceToValidate < MIN_PRICE) {
            System.out.println("Price is invalid, must be bigger than: " + MIN_PRICE +
                    "and  less than " + MAX_PRICE);
            throw new RuntimeException("Invalid PRICE!");
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
