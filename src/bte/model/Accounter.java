package bte.model;

public class Accounter extends AbstractEmployee {

    private String department;

    public String getDepartment() {
        return department;
    }

    public Accounter(int age, String name, int salary, String department) {
        super(age, name, salary);
        this.department = department;
    }
}
