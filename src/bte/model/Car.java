package bte.model;

import java.util.Scanner;

public class Car {
    private static final int MIN_WEIGHT = 1_200;
    private static final int MAX_WEIGHT = 2_500;
    private static final int MIN_PRICE = 10_000;
    private static final int MAX_PRICE = 100_000;

    private int price;
    private int weight;
    private Color color;

    public Car() {
        this(getPriceFromConsole(), getWeightFromConsole(), getColorFromConsole());
    }

    private Car(final int price, final int weight, final Color color) {
        checkWeight(weight);
        checkPrice(price);
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

    private void checkWeight(int weightToValidate) {
        if (weightToValidate > MAX_WEIGHT || weightToValidate < MIN_WEIGHT) {
            System.out.println("Weight is invalid, must be bigger than: " + MIN_WEIGHT +
                    "and less then " + MAX_WEIGHT);
            throw new RuntimeException("Invalid weight");
        }
    }

    private void checkPrice(int priceToValidate) {
        if (priceToValidate < MIN_PRICE || priceToValidate > MAX_PRICE) {
            System.out.println("Price is invalid, must be bigger than: " + MIN_PRICE +
                    " and less then " + MIN_PRICE);
            throw new RuntimeException("Invalid price");
        }
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
        checkPrice(price);
        this.price = price;
    }

    public void setWeight(int weight) {
        checkWeight(weight);
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
