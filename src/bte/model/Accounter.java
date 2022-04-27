package bte.model;

public class Accounter extends AbstractEmploy {

    private final String team;

    public Accounter(int age, String name, int salary, String team) {
        super(age, name, salary);
        this.team = team;
    }



    public String getTeam() {
        return team;
    }

    @Override
    public void salaryReview() {

    }
}
