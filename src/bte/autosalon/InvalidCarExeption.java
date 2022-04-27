package bte.autosalon;

public class InvalidCarExeption extends Exception {
    private String carPropertyName;
    private Object value;

    public InvalidCarExeption(String message, String carPropertyName, Object value) {
        super(message);
        this.carPropertyName = carPropertyName;
        this.value = value;
    }

    public String getCarPropertyName() {
        return carPropertyName;
    }

    public Object getValue() {
        return value;
    }
}
