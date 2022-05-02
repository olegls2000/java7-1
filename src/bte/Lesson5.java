package bte;

import bte.model.Circle;
import bte.model.Human;
import bte.util.CircleUtils;

import java.util.ArrayList;
import java.util.Map;

public class Lesson5 {
    public static void main(String[] args) {
        int i = 7;
        Human human1 = new Human("Ivanov");
        human1.name = "Ivan";
        human1.getOlder();
        human1.gender = 0;

        Human human2 = new Human("Biden");
        human2.name = "Joe";
        human2.getOlder();
        human2.gender = 0;

        Human human3 = new Human("Filatova");
        human3.name = "Katerina";
        human3.getOlder();
        human3.gender = 1;
        Human[] company = {human1, human2, human3};
        Human youngest = company[0];
        for (Human human : company) {
            if (human.age < youngest.age) {
                youngest = human;
            }
        }
        System.out.println("The youngest is: " + youngest.name +
                "with age: " + youngest.age);

        human3.marriage(human2);

        Human human4 = new Human(38, "Fill");

        Map<Integer, Circle> circles = CircleUtils.getCircles(6);
        Circle maxAreaCircle = CircleUtils.getCirceWithMaxArea(
                new ArrayList<>(circles.values())
        );
        System.out.println("bte.Circle with the biggest area: "
                + maxAreaCircle.getArea() + " with radius: "
                + maxAreaCircle.getRadius());
    }


}
