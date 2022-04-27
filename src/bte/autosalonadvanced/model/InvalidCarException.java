package bte.autosalonadvanced.model;

public class InvalidCarException extends Exception {
    private final String message;
    private final String carProperty;
    private final Object value;

    public InvalidCarException(String message, String carProperty, Object value) {
        this.message = message;
        this.carProperty = carProperty;
        this.value = value;
    }

    @Override
    public String toString() {

        return "InvalidCarException: {\n" +
                "Car property ='" + carProperty + '\'' +
                "\nCause = '" + message + '\'' +
                "," + value +
                "                     }\n";
    }
}
