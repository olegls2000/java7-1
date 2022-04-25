package bte.autosalon;

import java.time.LocalDate;
import java.time.Period;

public class AbstractCar {
    private int checkAge(LocalDate releaseDate, int maxAge) {
        final var age = Period.between(releaseDate, LocalDate.now()).getYears();
       /* if (age > MAX_AGE){
            new RuntimeException("Car age is greater than Max");
        }*/
        return age;
    }
}
