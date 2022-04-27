package bte.lesson11HomeWork;

import static bte.util.Print.print;

public class PassengerCar extends Car{
    private static final int MIN_SEATS_NUMBERS = 2;
    private static final int MAX_SEATS_NUMBERS = 8;
    private int numberOfSeats;
    final private int numberOfSeatsFactor = 8;


    //Легкового: ПассажироМеста * КоэфПассажиромест - возрастАвтомобиля
    // *КоэфВозраста + техничСостояние * КоэфТехнСостояния
    public int getAssessedValue(){
        int result = numberOfSeats * numberOfSeatsFactor - getYear() * ageFactor
                + getTechnicalCondition() * technicalConditionFactor;
        return result;
    }//Оценочная стоимость


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        checkNumberOfSeats(numberOfSeats);
        this.numberOfSeats = numberOfSeats;
    }

    private void checkNumberOfSeats(int numberOfSeatsToValidate){
        if(numberOfSeatsToValidate > MAX_SEATS_NUMBERS ||
                numberOfSeatsToValidate< MIN_SEATS_NUMBERS){
            print("Maximum numbers of seats must be less than: " + MAX_SEATS_NUMBERS
            + " and Minimum number of seats must be bigger than: " + MIN_SEATS_NUMBERS);
            throw new RuntimeException("Wrong numbers of seats");
        }
    }
}
