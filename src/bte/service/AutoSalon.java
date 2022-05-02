package bte.service;

import bte.model.Car;

public class AutoSalon {
    private static final double INTEREST = 1.2;
    private Car[] parking;
    private int balance;

    public AutoSalon() {
        int parkingCapacity = getFromConsoleInitialCapacity();
        parking = new Car[parkingCapacity];
        int initialBalance = getFromConsoleInitialBalance();
        balance = initialBalance;
    }

    public void buyCar(Car carToBuy) {
        final int freePlace = getFreeParkingSlot();
        if (freePlace < 0) {
            System.out.println("We don't have free places, please sell smth..");
            return;
        }
        final var carPrice = carToBuy.getPrice();
        if (balance < carPrice) {
            System.out.println("We don't have enough money (need: " + carPrice
                    + ", have: " + balance + "), please sell smth or top-up ..");
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
        return freePlace;
    }

    public Car sellCar(int parkingPlace) {
        //TODO check if parkingPlace is not empty
        //TODO check if parkingPlace is from parking range
        parking[parkingPlace] = null;
        return null;
    }

    public void report() {
        //TODO...
        //print out balance, capacity
    }

    private int getFromConsoleInitialBalance() {
        //INPUT from console
        return 200_000;
    }

    private int getFromConsoleInitialCapacity() {
        //INPUT from console
        return 5;
    }


}
