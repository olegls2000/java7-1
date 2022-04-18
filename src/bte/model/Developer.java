package bte.model;

public class Developer extends AbstractEmployee {

    private String programmingLanguage;


    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(int age, String name, int salary, String programmingLanguage) {
   //     super(name,age,salary);
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void salaryReview() {

    }
}
