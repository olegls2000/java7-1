package bte.model;

public class Accounter extends AbstractEmployee {
    private String team;

    public String getTeam() {
        return team;
    }

    public Accounter(int age, String name, int salary, String team) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.team = team;
    }
}
