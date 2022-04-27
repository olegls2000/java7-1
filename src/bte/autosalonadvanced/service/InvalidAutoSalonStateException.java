package bte.autosalonadvanced.service;

import bte.autosalonadvanced.model.Truck;

public class InvalidAutoSalonStateException extends Exception {
    private String message;
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
        String result;
        if (value instanceof Truck) {
            result = "Truck: " + value.toString();
        }

        return "InvalidAutoSalonStateException: {\n" +
                "Cause = '" + message + '\'' +
                (value!=null?",":"") + (value == null ? "\n" : value) +
                "                                }\n";
    }
}
