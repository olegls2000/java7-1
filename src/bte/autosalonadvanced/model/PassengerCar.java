package bte.autosalonadvanced.model;

import java.time.LocalDate;
import java.time.Period;

public class PassengerCar extends Car {
    private final static int MIN_NUMBER_OF_SEATS = 2;
    private final static int MAX_NUMBER_OF_SEATS = 8;

    private final static int COEFFICIENT_SEATS = 150;

    private int numberOfSeats;

    public PassengerCar(final int technicalCondition,final Manufacturers manufacturer,final int numberOfSeats) {
        super(technicalCondition, manufacturer);
        if (isNumberOfSeats(numberOfSeats))
            this.numberOfSeats = numberOfSeats;
        else
            throw new RuntimeException("The number of seats must be between "
                    + MIN_NUMBER_OF_SEATS + " and " + MAX_NUMBER_OF_SEATS);
    }

    private static boolean isNumberOfSeats(int numberOfSeats) {
        return numberOfSeats >= MIN_NUMBER_OF_SEATS && numberOfSeats <= MAX_NUMBER_OF_SEATS;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


    @Override
    public int EstimatedCost() {
        // ПассажироМеста*КоэфПассажиромест - возрастАвтомобиля*КоэфВозраста+техничСостояние*КоэфТехнСостояния
        return numberOfSeats * COEFFICIENT_SEATS -
                Period.between(getLocalDate(), LocalDate.now()).getYears() * COEFFICIENT_AGE
                + getTechnicalCondition() * COEFFICIENT_TECHNICAL_STATE;
    }
}
