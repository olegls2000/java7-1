package bte.autosalonadvanced.service;

import bte.autosalonadvanced.model.Car;
import bte.autosalonadvanced.model.Manufacturers;
import bte.autosalonadvanced.model.PassengerCar;
import bte.autosalonadvanced.model.Truck;

import java.time.LocalDate;

public class Usage {
    public static void main(String[] args) {
        AutoSalonI autoSalon = new AutoSalon(30000);

        Car car1 = new PassengerCar(2, Manufacturers.TOYOTA, 6);
        car1.setLocalDate(LocalDate.of(2000, 10, 22));

        try {
            car1.setLocalDate(LocalDate.of(2000, 10, 26));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        autoSalon.buyCar(car1);

        Car truck1 = new Truck(2, Manufacturers.HONDA, 200);
        truck1.setLocalDate(LocalDate.of(2000, 10, 22));
        autoSalon.buyCar(truck1);

        autoSalon.sellCar(0);
        autoSalon.sellCar(0);
        autoSalon.sellCar(10);
        Car car2 = new PassengerCar(7, Manufacturers.TOYOTA, 4);
        car2.setLocalDate(LocalDate.of(2020, 10, 22));
        autoSalon.buyCar(car2);
        autoSalon.report();
    }
}
