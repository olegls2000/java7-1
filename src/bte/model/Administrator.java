package bte.model;

import bte.annotation.BtaString;

public class Administrator extends AbstractEmployee {
    @BtaString(startWith = "D")
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public Administrator(String name, int age, int salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public void salaryReview() {

    }
}

