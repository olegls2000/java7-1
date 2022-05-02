package bte.homeWorkLesson11;

import java.time.LocalDate;
import java.util.Scanner;

import static bte.homeWorkLesson11.CarUtils.*;

public class Car extends AbstractVehicle {

    private int passengerSeats;

    public Car() {
        this(
                getReleaseDateFromConsole(), getTechnicalConditionFromConsole(),
                getPassengerSeatsFormConsole(), getCarBrandFromConsole());
    }

    public Car(LocalDate releasedDate, int technicalCondition, int passengerSeats, VehicleBrand carBrand) {
        super(releasedDate, technicalCondition, carBrand);
        checkPassengerSeat(passengerSeats);
        this.passengerSeats = passengerSeats;
    }

    //TODO
    public void carPrice() {
        int carPrice =
               this.getPassengerSeats() * PASSENGER_SEAT_FACTOR - this.getAge() * AGE_FACTOR +
                        this.getTechnicalCondition() * TECHNICAL_CONDITION_FACTOR;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        checkPassengerSeat(passengerSeats);
        this.passengerSeats = passengerSeats;
    }

    void checkPassengerSeat(int passengerSeatToValidate) {
        if (passengerSeatToValidate < MIN_PASSENGER_SEAT
                || passengerSeatToValidate > MAX_PASSENGER_SEAT) {
            throw new InvalidCarException("Invalid passenger seats, must be higher then: " + MIN_PASSENGER_SEAT +
                    " and lower then: " + MAX_PASSENGER_SEAT, "passenger seats", passengerSeats);
        }
    }
}
