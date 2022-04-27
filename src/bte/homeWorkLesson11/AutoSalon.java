package bte.homeWorkLesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoSalon implements AutoSalonApi{
    private static final int PARKING_SLOTS = 8;
    private static final int INTEREST = 20;

    private List<AbstractVehicle> parking;
    private int balance;

    public AutoSalon(List<AbstractVehicle> parking) {
        this.parking = parking;
    }

    public AutoSalon() {
        parking = new ArrayList<>();
        balance = getInitialBalanceFromConsole();
    }

    private static int getInitialBalanceFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input initial balance ...");
        return scanner.nextInt();
    }
/*
    @Override
    public <T extends AbstractVehicle> int buyCar(T auto) {
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
    }*/

    @Override
    public <T extends AbstractVehicle> int buyCar(T auto) {
        return 0;
    }

    @Override
    public int sellCar(int i) {
        return 0;
    }

    @Override
    public void report() {

    }
    private double carPrice(){
return 0;
    }
}
