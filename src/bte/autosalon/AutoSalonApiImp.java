package bte.autosalon;

import java.util.Arrays;

public class AutoSalonApiImp implements AutoSalonApi {

    private static final int CARGO = 15;
    private static final int AGE = 8;
    private static final int TECHSTATUS = 100;
    private static final int CAPACITY = 150;


    private int balance;
    private AbstractCar[] parking = new AbstractCar[8];


    AutoSalonApiImp salon = new AutoSalonApiImp();


    @Override
    public int buyCar(AbstractCar auto) throws InvalidCarExeption {
        final int carPrice = evaluatePrice(auto);
        final int parkingPlace = getFreeParkingPlace();
        if (balance < carPrice) {
            throw new InvalidCarExeption("Not enough money", "balance", balance);
        }
        if (parkingPlace == 0) {
            throw new InvalidCarExeption("Not enough space", "space", parking);
        }

        parking[parkingPlace] = auto;
        balance -= evaluatePrice(auto);
        return parkingPlace;
    }


    @Override
    public int sellCar(int i) throws InvalidCarExeption {
        checkParkingPlace(i);
        final var car = parking[i];
        int autoPrice = evaluatePrice(car);
        parking[i] = null;
        var salePrice = autoPrice * 1.2;
        balance += salePrice;
        return (int) salePrice;
    }

    @Override
    public void report() {
        System.out.println(balance);
        System.out.println("Cars in stock " + parking);
    }

    private int checkParkingPlace(int i) throws InvalidCarExeption {
        if (i >= parking.length || i < 0) {
            throw new InvalidCarExeption("There is no car", "parking", parking);
        } else {
            return Arrays.asList(parking).indexOf(i);
        }
    }

    private int getFreeParkingPlace() {
        int freePlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                freePlace = i;
                break;
            }
        }
        return freePlace;
    }

    private int evaluatePrice(AbstractCar car) {
        int price = 0;
        if (car instanceof Truck) {
            price = (car.cargo * CARGO) - (car.releaseDate.getYear() * AGE) + (car.techStatus * TECHSTATUS);
        } else {
            price = (car.capacity * CAPACITY) - (car.releaseDate.getYear() * AGE) + (car.techStatus * TECHSTATUS);
        }
        return price;
    }
}
