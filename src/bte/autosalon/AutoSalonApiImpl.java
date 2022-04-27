package bte.autosalon;

public class AutoSalonApiImpl implements AutoSalonApi {
    private int balance;
    private AbstractCar[] parking = new AbstractCar[8];

    @Override
    public int buyCar(AbstractCar auto) {
        final var carPrice = evaluatePrice(auto);
        final var parkingPlace = getFreeParkingPlace();
        if (balance < carPrice) {
            System.out.println("Not enough money!");
            return -1;
        }
        if (parkingPlace < 0) {
            System.out.println("Not enough space!");
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
        int autoPrice = estimatedValueOfTheCar(car);
        parking[i] = null;
        var salePrice = autoPrice * 1.2;
        balance += salePrice;
        return (int) salePrice;
    }

    private void checkParkingPlace(int i) {
        //TODO ... i>=0, i<parking.length, car != null
    }

    @Override
    public void report() {
        System.out.println(balance);
        System.out.println("Cars in stock ");
    }


    private int evaluatePrice(AbstractCar auto) {
        // double estValTruck = (auto.cargo * CARGO) - (auto.age * AGE) + (auto.techStatus * TECHSTATUS);
        return 0;
    }

    private int getFreeParkingPlace() {
        //TODO add...
        return 0;
    }

    private int estimatedValueOfTheCar(AbstractCar auto) {
        //double estValTruck = (auto.capacity * CAPACITY) - (auto.age * AGE) + (auto.techStatus * TECHSTATUS);
        return 0;
    }


}