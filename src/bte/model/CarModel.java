package bte.model;

public enum CarModel {
    BMW("BMW"),
    AUDI("AUDI"),
    MERCEDES("Mercedes");

    private String name;

    public String getName() {
        return name;
    }

    CarModel(String name){
        this.name = name;
    }


}
