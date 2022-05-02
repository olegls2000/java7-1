package bte.homeWorkLesson11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CarUtils extends AbstractVehicle{
    public CarUtils(LocalDate releasedDate, int technicalCondition, VehicleBrand carBrand) throws InvalidCarException {
        super(releasedDate, technicalCondition, carBrand);
    }

    static VehicleBrand getCarBrandFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input Car Brand ...");
        final var carBrandFromConsole = scanner.nextLine();
        return VehicleBrand.valueOf(carBrandFromConsole);
    }

    static LocalDate getReleaseDateFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input car release date ...");
        final var ageFromConsole = scanner.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d.M.yyyy");
        return LocalDate.parse(ageFromConsole, dateFormat);
    }

    static int getTechnicalConditionFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input car technical condition ...");
        return scanner.nextInt();
    }

    static int getPassengerSeatsFormConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input quantity of passenger seats ...");
        final var carPassengerSeatsFormConsole = scanner.nextInt();
        return carPassengerSeatsFormConsole;
    }

    static int getLoadFormConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input truck load ...");
        return scanner.nextInt();
    }
}
