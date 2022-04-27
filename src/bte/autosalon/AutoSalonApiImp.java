package bte.autosalon;

import bte.pattern.iterator.Iterator;

public class AutoSalonApiImp implements AutoSalonApi {

    private static final int CARGO = 15;
    private static final int AGE = 8;
    private static final int TECHSTATUS = 100;
    private static final int CAPACITY = 150;


    private int balance;
    private AbstractCar[] parking = new AbstractCar[8];


    AutoSalonApiImp salon = new AutoSalonApiImp();

    @Override
    public int buyCar(AbstractCar auto) {
        final int carPrice = evaluatePrice(auto);
        final int parkingPlace = getFreeParkingPlace();
        if (balance < carPrice) {
            System.out.println("Not enough money");
            return -1;
        }
        if (parkingPlace >= 0) {
            System.out.println("Not enough space");
            return -1;
        }

        parking[parkingPlace] = auto;
        balance -= evaluatePrice(auto);
        return parkingPlace;
    }


    @Override
    public int sellCar(int i) {
        checkParkingPlace(i);
        final var car = parking[i];
        int autoPrice = (int) estimatedValueOfTheCar(car);
        parking[i] = null;
        var salePrice = autoPrice * 1.2;
        balance += salePrice;
        return (int) salePrice;
    }

    private void checkParkingPlace(int i) {
        //i >= 0, i < parking.length, car != null;
    }

    @Override
    public void report() {
        System.out.println(balance);
        System.out.println("Cars in stock ");

    }


    private int evaluatePrice(AbstractCar auto) {
        // double estValTruck = (auto.cargo * CARGO) - (auto.releaseDate * AGE) + (auto.techStatus * TECHSTATUS);
        return 0;
    }

    private int getFreeParkingPlace() {
        return 0;
    }

    private double estimatedValueOfTheCar(AbstractCar auto) {
        //double estValTruck = (auto.capacity * CAPACITY) - (auto.releaseDate * AGE) + (auto.techStatus * TECHSTATUS);
        return 0;
    }
}
