package bte.model;

public class Admin extends AbstractEmployee {

    private String team;

    public String getTeam() {
        return team;
    }

    public Admin(int age, String name, int salary, String team) {
        super(age, name, salary);
        this.team = team;
    }

    @Override
    public void salaryReview() {
        // TODO: 13.04.2022
    }
}
