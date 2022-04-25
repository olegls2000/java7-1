package bte.autosalon;

import java.time.LocalDate;

public class Mercedes extends Auto{

    private int cargo;

    public Mercedes(int techStatus, LocalDate date,int cargo) {
        super(techStatus, date);
        this.cargo=cargo;
    }
}
