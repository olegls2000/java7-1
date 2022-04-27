package bte;

import bte.autosalon.CarManufacturer;
import bte.autosalon.InvalidCarExeption;
import bte.autosalon.Truck;

import java.time.LocalDate;

public class Lesson12 {

    public static void main(String[] args)  {
        Truck car1 = null;
        try {
            car1 = new Truck(3, LocalDate.of(2015, 1, 1), CarManufacturer.TOYOTA, 300);
            throw new Exception("Random");
        } catch (InvalidCarExeption e) {
            e.printStackTrace();
            System.out.println("Car is invalid + " + e.getCarPropertyName() + "=" + e.getValue());
        } catch (Exception exception){
            System.out.println("Some rundom exc happened");
        }
        if (car1 !=null){
            try {
                car1.printCarInfo();
            } catch (InvalidCarExeption e) {
                e.printStackTrace();
            }
            catch (IllegalAccessException e){
                e.printStackTrace();
            }
            catch (Throwable e){
                e.printStackTrace();
            }
        }
        System.out.println(car1.excWithFinal());
    }
}
