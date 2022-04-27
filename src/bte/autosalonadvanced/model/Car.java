package bte.autosalonadvanced.model;

import java.time.LocalDate;
import java.time.Period;

public abstract class Car {
    private final static int MIN_TECHNICAL_CONDITION = 1;
    private final static int MAX_TECHNICAL_CONDITION = 10;


    private LocalDate localDate;
    private final int technicalCondition;
    private final Manufacturers manufacturer;

    public Car(final int technicalCondition, final Manufacturers manufacturer)
            throws InvalidCarException {
        if (isTechnicalCondition(technicalCondition)) {
            this.technicalCondition = technicalCondition;
        } else
            throw new InvalidCarException("Technical condition must be between " +
                    MIN_TECHNICAL_CONDITION + " and " + MAX_TECHNICAL_CONDITION + ", was " + technicalCondition,
                    "Technical condition", this);

        this.manufacturer = manufacturer;
    }
    public Car(final int technicalCondition, final Manufacturers manufacturer, final LocalDate localDate)
            throws InvalidCarException {
       this(technicalCondition,manufacturer);
       this.localDate=localDate;
    }
    private static boolean isTechnicalCondition(final int technicalCondition) {

        return technicalCondition >= MIN_TECHNICAL_CONDITION && technicalCondition <= MAX_TECHNICAL_CONDITION;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) throws InvalidCarException {
        if (this.localDate == null) {
            this.localDate = localDate;
        } else
            throw new InvalidCarException("Production date was already set - " + localDate, "localDate",
                    this);

    }

    public int getAge() {
        return Period.between(getLocalDate(), LocalDate.now()).getYears();
    }

    public int getTechnicalCondition() {
        return technicalCondition;
    }

    public Manufacturers getManufacturer() {
        return manufacturer;
    }

}
