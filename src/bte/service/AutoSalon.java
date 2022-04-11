package bte.service;

import bte.model.Car;

import java.util.Scanner;

public class AutoSalon {
    public static final double INTEREST = 1.2;
    final private Car[] parking;
    private int balance;

    public AutoSalon() {
        int parkingCapacity = getFromConsoleInitialCapacity();
        parking = new Car[parkingCapacity];
        balance = getFromConsoleInitialBalance();
    }

    private int getFromInput(String message) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter your " + message+": ");
            num = scanner.nextInt();
            if (num <= 0)
                System.out.println("Your "+message+" is " + num + " invalid!" );
        } while (num <= 0);
        return num;
    }

    private int getFromConsoleInitialBalance() {
        return getFromInput("balance");
    }

    private int getFromConsoleInitialCapacity() {
        return getFromInput("capacity");
    }

    public void buyCar(Car carToBuy) {
        final var freePlace = getFreeParkingSlot();
        if (freePlace < 0) {
            System.out.println("We don't have free places, please sell smth.");
            return;
        }
        final var carPrice = carToBuy.getPrice();
        if (balance < carPrice) {
            System.out.println("We don't have enough money (need: " + carPrice + ", have:= " + balance + ") please sell smth or top-up");
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

    public void sellCar(int parkingPlace) {
        final var carPrice = parking[parkingPlace].getPrice();
        balance += carPrice*INTEREST;
        parking[parkingPlace] = null;
    }

    public void report() {
        System.out.println("REPORT");
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] != null) {
                System.out.print("Car in the slot " + i + ": ");
                System.out.println(parking[i].getPrice() + ", " + parking[i].getWeight() + ", " + parking[i].getColor());
            } else {
                System.out.println("The slot " + i + " is empty.");
            }
        }
        System.out.println("BALANCE: " + balance);
        System.out.println();
    }
}

