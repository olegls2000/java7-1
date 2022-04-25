package bte.autosalonadvanced.model;

import java.time.LocalDate;

public abstract class Car implements Cost {
    private final static int MIN_TECHNICAL_CONDITION = 1;
    private final static int MAX_TECHNICAL_CONDITION = 10;
    protected final static int COEFFICIENT_AGE = 8;
    protected final static int COEFFICIENT_TECHNICAL_STATE = 100;

    private LocalDate localDate;
    private final int technicalCondition;
    private final Manufacturers manufacturer;

    public Car(final int technicalCondition, final Manufacturers manufacturer) {
        if (isTechnicalCondition(technicalCondition)) {
            this.technicalCondition = technicalCondition;
        } else
            throw new RuntimeException("Technical condition must be between " +
                    MIN_TECHNICAL_CONDITION + " and " + MAX_TECHNICAL_CONDITION);
        this.manufacturer = manufacturer;
    }

    private static boolean isTechnicalCondition(final int technicalCondition) {
        return technicalCondition >= MIN_TECHNICAL_CONDITION && technicalCondition <= MAX_TECHNICAL_CONDITION;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        if (this.localDate==null) {
            this.localDate = localDate;
        } else
            throw  new RuntimeException("Production date was already set");

    }

    public int getTechnicalCondition() {
        return technicalCondition;
    }


    public Manufacturers getManufacturer() {
        return manufacturer;
    }

}
