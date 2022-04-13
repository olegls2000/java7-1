package bte.model;

public abstract class AbstractEmploy {
    private int age;
    private String name;
    private int salary;

    public AbstractEmploy(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public abstract void salaryReview();

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
