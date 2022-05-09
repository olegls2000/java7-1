package bte.hw.lesson11NewHomework;

public class AbstractCar {
    private static final int MIN_CARRYING_WEIGHT = 200;
    private static final int MAX_CARRYING_WEIGHT = 1_500;

    private static final int MIN_SEATS_NUMBERS = 2;
    private static final int MAX_SEATS_NUMBERS = 8;

    private static final int MIN_TECHNICAL_CONDITION = 1;
    private static final int MAX_TECHNICAL_CONDITION = 10;
    private int carrying;// Грузоподъёмность
    final private int loadFactor = 15;

    private int numberOfSeats;
    final private int numberOfSeatsFactor = 8;

    private int year;
    private int technicalCondition;
    private String manufacturer;
    private int price;
    final int ageFactor = 8;
    final int technicalConditionFactor = 100;
}
