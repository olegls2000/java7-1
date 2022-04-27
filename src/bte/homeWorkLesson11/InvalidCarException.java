package bte.homeWorkLesson11;

public class InvalidCarException extends RuntimeException {
    private String carPropertyName;
    private Object value;

    public InvalidCarException(String message, String carPropertyName, Object value) {
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
