package bte.model;

public class Developer extends AbstractEmployee {

    private String programmingL;

    public String getProgrammingL() {
        return programmingL;
    }

    public Developer(int age, String name, int salary, String programmingL) {
        super(age, name, salary);
        this.programmingL = programmingL;
    }


    @Override
    public void salaryReview() {
        // TODO: 13.04.2022
    }
}
