package bte.autosalonadvanced.service;

import bte.autosalonadvanced.model.*;

import java.time.LocalDate;

public class Usage {
    public static void main(String[] args) {
        AutoSalonI autoSalon = new AutoSalon(30000);
        try {
            Car car1 = new PassengerCar(4, Manufacturers.TOYOTA, 4);
            car1.setLocalDate(LocalDate.of(2000, 10, 22));
            //     car1.setLocalDate(LocalDate.of(2000, 10, 26));6
            autoSalon.buyCar(car1);

            Car truck1 = new Truck(2, Manufacturers.HONDA, 200);
            truck1.setLocalDate(LocalDate.of(2000, 10, 22));
            autoSalon.buyCar(truck1);

            autoSalon.sellCar(0);
            //    autoSalon.sellCar(0);
            //    autoSalon.sellCar(10);
            Car car2 = new PassengerCar(7, Manufacturers.TOYOTA, 4, LocalDate.of(2020, 10, 22));
            //   car2.setLocalDate(LocalDate.of(2020, 10, 22));
            autoSalon.buyCar(car2);
            autoSalon.report();
        } catch (InvalidCarException | InvalidAutoSalonStateException ex) {
            System.out.println(ex);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
