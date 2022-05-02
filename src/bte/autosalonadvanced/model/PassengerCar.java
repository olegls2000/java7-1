package bte.autosalonadvanced.model;

import java.time.LocalDate;

public class PassengerCar extends Car {
    private final static int MIN_NUMBER_OF_SEATS = 2;
    private final static int MAX_NUMBER_OF_SEATS = 8;


    private final int numberOfSeats;

    public PassengerCar(final int technicalCondition, final Manufacturers manufacturer,
                        final int numberOfSeats) throws InvalidCarException {
        super(technicalCondition, manufacturer);
        if (isNumberOfSeats(numberOfSeats))
            this.numberOfSeats = numberOfSeats;
        else
            throw new InvalidCarException("The number of seats must be between "
                    + MIN_NUMBER_OF_SEATS + " and " + MAX_NUMBER_OF_SEATS + " was " + numberOfSeats,
                    "Number of seats", this);

    }

    public PassengerCar(final int technicalCondition, final Manufacturers manufacturer,
                        final int numberOfSeats, final LocalDate localDate) throws InvalidCarException {
        this(technicalCondition, manufacturer, numberOfSeats);
        setLocalDate(localDate);

    }

    private static boolean isNumberOfSeats(int numberOfSeats) {
        return numberOfSeats >= MIN_NUMBER_OF_SEATS && numberOfSeats <= MAX_NUMBER_OF_SEATS;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "\nPassenger car " + this.getManufacturer() + ":\n{\n" +
                "Number of seats = " + numberOfSeats + "\n" +
                "Production date = " + this.getLocalDate() + "\n" +
                "Technical condition = " + this.getTechnicalCondition() + "\n}\n";
    }
}
