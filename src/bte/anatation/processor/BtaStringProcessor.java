package bte.anatation.processor;

import bte.anatation.BtaString;

import java.lang.reflect.Field;

public class BtaStringProcessor {
    private static final BtaStringProcessor instance = new BtaStringProcessor();

    public static BtaStringProcessor getInstance() {
        return instance;
    }

    public BtaStringProcessor() {
    }

    public void process(Object o) {
        final Class<?> clazz = o.getClass();
        final Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(BtaString.class)) {
                final BtaString annotation = field.getAnnotation(BtaString.class);
                final String startWith = annotation.startWith();
                try {
                    field.setAccessible(true);
                    Object rawValue = field.get(o);
                    final String value = (String) rawValue;
                    if (!(value.startsWith(startWith))) {
                        throw new RuntimeException("Field " + value + " must start with: " + startWith);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
