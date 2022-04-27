package bte.lesson11HomeWork;

//“Honda”, “Mercedes”, “BMW”, “Toyota”.
public enum CarModels {
    BMW("BMW"),
    MERCADES("MERCEDES"),
    HONDA("HONDA"),
    TOYOTA("TOYOTA");

    private String name;

    public String getName() {
        return name;
    }

    CarModels(String name) {
        this.name = name;
    }


}