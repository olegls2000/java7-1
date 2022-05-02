package bte.homeWorkLesson11;

import java.time.LocalDate;
import java.util.Scanner;

import static bte.homeWorkLesson11.CarUtils.*;

public class Truck extends AbstractVehicle {

    private final int load;

    public Truck() {
        this(
                getReleaseDateFromConsole(), getTechnicalConditionFromConsole(),
                getLoadFormConsole(), getCarBrandFromConsole());
    }

    public Truck(LocalDate releasedDate, int technicalCondition, int load, VehicleBrand carBrand) {
        super(releasedDate, technicalCondition, carBrand);
        checkLoad(load);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    @Override
    public void printCarInfo() throws Exception {
        System.out.println("Hello from truck");

        //TODO
        if (1 == 2) {
            throw new InvalidCarException(null, null, null);
        } else {
            throw new IllegalAccessException();
        }
    }

    void checkLoad(int loadToValidate) {
        if (loadToValidate < MIN_LOAD
                || loadToValidate > MAX_LOAD) {
            throw new InvalidCarException("Load is invalid, must be higher then: " + MIN_LOAD +
                    " and lower then: " + MAX_LOAD, "load", load);
        }
    }
}
