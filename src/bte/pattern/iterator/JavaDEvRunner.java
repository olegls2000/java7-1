package bte.pattern.iterator;

public class JavaDEvRunner {
    public static void main(String[] args) {
        String [] skills = {"Java", "Postgresql", "Maven", "Spring"};

        JavaDev javaDev = new JavaDev("Boris",skills);
        Iterator iterator = javaDev.getIterator();
        System.out.println("Developer " + javaDev.getName()  + " has skills: " );
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }

    }
}
