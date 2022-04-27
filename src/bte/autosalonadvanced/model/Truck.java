package bte.autosalonadvanced.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Truck extends Car {
    private static final int COEFFICIENT_CARGO = 15;
    private final static int MIN_LOAD_CAPACITY = 200;
    private final static int MAX_LOAD_CAPACITY = 1500;

    private int loadCapacity;

    public Truck(final int technicalCondition, final Manufacturers manufacturer, final int loadCapacity) throws InvalidCarException {
        super(technicalCondition, manufacturer);

        if (isLoadCapacity(loadCapacity))
            this.loadCapacity = loadCapacity;
        else
            throw new InvalidCarException("Load capacity must be between "
                    + MIN_LOAD_CAPACITY + " and " + MAX_LOAD_CAPACITY + ", was " + loadCapacity,
                    "Load capasity", this);

    }

    public Truck(final int technicalCondition, final Manufacturers manufacturer,
                 final int loadCapacity, final LocalDate localDate) throws InvalidCarException {
        this(technicalCondition, manufacturer, loadCapacity);
        setLocalDate(localDate);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    private static boolean isLoadCapacity(final int loadCapacity) {
        return loadCapacity >= MIN_LOAD_CAPACITY && loadCapacity <= MAX_LOAD_CAPACITY;
    }

    @Override
    public String toString() {
        return "\nTruck " + this.getManufacturer() + ":\n{\n" +
                "Load capacity = " + loadCapacity + "\n" +
                "Production date = " + this.getLocalDate() + "\n" +
                "Technical condition = " + this.getTechnicalCondition() + "\n}\n";
    }

}
