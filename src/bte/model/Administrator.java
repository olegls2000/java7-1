package bte.model;

public class Administrator extends AbstractEmployee {
    private String department;

    public String getDepartment() {
        return department;
    }

    public Administrator(int age, String name, int salary, String department) {
        super(age, name, salary);
        this.department = department;
    }
}