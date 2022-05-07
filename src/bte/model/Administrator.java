package bte.model;

import bte.anatation.BtaString;

public class Administrator extends AbstractEmploy {

    private final String department;
    @BtaString(startWith = "A")
    private final String name;

    public Administrator(int age, String name, int salary, String department) {
        super(age, name, salary);
        this.department = department;
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void salaryReview() {

    }
}
