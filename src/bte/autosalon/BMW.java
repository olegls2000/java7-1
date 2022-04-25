package bte.autosalon;

import java.time.LocalDate;

public class BMW extends Auto{

    private int capacity;

    public BMW(int techStatus, LocalDate date, int capacity ) {
        super(techStatus, date);
        this.capacity=capacity;
    }
}
