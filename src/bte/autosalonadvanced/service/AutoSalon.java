package bte.autosalonadvanced.service;

import bte.autosalonadvanced.model.Car;
import bte.autosalonadvanced.model.PassengerCar;
import bte.autosalonadvanced.model.Truck;

public class AutoSalon implements AutoSalonI {
    private final static int MAX_NUMBER_OF_SLOTS = 8;

    private final static double INTEREST = 1.2;

    private static final int COEFFICIENT_CARGO = 15;
    private final static int COEFFICIENT_SEATS = 150;
    private final static int COEFFICIENT_AGE = 8;
    private final static int COEFFICIENT_TECHNICAL_STATE = 100;


    private final Car[] slots;
    private int balance;

    public AutoSalon(final int balance) {
        this.slots = new Car[MAX_NUMBER_OF_SLOTS];
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(final int balance) {
        this.balance = balance;
    }

    private int findFreeSlot() {
        for (int i = 0; i < MAX_NUMBER_OF_SLOTS; i++) {
            if (slots[i] == null)
                return i;
        }
        return -1;
    }

    public int EstimatedCost(Car car) {
        // Passenger ПассажироМеста*КоэфПассажиромест - возрастАвтомобиля*КоэфВозраста+техничСостояние*КоэфТехнСостояния
        //   грузоподьемность*КоэфГруза - возрастАвтомобиля*КоэфВозраста+техничСостояние*КоэфТехнСостояния
        //   long between = ChronoUnit.YEARS.between(getLocalDate(),LocalDate.now()
        int partialPrice = car.getAge() * COEFFICIENT_AGE
                + car.getTechnicalCondition() * COEFFICIENT_TECHNICAL_STATE;

        if (car instanceof PassengerCar) {
            return ((PassengerCar) car).getNumberOfSeats() * COEFFICIENT_SEATS -
                    partialPrice;
        } else if (car instanceof Truck) {
            return ((Truck) car).getLoadCapacity() * COEFFICIENT_CARGO -
                    partialPrice;
        }
        return -1;
    }

    @Override
    public int buyCar(Car car) throws InvalidAutoSalonStateException {
        int freeSlot = findFreeSlot();
        if (freeSlot != -1) {
            int priceOfCar = EstimatedCost(car);
            if (priceOfCar != -1) {
                if (balance >= priceOfCar) {
                    balance -= priceOfCar;
                    slots[freeSlot] = car;
                } else
                    throw new InvalidAutoSalonStateException("We have no money to buy the car!", car);
            } else
                throw new InvalidAutoSalonStateException("The car is not a truck or a passenger car", car);
        } else
            throw new InvalidAutoSalonStateException("There is no parking place in our cars' salon! " +
                    "We cannot buy the car ", car);

        return freeSlot;
    }

    @Override
    public int sellCar(int i) throws InvalidAutoSalonStateException {
        if (i >= 0 && i < slots.length) {
            if (this.slots[i] != null) {

                int priceOfCar = EstimatedCost(slots[i]);
                if (priceOfCar != -1) {
                    int sellPrice = (int) (INTEREST * priceOfCar);
                    balance += sellPrice;
                    slots[i] = null;
                    return sellPrice;
                }
            } else
                throw new InvalidAutoSalonStateException("We cannot find a car in the given place " + i);


        } else
            throw new InvalidAutoSalonStateException("The place number " + i + " is invalid");

        return 0;
    }

    @Override
    public String report() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("REPORT\n");
        for (int i = 0; i < MAX_NUMBER_OF_SLOTS; i++) {
            if (slots[i] == null) {
                stringBuilder
                        .append("Slot ")
                        .append(i)
                        .append(" is empty\n");
            } else {
                stringBuilder
                        .append("Slot ")
                        .append(i)
                        .append(" :\n");
                stringBuilder.append(slots[i].getManufacturer())
                        .append(" - Date: ")
                        .append(slots[i].getLocalDate())
                        .append(", Technical condition: ")
                        .append(slots[i].getTechnicalCondition());

                if (slots[i] instanceof PassengerCar) {
                    stringBuilder
                            .append(", Number of seats: ")
                            .append(((PassengerCar) slots[i]).getNumberOfSeats())
                            .append("\n");
                } else if (slots[i] instanceof Truck) {
                    stringBuilder
                            .append(", Load capacity: ")
                            .append(((Truck) slots[i]).getLoadCapacity())
                            .append("\n");
                }
            }
        }
        stringBuilder
                .append("Balance: ")
                .append(balance);
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}
