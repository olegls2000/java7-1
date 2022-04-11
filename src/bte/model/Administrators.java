package bte.model;

public class Administrators extends AbstractEmployee{
    private String office;

    public Administrators(int age, int name, int solar, String office) {
        this.age = age;
        this.name = name;
        this.solar = solar;
        this.office = office;
    }


    public String getOffice() {
        return office;
    }
}
