package bte.anatation.processor;

import bte.anatation.BtaNumber;

import java.lang.reflect.Field;

public class BtaNumberProcessor {
    private static final BtaNumberProcessor instance = new BtaNumberProcessor();

    public static BtaNumberProcessor getInstance(){
        return instance;
    }
    public BtaNumberProcessor() {
    }

    public void process(Object o) {
        final Class<?> clazz = o.getClass();
        final Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(BtaNumber.class)) {
                final BtaNumber annotation = field.getAnnotation(BtaNumber.class);
                final int max = annotation.max();
                final int min = annotation.min();
                try {
                    field.setAccessible(true);
                    Object rawValue = field.get(o);
                    final int value = (int) rawValue;
                    if (value < min || value > max) {
                        throw new RuntimeException("Field with name: " + field.getName() + " has invalid value = " +
                                value + " is invalid. Must be in range " + min + " ... " + max);
                    }
                } catch (IllegalAccessException e) {
                    System.out.println();
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
