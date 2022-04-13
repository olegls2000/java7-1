package bte;

import bte.model.Circle;
import bte.model.Human;
import bte.utils.CircleUtils;

public class Lesson5 {
    public static void main(String[] args) {
        int i = 7;
        Human human1 = new Human("Ivanov");
        // human1.age = getRandom(18, 65);
        human1.setName("Ivan");
        human1.getOlder();
        human1.setGender((byte) 0);

        Human human2 = new Human("Baid");
        human2.setName("Joe");
        // human2.age = getRandom(18, 65);
        human2.getOlder();
        human2.setGender((byte) 0);

        Human human3 = new Human("Filatova");
        human3.setName("Katerina");
        // human3.age = getRandom(18, 65);
        human3.getOlder();
        human3.setGender((byte) 1);

        Human[] company = {human1, human2, human3};

        Human youngest = company[0];
        for (Human human : company) {
            if (human.getAge() < youngest.getAge()) {
                youngest = human;
            }
        }

        System.out.println("the youngest is: " + youngest.getName() +
                " with age: " + youngest.getAge());

        human3.marriage(human2);

        Human human4 = new Human(38, "Fill");

        Circle[] circles = CircleUtils.getCircle(100);
        Circle maxArea = CircleUtils.getCircleWithMaxArea(circles);
        System.out.println("bte.Circle with the biggest area: "
                + maxArea.getArea() + " with radius: "
                + maxArea.getRadius());
    }
}
