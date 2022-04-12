package bte.service;

import bte.model.Car;

import java.util.Scanner;

public class AutoSalon {

    static
    private Car[] parking;
    private int balance;

    public AutoSalon() {
        int parkingCapacity = getFromConsoleInitialCapacity();
        parking = new Car[parkingCapacity];
        int initialBalance = getFromConsoleInitialBalance();
        balance = initialBalance;
    }

    private int getFromConsoleInitialBalance() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input your balance");
        int balanceFromConsole = scanner.nextInt();
        int balance = balanceFromConsole;
        return balance;
        // return 200_000;
    }

    private int getFromConsoleInitialCapacity() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input number of cars");
        int parkingFromConsole = scanner.nextInt();
        int parking = parkingFromConsole;
        return parking;
        //return 5;
    }

    public void buyCar(Car carToBuy) {
        final int freePlace = getFreeParkingSlot();
        if (freePlace < 0) {
            System.out.println("We don`t have free places, please sell smth...");
            return;
        }
        final var carPrice = carToBuy.getPrice();
        if (balance < carPrice) {
            System.out.println("We don`t have enough money (need: " + carPrice + ", have: "
                    + balance + "), please sell smth or top-up ..");
            return;
        }
        balance -= carPrice;
        parking[freePlace] = carToBuy;
    }

    private int getFreeParkingSlot () {
            int freePlace = -1;
            for (int i = 0; i < parking.length; i++) {
                if (parking[i] == null) {
                    freePlace = i;
                    break;
                }
            }
            return freePlace;
        }

    public void sellCar (Car carToPlace) {
            int parkingPlace = 0;
            for (int i = 0; i > parking.length; i++) {
                if (parking[i] == null) {
                    parkingPlace = i;
                    break;
                }
                parking[parkingPlace] = null;
            }
        return;
        }

    public void report () {
        System.out.println(balance + " - Balance, " + parking + " - Parking.");
                }
}

