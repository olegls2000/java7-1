package bte.autosalon;

public interface AutoSalonApi {
    <T extends AbstractCar> int buyCar(T auto) throws InvalidCarExeption;
    int sellCar(int i) throws InvalidCarExeption;
    void report();

}
