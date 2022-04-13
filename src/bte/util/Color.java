package bte.util;

public enum Color {
    WHITE("White"),
    BLACK("Black"),
    RED("Red");

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Color(String name) {
        this.name = name;
    }
}
