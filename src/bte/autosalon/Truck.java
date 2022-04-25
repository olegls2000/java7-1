package bte.autosalon;

import java.time.LocalDate;

public class Truck extends AbstractCar {
    private static final int MIN_CARGO = 200;
    private static final int MAX_CARGO = 1500;

    private int cargo;

    public Truck(int techStatus, LocalDate releaseDate, CarManufacturer manufacturer, int cargo) {
        super(techStatus, releaseDate, manufacturer);
        checkCargo(cargo);
        this.cargo = cargo;
    }

    private void checkCargo(int cargo) {
        if (cargo > MAX_CARGO || cargo < MIN_CARGO) {
            System.out.println("Cargo is invalid, must be bigger than: " + MIN_CARGO +
                    "and less than: " + MAX_CARGO);
            throw new RuntimeException("Unacceptable conditions");
        }
    }
}
