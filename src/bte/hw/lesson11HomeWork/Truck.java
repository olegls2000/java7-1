package bte.hw.lesson11HomeWork;

import static bte.util.Print.print;

public class Truck extends Car {
    private static final int MIN_CARRYING_WEIGHT = 200;
    private static final int MAX_CARRYING_WEIGHT = 1_500;
    private int carrying;// Грузоподъёмность
    final private int loadFactor = 15;


    public int getAssessedValue() {
        //Грузового: грузоподьемность*КоэфГруза -
        // возрастАвтомобиля*КоэфВозраста+техничСостояние*КоэфТехнСостояния
        int result = carrying * loadFactor
                - getYear() * ageFactor
                + getTechnicalCondition()
                * technicalConditionFactor;

        return result;

    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        checkWeight(carrying);
        this.carrying = carrying;
    }

    private void checkWeight(int weightToValidate) {
        if (weightToValidate > MAX_CARRYING_WEIGHT ||
                weightToValidate < MIN_CARRYING_WEIGHT) {
        print("Maximum weight must be bigger than: "
        + MIN_CARRYING_WEIGHT + " and less than: " + MAX_CARRYING_WEIGHT);
        throw new RuntimeException("Invalid weight");
        }
    }
}

