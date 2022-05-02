package bte.autosalonadvanced.service;

public class InvalidAutoSalonStateException extends Exception {
    private final String message;
    private Object value;

    public InvalidAutoSalonStateException(String message, Object value) {
        this.message = message;
        this.value = value;
    }

    public InvalidAutoSalonStateException(String message) {
        this.message = message;

    }

    @Override
    public String toString() {
        return "InvalidAutoSalonStateException: {\n" +
                "Cause = '" + message + '\'' +
                (value!=null?",":"") + (value == null ? "\n" : value) +
                "                                }\n";
    }
}
