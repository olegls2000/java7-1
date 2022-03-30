import org.w3c.dom.ls.LSOutput;

public class Lesson5 {
    public static void main(String[] args) {
        int i = 7;
        Human human1 = new Human("Ivanov");
        // human1.age = getRandom(18, 65);
        human1.name = "Ivan";
        human1.getOlder();
        human1.gender = 0;

        Human human2 = new Human("Baid");
        human2.name = "Joe";
        // human2.age = getRandom(18, 65);
        human2.getOlder();
        human2.gender = 0;

        Human human3 = new Human("Filatova");
        human3.name = "Katerina";
        // human3.age = getRandom(18, 65);
        human3.getOlder();
        human3.gender = 1;

        Human[] company = {human1, human2, human3};

        Human youngest = company[0];
        for (Human human : company) {
            if (human.age < youngest.age) {
                youngest = human;
            }
        }

        System.out.println("the youngest is: " + youngest.name +
                " with age: " + youngest.age);

        human3.marriage(human2);

        Human human4 = new Human(38, "Fill");

        Circle[] circles = getCircle(100);
        Circle maxArea = getCircleWithMaxArea(circles);
        System.out.println("Circle with the biggest area: "
                + maxArea.getArea() + " with radius: "
                + maxArea.radius);

    }

    public static Circle getCircleWithMaxArea(Circle[] circles) {
        Circle result = circles[0];
        for (Circle circle:circles){
            if(circle.getArea()> result.getArea()){
                result = circle;
            }
        }
        return result;
    }

    public static Circle[] getCircle(int count) {
        Circle[] result = new Circle[count];
        for (int i = 0; i < count; i++) {
            result[i] = new Circle(getRandom(40, 100));
        }
        return result;
    }

    public static int getRandom(int a, int b) {
        return (int) (Math.random() * (b - a)) + a;
    }

}
