package bte.homeWorkLesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoSalon {
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

    public void bayCar() {
        System.out.println("What car you want to sell?");
        System.out.println("If its a passenger car press 1");
        System.out.println("If its a truck press 2");
        final var scanner = new Scanner(System.in);
        final var carType = scanner.nextInt();
        if(carType==1) {
            parking.add(new Car());
            balance+=Car.      }
        if (carType==2){
            parking.add(new Truck());
        }
    }
}
