package bte.autosalon;

import java.time.LocalDate;

public class Toyota extends Auto{

    private int capacity;

    public Toyota(int techStatus, LocalDate date, int capacity) {
        super(techStatus, date);
        this.capacity=capacity;
    }
}
