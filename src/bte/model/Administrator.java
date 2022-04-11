package bte.model;

public class Administrator extends AbstractEmployee {
    private String department;

    public String getDepartment() {
        return department;
    }

    public Administrator(int age, String name, int salary, String department) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}
