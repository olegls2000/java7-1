package bte;

import bte.autosalon.CarManufacturer;
import bte.autosalon.InvalidCarException;
import bte.autosalon.Truck;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lesson12 {
    public static void main(String[] args) {

        Truck car1 = null;
        try {
            car1 = new Truck(3,
                    LocalDate.of(2015, 1, 1),
                    CarManufacturer.TOYOTA,
                    300);
            throw new Exception("Random");
        } catch (InvalidCarException exception) {
            //exception.printStackTrace();
            System.out.println("Car is invalid + with next problem:" + exception.getCarPropertyName()
                    + "=" + exception.getValue());
        } catch (Exception exception) {
            System.out.println("Some random exc happened");
        } catch (Throwable tr) {
            System.out.println("Some Parent exc");
        }
        if (car1 != null) {
            try {
                car1.printCarInfo();
            } catch (InvalidCarException e) {
                e.printStackTrace();
                System.out.println("dasfadsfdsaf");
                throw new RuntimeException(e.getCause());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                throw new RuntimeException(e.getCause());
            } catch (Throwable e) {
                e.printStackTrace();
                throw new RuntimeException(e.getCause());
            }
        }

        System.out.println(car1.excWithFinal());

        String str = "";
        ArrayList ll = new ArrayList();
    }
}
