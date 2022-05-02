package bte.autosalon;

import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;


public abstract class AbstractCar {
    private static final int MIN_TECH_CONDITION = 1;
    private static final int MAX_TECH_CONDITION = 10;
    private static final int MAX_AGE = 10;
    protected int techStatus;
    protected int cargo;
    protected int capacity;
    protected LocalDate releaseDate;
    private CarManufacturer manufacturer;

    public AbstractCar(int techStatus, LocalDate releaseDate, CarManufacturer manufacturer) throws InvalidCarExeption {
        checkTechStatus(techStatus);
        checkAge(releaseDate);
        this.techStatus = techStatus;
        this.releaseDate = releaseDate;
        this.manufacturer = manufacturer;
    }

    public int printCarInfo() throws Exception, Throwable {
        if(1 !=2){
            throw  new Exception("From Parent");
        }
        return 0;
    }


    private void checkTechStatus(int techStatus) throws InvalidCarExeption {
        if (techStatus > MAX_TECH_CONDITION || techStatus < MIN_TECH_CONDITION) {
            throw new InvalidCarExeption("TechCondition is invalid, must be bigger than: " + MIN_TECH_CONDITION +
                    "and less than: " + MAX_TECH_CONDITION, "techStatus",techStatus);

    }}


    private void checkAge(LocalDate releaseDate) throws InvalidCarExeption{
        final var age = Period.between(releaseDate, LocalDate.now()).getYears();
        if (age > MAX_AGE) {
                throw new InvalidCarExeption("Car age is greater than Max", "age", age);
        }
    }
}
