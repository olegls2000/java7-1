package bte.autosalonadvanced.service;

import bte.autosalonadvanced.model.Car;
import bte.autosalonadvanced.model.PassengerCar;
import bte.autosalonadvanced.model.Truck;

public class AutoSalon implements AutoSalonI {
    private final static int MAX_NUMBER_OF_SLOTS = 8;
    private final static double INTEREST = 0.2;
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

    @Override
    public int buyCar(Car car) {
        int freeSlot = findFreeSlot();
        if (freeSlot != -1) {
            int price = car.EstimatedCost();
            if (balance - price >= 0) {
                balance -= price;
                slots[freeSlot] = car;
            }
        }

        return freeSlot;
    }

    @Override
    public int sellCar(int i) {
        if (i >= 0 && i < slots.length) {
            if (this.slots[i] != null) {
                int price = (int) (INTEREST * slots[i].EstimatedCost());
                balance += price;
                slots[i] = null;
                return price;
            }
        }

        System.out.println("We cannot find a car in the given spot or spot is invalid");
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
