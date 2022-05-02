package bte.homeWorkLesson11;

import java.time.LocalDate;
import java.time.Period;

public abstract class AbstractVehicle {

    final int LOAD_FACTOR = 15;
    protected final int AGE_FACTOR = 8;
    protected final int TECHNICAL_CONDITION_FACTOR = 100;
    protected final int PASSENGER_SEAT_FACTOR = 150;
    private final int MIN_TECHNICAL_CONDITION = 0;
    private final int MAX_TECHNICAL_CONDITION = 100;
    protected final int MIN_LOAD = 200;
    protected final int MAX_LOAD = 1500;
    protected final int MIN_PASSENGER_SEAT = 2;
    protected final int MAX_PASSENGER_SEAT = 8;
    private static final int MAX_AGE = 8;
    private final LocalDate releasedDate;
    private int age;
    private int technicalCondition;
    private VehicleBrand carBrand;


    public AbstractVehicle(LocalDate releasedDate, int technicalCondition, VehicleBrand carBrand) throws InvalidCarException {
        checkTechnicalCondition(technicalCondition);
        checkAge(releasedDate);
        this.releasedDate = releasedDate;
        this.technicalCondition = technicalCondition;
        this.carBrand = carBrand;
    }

    public int getAge() {
        return age;
    }

    public int getTechnicalCondition() {
        return technicalCondition;
    }

    public VehicleBrand getCarBrand() {
        return carBrand;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTechnicalCondition(int technicalCondition) {
        checkTechnicalCondition(technicalCondition);
        this.technicalCondition = technicalCondition;
    }

    public void setCarBrand(VehicleBrand carBrand) {
        this.carBrand = carBrand;
    }

    private void checkAge(LocalDate releaseDate) throws InvalidCarException {
        final var age = Period.between(releaseDate, LocalDate.now()).getYears();
        if (age > MAX_AGE) {
            throw new InvalidCarException("Capacity is invalid, must be bigger than: " + MIN_PASSENGER_SEAT +
                    "and less than: " + MAX_PASSENGER_SEAT, "capacity", age);
        }
    }

    //TODO
    private int getAgeInYears(LocalDate date) {
        return Period.between(date, LocalDate.now()).getYears();
    }

    //TODO
    public void printCarInfo() throws Exception {
        if (1 != 2) {
            throw new Exception("From Parent");
            //   throw new InvalidCarException("TT", null, null);
        }
    }

    private void checkTechnicalCondition(int technicalConditionToValidate) throws InvalidCarException {
        if (technicalConditionToValidate < MIN_TECHNICAL_CONDITION
                || technicalConditionToValidate > MAX_TECHNICAL_CONDITION) {
            throw new InvalidCarException("Technical condition is invalid, must be higher then: " + MIN_TECHNICAL_CONDITION +
                    " and lower then: " + MAX_TECHNICAL_CONDITION, "technical condition", technicalCondition);
        }
    }


}
