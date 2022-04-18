package bte.model;

public abstract class AbstractEmployee {

    protected String name;
    protected int age;
    protected int salary;

    public int getAge() {
        return age;
    }

    public abstract void salaryReview();

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }


}
