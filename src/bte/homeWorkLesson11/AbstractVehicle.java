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
    private final int MIN_LOAD = 200;
    private final int MAX_LOAD = 1500;
    private final int MIN_PASSENGER_SEAT = 2;
    private final int MAX_PASSENGER_SEAT = 8;
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
            //TODO
            try {
                throw new InvalidCarException("Car age is greater than Max", "age", age);
            } catch (InvalidCarException e) {
                //TODO
                throw new RuntimeException(e);
            }
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

    private void checkTechnicalCondition(int technicalConditionToValidate) {
        if (technicalConditionToValidate < MIN_TECHNICAL_CONDITION
                || technicalConditionToValidate > MAX_TECHNICAL_CONDITION) {
            System.out.println("Technical condition is invalid, must be higher then:" + MIN_TECHNICAL_CONDITION +
                    ", and lower then: " + MAX_TECHNICAL_CONDITION);
            throw new RuntimeException("Invalid technical condition!");
        }
    }

    void checkPassengerSeat(int passengerSeatToValidate) {
        if (passengerSeatToValidate < MIN_PASSENGER_SEAT
                || passengerSeatToValidate > MAX_PASSENGER_SEAT) {
            System.out.println("Passenger seats is invalid, must be higher then:" + MIN_PASSENGER_SEAT
                    + ", and lower then" + MAX_PASSENGER_SEAT);
            try {
                throw new RuntimeException("Invalid passenger seats!");
            } catch (InvalidCarException e) {
                throw new InvalidCarException("Invalid passenger seats", e.getCarPropertyName(), MIN_PASSENGER_SEAT
                        + " " + MAX_PASSENGER_SEAT);
            }
        }
    }

    void checkLoad(int loadToValidate) {
        if (loadToValidate < MIN_LOAD
                || loadToValidate > MAX_LOAD) {
            try {
                throw new Exception("Invalid load");
            } catch (InvalidCarException e) {
                throw new InvalidCarException("Invalid load", e.getCarPropertyName(), MIN_LOAD + " " + MAX_LOAD);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
