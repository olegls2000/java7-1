package bte.service;

import bte.model.Car;

import java.util.Scanner;

public class AutoSalon {
    private static final double INTEREST = 1.2;
    private final Car[] parking;
    private double balance;

    public AutoSalon() {
        int parkingCapacity = getFromConsoleInitialCapacity(); //input from console
        parking = new Car[parkingCapacity];
        balance = getFromConsoleInitialBalance();
    }

    public void buyCar(Car carToBuy) {
        final var freePlace = getFreeParkingSlot();
        if (freePlace < 0) {
            System.out.println("We dont have free place, please sell smth");
            return;
        }
        final var carPrice = carToBuy.getPrice();
        if (balance < carPrice) {
            System.out.println("We dont have enough money (need: " + carPrice
                    + ", have: " + balance + ") ,please sell smth or top-up ...");
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
              //  break;
            }
        }
        return freePlace;
    }

    public int parkingPlace(){
        System.out.println("Please input parking slot: ");
        Scanner scanner = new Scanner(System.in);
        final int parkingPlace = scanner.nextInt();
        if (parkingPlace == 0) {
            System.out.println("Parking place is empty");
        }
        if (parkingPlace > parking.length) {
            System.out.println("Parking place not exist");
        }
        return parkingPlace;
    }

    public void sellCar(int parkingPlace) {
        // TODO check if parkingPlace is not empty
        // TODO check if parkingPlace is from parking range

        balance = balance + parking[parkingPlace].getPrice() * INTEREST;
        parking[parkingPlace] = null;
    }

    public void report() {
        //print out balance and capacity
        System.out.println("Balance is: " + balance);
        System.out.println("Cars on parking: " + getFreeParkingSlot());
    }

    private int getFromConsoleInitialBalance() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input initial balance");
        return scanner.nextInt();
    }

    private int getFromConsoleInitialCapacity() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input initial capacity");

        return scanner.nextInt();
    }
}
