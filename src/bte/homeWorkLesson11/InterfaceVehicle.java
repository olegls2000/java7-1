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
            try {
                throw new RuntimeException("Invalid passenger seats!");
            } catch (InvalidCarException e) {
                throw new InvalidCarException("Invalid passenger seats", e.getCarPropertyName(),MIN_PASSENGER_SEAT + " " + MAX_PASSENGER_SEAT);
            }
        }
    }

    default void checkLoad(int loadToValidate) {
        if (loadToValidate < MIN_LOAD
                || loadToValidate > MAX_LOAD){
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
