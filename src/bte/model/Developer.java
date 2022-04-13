package bte.model;


public class Developer extends AbstractEmploy {

    private String programmingLanguage;

    public Developer(int age, String name, int salary, String programmingLanguage) {
        super(age, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
