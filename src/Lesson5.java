public class Lesson5 {
    public static void main(String[] args) {
        int i = 7;
        Human human1 = new Human("Ivanov");
        human1.name = "Ivan";
        human1.getOlder();
        human1.gender = 0; //0 Man - 1 Woman

        Human human2 = new Human("Baiden");
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
        System.out.println("The youngest name is: " +
                youngest.name + " with age: " +
                youngest.age);

        human3.marriage(human2);


        Human human4 = new Human(15, "Gena");


        Circle[] circles = CircleUtils.getCircles(30);
        Circle maxAreaCircle = CircleUtils.getCircleWithMaxRadius(circles);
        System.out.println("Circle with biggest area: " +
                maxAreaCircle.getArea() +
                " with radius: " + maxAreaCircle.radius);
    }


}
