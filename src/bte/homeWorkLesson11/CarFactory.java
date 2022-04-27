package bte.homeWorkLesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarFactory {
    List<AbstractVehicle> constructCar() {
        List<AbstractVehicle> parking = new ArrayList<>();
        System.out.println("Select Car type: 1- Truck, 2-Passenger");
        var scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        if (type == 1) {
            parking.add(new Car());
        } else {
            parking.add(new Truck());
        }
        return parking;
    }
}
