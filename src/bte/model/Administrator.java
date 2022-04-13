package bte.model;

public class Administrator extends AbstractEmploy {

    private String department;

    public Administrator(int age, String name, int salary, String department) {
        super(age, name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
