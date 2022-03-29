public class Lesson5 {
    public static void main(String[] args){
        int i = 7;
        Human ivan = new Human("Ivanov");
        ivan.getOlder();
        ivan.name = "Ivan";
        //ivan.getOlder();
        //ivan.getOlder();
        //ivan.getOlder();

        Human joe = new Human("Biden");
        joe.name = "Joe";
        joe.getOlder();

        Human ivan1 = new Human("Icanov1");
        ivan1.getOlder();
        ivan.name = "Ivan1";

        Human joe1 = new Human("Filatova");
        joe1.name = "Katerina";
        joe1.getOlder();

        joe.marriage(joe1);

        Human[] company = {ivan, joe, ivan1, joe1};

        Human youngest = company[0];
        for (Human human : company){
            if (human.age < youngest.age){
              youngest = human;
            }
        }
        System.out.println("The youngest is: " + youngest.name +
                " with age: " + youngest.age);
    }
    public static int getRandom(int a, int b){
        return (int) (Math.random() * (b - a)) + a;
    }
    Human human4 = new Human(38, "Fill");
}
