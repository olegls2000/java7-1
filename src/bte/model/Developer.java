package bte.model;

import bte.anatation.BtaString;

public class Developer extends AbstractEmploy {

    private final String programmingLanguage;
    @BtaString(startWith = "A")
    private final String name;

    public Developer(int age, String name, int salary, String programmingLanguage) {
        super(age, name, salary);
        this.name = name;
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void salaryReview() {

    }
}
