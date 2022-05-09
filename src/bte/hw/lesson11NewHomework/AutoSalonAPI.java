package bte.hw.lesson11NewHomework;

public interface AutoSalonAPI {
    <T extends AbstractCar>int buyCar(T auto);

    int sellCar(int i);

    void report();
}
