package bte.model;

//Sub Class
//Child Class
public class Developer extends AbstractEmployee {
    private String programmingLanguage;

    public Developer(int age,
                     String name,
                     int salary,
                     String programmingLanguage) {
        super(age, name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}