package bte.hw.lesson11HomeWork;

import static bte.util.Print.print;

public class Car {
    private int year;
    private int technicalCondition;
    private static final int MIN_TECHNICAL_CONDITION = 1;
    private static final int MAX_TECHNICAL_CONDITION = 10;
    private String manufacturer;
    private int price;
    final int ageFactor = 8;
    final int technicalConditionFactor = 100;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTechnicalCondition(int technicalCondition) {
        checkTechnicalCondition(technicalCondition);
        this.technicalCondition = technicalCondition;
    }

    public int getTechnicalCondition() {
        return technicalCondition;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private void checkTechnicalCondition(int technicalConditionToValidate) {
        if (technicalConditionToValidate > MAX_TECHNICAL_CONDITION ||
                technicalConditionToValidate < MIN_TECHNICAL_CONDITION) {
            print("Technical condition is invalid, must be bigger than: "
                    + MIN_TECHNICAL_CONDITION + " and maximum condition is: "
                    + MAX_TECHNICAL_CONDITION);
            throw new RuntimeException("Invalid tec. condition");
        }
    }
}
