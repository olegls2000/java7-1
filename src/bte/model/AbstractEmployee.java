package bte.model;

import bte.annotation.BtaString;

//Super Class
//Parent Class
public abstract class AbstractEmployee {
    private int age;

    @BtaString(startWith = "A")
    private String name;

    private int salary;

    public AbstractEmployee(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public abstract void salaryReview();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
