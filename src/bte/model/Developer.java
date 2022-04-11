package bte.model;

//Sub Class
//Child Class
public class Developer extends AbstractEmployee {
    private String programmingLanguage;

    public Developer(int age,
                     String name,
                     int salary,
                     String programmingLanguage) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
