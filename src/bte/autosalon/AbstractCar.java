package bte.autosalon;

import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;


public abstract class AbstractCar {
    private static final int MIN_TECH_CONDITION = 1;
    private static final int MAX_TECH_CONDITION = 10;
    private int techStatus;
    private LocalDate releaseDate;
    private CarManufacturer manufacturer;

    public AbstractCar(int techStatus, LocalDate releaseDate, CarManufacturer manufacturer) {
        checkTechStatus(techStatus);
        this.techStatus = techStatus;
        this.releaseDate = releaseDate;
        this.manufacturer = manufacturer;
    }

    private void checkTechStatus(int techStatus) {
        if (techStatus > MAX_TECH_CONDITION || techStatus < MIN_TECH_CONDITION) {
            System.out.println("TechCondition is invalid, must be bigger than: " + MIN_TECH_CONDITION +
                    "and less than: " + MAX_TECH_CONDITION);
            throw new RuntimeException("Unacceptable conditions");
        }
    }

    private int getAgeInYears(LocalDate date) {
        return Period.between(date, LocalDate.now()).getYears();
    }
}
