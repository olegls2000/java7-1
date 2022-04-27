package bte.homeWorkLesson11;

public interface AutoSalonApi {
  <T extends AbstractVehicle> int buyCar(T auto);
    int sellCar(int i);
    void report();
}
