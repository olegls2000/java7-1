package bte.autosalon;

import java.time.LocalDate;

public class Truck extends AbstractCar {
    private static final int MIN_CARGO = 200;
    private static final int MAX_CARGO = 1500;

    private int cargo;

    public Truck(int techStatus, LocalDate releaseDate, CarManufacturer manufacturer, int cargo) throws InvalidCarExeption {
        super(techStatus, releaseDate, manufacturer);
        checkCargo(cargo);
        this.cargo = cargo;
    }

    public int printCarInfo() throws Throwable {
        System.out.println("Hello from Truck");
        if (1 != 2) {
            throw new InvalidCarExeption(null, null, null);
        } else {
            throw new IllegalAccessException();
        }
    }

    public int excWithFinal() {
        int result = 1;
         {
            try {
                result++;
                throw new RuntimeException ("Random exc");

            } catch (RuntimeException e) {
                result++;
                e.printStackTrace();
            } finally {
                result++;
            }
        }
        return result;
    }

    private void checkCargo(int cargo) {
        if (cargo > MAX_CARGO || cargo < MIN_CARGO) {
            System.out.println("Cargo is invalid, must be bigger than: " + MIN_CARGO +
                    "and less than: " + MAX_CARGO);
            throw new RuntimeException("Unacceptable conditions");
        }
    }
}
