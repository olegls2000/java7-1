package bte.autosalon;

import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;


public abstract class  Auto {
    private static final int MIN_TECH_CONDITION = 1;
    private static final int MAX_TECH_CONDITION = 10;

    private static final int MIN_CARGO = 200;
    private static final int MAX_CARGO = 1500;

    private static final int MIN_CAPACITY = 2;
    private static final int MAX_CAPACITY = 8;


    int techStatus;
    int age;
    int cargo;
    int capacity;

    public Auto(int techstatus, LocalDate date ) {
        checkTechCondition(techstatus);
        this.techStatus = techstatus;
        this.age = date.getYear();
    }


    private void checkCargo(int cargo) {
        if (cargo > MAX_CARGO || cargo < MIN_CARGO) {
            System.out.println("Cargo is invalid, must be bigger than: " + MIN_CARGO +
                    "and less than: " + MAX_CARGO);
            throw new RuntimeException("Unacceptable conditions");
        }
    }
    private void checkTechCondition (int techCond) {
        if (techCond > MAX_TECH_CONDITION|| techCond < MIN_TECH_CONDITION) {
            System.out.println("TechCondition is invalid, must be bigger than: " + MIN_TECH_CONDITION +
                    "and less than: " + MAX_TECH_CONDITION);
            throw new RuntimeException("Unacceptable conditions");
        }
    }

    private void checkCapacity (int capacityPeople) {
        if (capacityPeople > MAX_CAPACITY|| capacityPeople < MIN_CAPACITY) {
            System.out.println("Capacity is invalid, must be bigger than: " + MIN_CAPACITY +
                    "and less than: " + MAX_CAPACITY);
            throw new RuntimeException("Unacceptable conditions");
        }
    }


    private int checkAge(LocalDate date){
        int age = Period.between(date,LocalDate.now()).getYears();
        return age;
    }




}
