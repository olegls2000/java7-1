package bte.service;

import bte.model.Car;

import java.util.Scanner;

public class AutoSalon {
    private static final double INTEREST = 1.2;
    private Car[] parking;
    private double balance;

    public AutoSalon() {
        int parkingCapacity = getFromConsoleInitialCapacity(); //input from console
        parking = new Car[parkingCapacity];
        int initialBalance = getFromConsoleInitialBalance();  //input from console
        balance = initialBalance;
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

   /* private int[] getParkingPlaces(){
        int[] parkingPlace = new ;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] != null){
                parkingPlace[i] = i;
            }
        }
        return parkingPlace;
    }
    */

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

    public Car sellCar(int parkingPlace) {
        // TODO check if parkingPlace is not empty
        // TODO check if parkingPlace is from parking range

        balance = balance + parking[parkingPlace].getPrice() * INTEREST;
        parking[parkingPlace] = null;
        return parking[parkingPlace];
    }

    public void report() {
        //print out balance and capacity
        System.out.println("Balance is: " + balance);
        System.out.println("Cars on parking: " + getFreeParkingSlot());
    }

    private int getFromConsoleInitialBalance() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input initial balance");
        final var initialBalanceFromConsole = scanner.nextInt();
        final var initialBalance = initialBalanceFromConsole;
        return initialBalance;
    }

    private int getFromConsoleInitialCapacity() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input initial capacity");
        final var initialCapacityFromConsole = scanner.nextInt();
        final var initialCapacity = initialCapacityFromConsole;

        return initialCapacity;
    }
}
