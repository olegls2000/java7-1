import bte.autosalon.InvalidCarException;
import bte.autosalon.Truck;

import java.time.LocalDate;

public class Lesson12 {
    public static void main(String[] args) {
        try {
       /* Truck car1 = new Truck(3,
                LocalDate.of(2000));*/
        }catch (InvalidCarException exception){
            exception.printStackTrace();
            System.out.println("Car is invalid + " + exception.getCarPropertyName()
            + "=" + exception.getValue());
        }
    }
}
