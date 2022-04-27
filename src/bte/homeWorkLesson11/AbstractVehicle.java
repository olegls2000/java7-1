package bte.homeWorkLesson11;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class AbstractVehicle implements InterfaceVehicle {
    private static final int MAX_AGE = 8;
    LocalDate releasedDate;
    private int age;
    private int technicalCondition;
    private VehicleBrand carBrand;


    public AbstractVehicle(LocalDate releasedDate, int technicalCondition, VehicleBrand carBrand) throws InvalidCarException {
        checkTechnicalCondition(technicalCondition);
        checkAge(releasedDate);
        this.releasedDate = releasedDate;
        this.technicalCondition = technicalCondition;
        this.carBrand = carBrand;
    }

    static VehicleBrand getCarBrandFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Pleas input Car Brand ...");
        final var carBrandFromConsole = scanner.nextLine();
        final var carBrand = VehicleBrand.valueOf(carBrandFromConsole);
        return carBrand;
    }

    static LocalDate getReleaseDateFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input car release date ...");
        final var ageFromConsole = scanner.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d.M.yyyy");
        LocalDate carIssueDate = LocalDate.parse(ageFromConsole, dateFormat);
        return carIssueDate;
    }

    static int getTechnicalConditionFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input car technical condition ...");
        final var carTechnicalConditionFromConsole = scanner.nextInt();
        final var technicalCondition = carTechnicalConditionFromConsole;
        return technicalCondition;
    }

    public int getAge() {
        return age;
    }

    public int getTechnicalCondition() {
        return technicalCondition;
    }

    public VehicleBrand getCarBrand() {
        return carBrand;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTechnicalCondition(int technicalCondition) {
        checkTechnicalCondition(technicalCondition);
        this.technicalCondition = technicalCondition;
    }

    public void setCarBrand(VehicleBrand carBrand) {
        this.carBrand = carBrand;
    }

    private void checkAge(LocalDate releaseDate) throws InvalidCarException {
        final var age = Period.between(releaseDate, LocalDate.now()).getYears();
        if (age > MAX_AGE) {
            try {
                throw new InvalidCarException("Car age is greater than Max", "age", age);
            } catch (InvalidCarException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private int getAgeInYears(LocalDate date) {
        return Period.between(date, LocalDate.now()).getYears();
    }

    public void printCarInfo() throws Exception {
        if (1 != 2) {
            throw new Exception("From Parent");
            //   throw new InvalidCarException("TT", null, null);
        }
    }

}
