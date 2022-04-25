package bte.homeWorkLesson11;

public interface InterfaceVehicle {
    int LOAD_FACTOR = 15;
    int AGE_FACTOR = 8;
    int TECHNICAL_CONDITION_FACTOR = 100;
    int PASSENGER_SEAT_FACTOR = 150;
    int MIN_TECHNICAL_CONDITION = 0;
    int MAX_TECHNICAL_CONDITION = 100;
    int MIN_LOAD = 200;
    int MAX_LOAD = 1500;
    int MIN_PASSENGER_SEAT = 2;
    int MAX_PASSENGER_SEAT = 8;


    default void checkTechnicalCondition(int technicalConditionToValidate) {
        if (technicalConditionToValidate < MIN_TECHNICAL_CONDITION
                || technicalConditionToValidate > MAX_TECHNICAL_CONDITION) {
            System.out.println("Technical condition is invalid, must be higher then:" + MIN_TECHNICAL_CONDITION +
                    ", and lower then: " + MAX_TECHNICAL_CONDITION);
            throw new RuntimeException("Invalid technical condition!");
        }
    }

    default void checkPassengerSeat(int passengerSeatToValidate) {
        if (passengerSeatToValidate < MIN_PASSENGER_SEAT
                || passengerSeatToValidate > MAX_PASSENGER_SEAT){
            System.out.println("Passenger seats is invalid, must be higher then:" + MIN_PASSENGER_SEAT
            + ", and lower then" + MAX_PASSENGER_SEAT);
            throw new RuntimeException("Invalid passenger seats!");
        }
    }

    default void checkLoad(int loadToValidate) {
        if (loadToValidate < MIN_LOAD
                || loadToValidate > MAX_LOAD){
            System.out.println("Load is invalid, must be higher then:" + MIN_LOAD
                    + ", and lower then" + MAX_LOAD);
            throw new RuntimeException("Invalid load!");
        }
    }
}
