package bte.autosalon;

import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;


public abstract class AbstractCar {
    private static final int MIN_TECH_CONDITION = 1;
    private static final int MAX_TECH_CONDITION = 10;
    private static final int MAX_AGE = 15;
    private int techStatus;
    private LocalDate releaseDate;
    private CarManufacturer manufacturer;

    public AbstractCar(int techStatus, LocalDate releaseDate, CarManufacturer manufacturer)
            throws InvalidCarException {
        checkTechStatus(techStatus);
        checkAge(releaseDate);
        this.techStatus = techStatus;
        this.releaseDate = releaseDate;
        this.manufacturer = manufacturer;
    }

    public abstract void printCarInfo() throws Throwable;

    private void checkTechStatus(int techStatus) {
        if (techStatus > MAX_TECH_CONDITION || techStatus < MIN_TECH_CONDITION) {
            System.out.println("TechCondition is invalid, must be bigger than: " + MIN_TECH_CONDITION +
                    "and less than: " + MAX_TECH_CONDITION);
            throw new RuntimeException("Unacceptable conditions");
        }
    }

    private void checkAge(LocalDate releaseDate) throws InvalidCarException {
        final var age = Period.between(releaseDate, LocalDate.now()).getYears();
        if (age > MAX_AGE) {
            throw new InvalidCarException("Car age is greater than Max", "age", age);
        }
    }
}
