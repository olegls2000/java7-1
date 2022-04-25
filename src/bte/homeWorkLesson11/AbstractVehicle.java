package bte.homeWorkLesson11;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class AbstractVehicle implements InterfaceVehicle {
    private int age;
    private int technicalCondition;
    private VehicleBrand carBrand;



    public AbstractVehicle(int age, int technicalCondition, VehicleBrand carBrand) {
        checkTechnicalCondition(technicalCondition);
        this.age = age;
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

    static int getAgeFromConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input car age ...");
        final var ageFromConsole = scanner.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d.M.yyyy");
        LocalDate carIssueDate = LocalDate.parse(ageFromConsole, dateFormat);
        LocalDate dateNow = LocalDate.now();
        int carAge = Period.between(carIssueDate, dateNow).getYears();
        return carAge;
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
}
