package bte.model;

public class Accounter extends AbstractEmployee {
    private String team;

    public String getTeam() {
        return team;
    }

    public Accounter(int age, String name, int salary, String team) {
        super(age, name, salary);
        this.team = team;
    }

    @Override
    public void salaryReview() {
        //TODO ...
    }
}
