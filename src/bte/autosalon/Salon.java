package bte.autosalon;

import bte.pattern.iterator.Iterator;

public class Salon implements Collection {

    private static final int CARGO = 15;
    private static final int AGE = 8;
    private static final int TECHSTATUS = 100;
    private static final int CAPACITY = 150;


    private int balance;
    private Auto[] property = new Auto[8];


    Salon salon = new Salon();
    Iterator iterator = salon.getIteraror();

    BMW bmw320 = new BMW(5, 01.01.2019,4);


    private int bayCar(Auto auto) {

    }

    private int sellCar(int i) {
int salePrice = estimatedValueOfTheCar()
    }

    private String report() {
        System.out.println(balance);
        System.out.println("Cars in stock ");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        return null;
    }


    private double estimatedValueOfTheTruck(Auto auto) {
        double estValTruck = (auto.cargo * CARGO) - (auto.age * AGE) + (auto.techStatus * TECHSTATUS);
        return estValTruck;
    }

    private double estimatedValueOfTheCar(Auto auto) {
        double estValTruck = (auto.capacity * CAPACITY) - (auto.age * AGE) + (auto.techStatus * TECHSTATUS);
        return estValTruck;
    }

    @Override
    public Iterator getIteraror() {
        return new AutoIterator();
    }

    private class AutoIterator implements Iterator {
        private int position;

        @Override
        public boolean hasNext() {
            if (position < property.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return property[position++];
        }
    }

}
