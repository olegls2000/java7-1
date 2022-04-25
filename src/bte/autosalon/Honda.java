package bte.autosalon;

import java.time.LocalDate;

public class Honda extends Auto{

    private int capacity;

    public Honda(int techStatus, LocalDate date, int capacity) {
        super(techStatus, date);
        this.capacity=capacity;
    }
}
