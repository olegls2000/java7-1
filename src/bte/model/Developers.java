package bte.model;

public class Developers extends AbstractEmployee{

    private String programmingLanguage;


    public Developers(int age, int name, int solar, String programmingLanguage) {
        this.age = age;
        this.name = name;
        this.solar = solar;
        this.programmingLanguage = programmingLanguage;
    }



    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}




