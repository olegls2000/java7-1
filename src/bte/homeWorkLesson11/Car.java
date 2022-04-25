package bte.homeWorkLesson11;

import java.util.Scanner;

public class Car extends AbstractVehicle implements InterfaceVehicle {

    private int passengerSeats;

    public Car() {
        this(
                getAgeFromConsole(), getTechnicalConditionFromConsole(),
                getPassengerSeatsFormConsole(), getCarBrandFromConsole());
    }

    public Car(int age, int technicalCondition, int passengerSeats, VehicleBrand carBrand) {
        super(age, technicalCondition, carBrand);
        checkPassengerSeat(passengerSeats);
        this.passengerSeats = passengerSeats;
    }

    private static int getPassengerSeatsFormConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input quantity of passenger seats ...");
        final var carPassengerSeatsFormConsole = scanner.nextInt();
        return carPassengerSeatsFormConsole;
    }

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
}
