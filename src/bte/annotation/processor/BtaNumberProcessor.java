package bte.annotation.processor;

import bte.annotation.BtaNumber;

import java.lang.reflect.Field;

/*public class BtaNumberProcessor {

    private static BtaNumberProcessor instance = new BtaNumberProcessor();

    public static BtaNumberProcessor getInstance() {
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
                final String startWith = annotation.startWith();
                final Class<?> fieldType = field.getType();
                if (fieldType != String.class){
                    continue;
                }
                final int max = annotation.max();
                final int min = annotation.min();
                try {
                    field.setAccessible(true);
                    final Object rawValue = field.get(o);
                    String value = (String) (rawValue);
                    if (!value.startsWith(startWith)){
                        System.out.println("Started from: " + startWith);
                    }
                        throw new RuntimeException(
                                "Field with name: " + field.getName() + " has invalid value=" + value + ". Must be in range: "
                                        + min + " ... " + max);
                    } catch (IllegalAccessException e) {

                }
            } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }


            }
        }
    }
}*/