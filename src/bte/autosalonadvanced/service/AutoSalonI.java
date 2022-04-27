package bte.autosalonadvanced.service;

import bte.autosalonadvanced.model.Car;

public interface AutoSalonI {
    <T extends Car> int buyCar(T car) throws InvalidAutoSalonStateException;

    int sellCar(int i) throws InvalidAutoSalonStateException;

    String report();
}
