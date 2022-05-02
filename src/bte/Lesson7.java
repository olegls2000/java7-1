package bte;

import bte.model.Car;
import bte.model.simple.SimpleTriangle;
import bte.service.AutoSalon;

public class Lesson7 {
    public static void main(String[] args) {
        SimpleTriangle triangle
                = new SimpleTriangle(1, 2, 2);
        triangle.setA(10);
        triangle.setB(10);
        triangle.setC(10);
        System.out.println("Perimeter:" +
                triangle.calculatePerimeter());
        /**
         * Склад-магазин вместимостью до 6 автомобилей, который может хранить и
         * продавать автомобили, а так же накапливать деньги в кассе.
         * 1. Реализовать класс автомобиль у которго есть:
         * цвет (может быть - Красный, белый, черный, применить константы(подумать
         * какого типа они должны быть) ), вес (от 1200 до 2500 кг) и цена
         * (от 10 000 до 100 000). Реализуйте в классе конструктор в
         * котором все параметы автомобиля должны вводиться из консоли.
         * Инкапсулируйте свойства класса так чтоб небыло возможности
         * ввести некорректные данные(проверка в конструкторе+сеттеры).
         * 2. Реализуйте класс Склад-Магазин,
         * который может хранить максимум 5 автомобилей.
         * Склад магазин должен знать сколько автомобилей у него храниться и на каком они месте.
         * 3. Реализуйте метод "добавить автомобиль на склад"
         * который добавляет автомобиль, и в случае если все места заняты просит
         * продать какой то из автомобилей на складе.
         * Под добавлением автомобиля подразумевается покупка за деньги,
         * которы имеются в кассе и размешение его на любом первом попавшемся
         * свободном месте.
         * 4. Реализуйте метод "продать автомобиль" который может
         * продать автомобиль из указанного места на парковке.
         * В результате продажи касса магазина пополняется деньгами.
         * Причем цена продажи автомобиля на 20 % выше стоимости автомобиля.
         * 5. Реализуйте отчет, в котором можно увитеть состояние
         * Склад-Магазина (подумайте сами, какую информацию необходимо в
         * него включить чтобы кнтролировать корректность работы магазина)
         * Примените инкапсуляцию, к классу Склад-Магазин.
         */

        final var autoSalon = new AutoSalon();
        Car car = new Car();
        autoSalon.buyCar(car);
        autoSalon.report();
        autoSalon.sellCar(0);
        autoSalon.report();

    }
}
