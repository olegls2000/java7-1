package bte.homeWorkLesson11;

import java.time.LocalDate;
import java.util.Scanner;

public class Truck extends AbstractVehicle implements InterfaceVehicle {

    private int load;

    public Truck() {
        this(
                getReleaseDateFromConsole(), getTechnicalConditionFromConsole(),
                getLoadFormConsole(), getCarBrandFromConsole());
    }

    public Truck(LocalDate releasedDate, int technicalCondition, int load, VehicleBrand carBrand) {
        super(releasedDate, technicalCondition, carBrand);
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

    @Override
    public void printCarInfo() throws Exception {
        System.out.println("Hello from truck");
        if (1 == 2) {
            throw new InvalidCarException(null, null, null);
        } else {
            throw new IllegalAccessException();
        }
    }

    public int excWithFinal() {
        int result = 1;
        try {
            result++;
            throw new RuntimeException("Random exc");
        } catch (RuntimeException e) {
            result++;
            throw new RuntimeException(e);
        } finally {

            return result;
        }
    }
}
