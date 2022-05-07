package bte.model;

import bte.anatation.BtaString;

public class Accounter extends AbstractEmploy {

    private final String team;
    @BtaString(startWith = "A")
    private final String name;

    public Accounter(int age, String name, int salary, String team) {
        super(age, name, salary);
        this.name = name;
        this.team = team;
    }


    public String getTeam() {
        return team;
    }

    @Override
    public void salaryReview() {

    }
}
