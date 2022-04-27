package bte.autosalon;

public interface AutoSalonApi {
    <AC extends AbstractCar> int buyCar(AC auto);

    int sellCar(int i);

    void report();
}