package bte.annotation.processor;

import bte.annotation.BtaNumber;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;

public class BtaNumberProcessor {

    private static BtaNumberProcessor instance=new BtaNumberProcessor();

    public static BtaNumberProcessor getInstance() {
        return instance;
    }

    private BtaNumberProcessor() {
    }

    public void process(@NotNull Object o) {
        final Class<?> clazz = o.getClass();
        final Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(BtaNumber.class)) {
                final BtaNumber annotation = field.getAnnotation(BtaNumber.class);
                final int max = annotation.max();
                final int min = annotation.min();
                field.setAccessible(true);
                try {

                    final Object rawValue = field.get(o);

                    Integer value = (int) rawValue;
                    if (value < min || value > max) {
                        throw new RuntimeException("Field " + field.getName() + " with the value = " + value + " is invalid! Must be in range : [ "
                                + min + ", " + max + " ]");
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
