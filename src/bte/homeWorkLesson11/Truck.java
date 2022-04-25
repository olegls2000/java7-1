package bte.homeWorkLesson11;

import java.util.Scanner;

public class Truck extends AbstractVehicle implements InterfaceVehicle {

    private int load;

    public Truck() {
        this(
                getAgeFromConsole(), getTechnicalConditionFromConsole(),
                getLoadFormConsole(), getCarBrandFromConsole());
    }

    public Truck(int age, int technicalCondition, int load, VehicleBrand carBrand) {
        super(age, technicalCondition, carBrand);
        checkLoad(load);
        this.load = load;
    }

    private static int getLoadFormConsole() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input truck load ...");
        final var truckLoad = scanner.nextInt();
        return truckLoad;
    }

    public int truckPrice() {
        int truckPrice =
                this.getLoad() * LOAD_FACTOR - this.getAge() * AGE_FACTOR
                        + this.getTechnicalCondition() * TECHNICAL_CONDITION_FACTOR;
        return truckPrice;
    }

    public int getLoad() {
        return load;
    }
}
