package bte.autosalon;

import java.time.LocalDate;

public class Passenger extends AbstractCar{

    private static final int MIN_CAPACITY = 2;
    private static final int MAX_CAPACITY = 8;

    private int capacity;

    public Passenger(int techStatus, LocalDate releaseDate, CarManufacturer manufacturer, int capacity) throws Exception {
        super(techStatus, releaseDate, manufacturer);
        checkCapacity(capacity);
        this.capacity = capacity;
    }

    private void checkCapacity (int capacity) throws InvalidCarExeption {
        if (capacity > MAX_CAPACITY|| capacity < MIN_CAPACITY) {
            throw new InvalidCarExeption("Capacity is invalid, must be bigger than: " + MIN_CAPACITY +
                    "and less than: " + MAX_CAPACITY, "capacity",capacity);
    }
}}
