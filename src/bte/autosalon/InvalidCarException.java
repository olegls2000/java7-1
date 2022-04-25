package bte.autosalon;

public class InvalidCarException extends RuntimeException {
    //private AbstractCar invalidCar;
    private String carPropertyName;
    private Object value;

    public InvalidCarException(String message, AbstractCar invalidCar) {
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
