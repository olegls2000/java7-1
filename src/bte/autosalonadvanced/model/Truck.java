package bte.autosalonadvanced.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Truck extends Car {
    private static final int COEFFICIENT_CARGO = 15;
    private final static int MIN_LOAD_CAPACITY = 200;
    private final static int MAX_LOAD_CAPACITY = 1500;

    private int loadCapacity;

    public Truck(final int technicalCondition,final Manufacturers manufacturer, final int loadCapacity)  {

           super(technicalCondition, manufacturer);

        if (isLoadCapacity(loadCapacity))
            this.loadCapacity = loadCapacity;
        else
            throw new RuntimeException("Load capacity must be between "
                    + MIN_LOAD_CAPACITY + " and " + MAX_LOAD_CAPACITY);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    private static boolean isLoadCapacity(final int loadCapacity) {
        if (loadCapacity >= MIN_LOAD_CAPACITY && loadCapacity <= MAX_LOAD_CAPACITY)
            return true;
        return false;
    }
    @Override
    public int EstimatedCost() {
     //   грузоподьемность*КоэфГруза - возрастАвтомобиля*КоэфВозраста+техничСостояние*КоэфТехнСостояния
     //   long between = ChronoUnit.YEARS.between(getLocalDate(),LocalDate.now() );

        return loadCapacity * COEFFICIENT_CARGO -
                Period.between(LocalDate.now(), getLocalDate()).getYears()*COEFFICIENT_AGE +
                getTechnicalCondition() * COEFFICIENT_TECHNICAL_STATE;

    }
}
