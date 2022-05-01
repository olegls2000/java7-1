package bte.autosalon;

public interface AutoSalonApi {
    <T extends AbstractCar> int buyCar(T auto);
        int sellCar(int i);
        void report();

    }

