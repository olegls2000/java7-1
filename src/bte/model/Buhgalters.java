package bte.model;

public class Buhgalters extends AbstractEmployee {
    private String office;

    public Buhgalters(int age, int name, int solar, String office) {
        this.age = age;
        this.name = name;
        this.solar = solar;
        this.office = office;



    }
    public String getOffice() {
        return office;
    }


}

