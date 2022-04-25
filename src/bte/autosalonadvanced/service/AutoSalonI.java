package bte.autosalonadvanced.service;

import bte.autosalonadvanced.model.Car;

public interface AutoSalonI {
    int buyCar(Car car);
    int sellCar( int i);
    String report ();
}
