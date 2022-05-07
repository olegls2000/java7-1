package bte.model;

import bte.anatation.BtaNumber;

import java.util.Scanner;

public class Car {
    private static final int MIN_WEIGHT = 1_200;
    private static final int MAX_WEIGHT = 2_500;
    private static final int MIN_PRICE = 10_000;
    private static final int MAX_PRICE = 100_000;
    @BtaNumber(min = MIN_PRICE, max = MAX_PRICE)
    private int price;
    @BtaNumber(min = MIN_WEIGHT, max = MAX_WEIGHT)
    private int weight;
    private Color color;

    public Car() {
        this(getPriceFromConsole(), getWeightFromConsole(), getColorFromConsole());
    }

    public Car(final int price, final int weight, final Color color) {
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    private static Color getColorFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input the color (RED, WHITE, BLACK):");
        final var colorFromConsole = scanner.nextLine();
        return Color.valueOf(colorFromConsole);
    }

    private static int getPriceFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input the price");
        final var priceFromConsole = scanner.nextInt();
        final var price = priceFromConsole;
        return priceFromConsole;
    }

    private static int getWeightFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input the weight");
        final var weightFromConsole = scanner.nextInt();
        return weightFromConsole;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
