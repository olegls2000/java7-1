package bte.servise;

import bte.model.Car;

import static bte.util.Print.print;

public class AutoSalon {
    public static final double INTREST = 1.2;
    private Car[] parking;
    private int balance;


    public AutoSalon() {
        int parkingCapacity = getFromConsoleParkingCapacity();
        parking = new Car[parkingCapacity];
        int initialBalance = getFromConsoleInitialBalance();
        balance = initialBalance;
    }

    public void buyCar(Car carToBuy) {
        //TODO...
        final var freePlace = getFreeParkingSlot();
        if (freePlace < 0) {
            print("We don't have free places, please sell something...");
            return;
        }
        final var carPrice = carToBuy.getPrice();
        if (balance < carToBuy.getPrice()) {
            print("We don't have enough money(need: " + carPrice + ", have: " +
                    balance +
                    "), please sell something or top-up..");
            return;
        }

        balance -= carPrice;
        parking[freePlace] = carToBuy;
    }

    private int getFreeParkingSlot() {
        int freePlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                freePlace = i;
                break;
            }
        }
        if (freePlace < 0) {
            print();
        }
        return freePlace;
    }

    public Car sellCar(int parkingPlace) {
        //TODO...Check if parkingPlace is not empty
        //TODO...Check if parkingPlace is from parking range
        parking[parkingPlace] = null;
        return null;
    }

    public void report() {
        //printout balance and capacity

    }

    private int getFromConsoleInitialBalance() {
        //Input form console
        return 200_000;
    }

    private int getFromConsoleParkingCapacity() {
        // input from console
        return 5;
    }
}
