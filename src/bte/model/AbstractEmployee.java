package bte.model;

public abstract class AbstractEmployee {
    private int age = 0;
    private String name;
    private int salary = 0;

    public AbstractEmployee(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

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
