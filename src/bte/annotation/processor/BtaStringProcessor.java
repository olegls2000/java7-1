package bte.annotation.processor;

import bte.annotation.BtaString;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;

public class BtaStringProcessor {
    private static BtaStringProcessor instance=new BtaStringProcessor();

    public static BtaStringProcessor getInstance() {
        return instance;
    }
    public void process(@NotNull Object o) {
        final Class<?> clazz = o.getClass();
        getSuperclass( clazz, o);
    }

    public void getSuperclass(final Class<?> clazz,@NotNull final Object o) {
        if (clazz == null || clazz == Object.class) {
            return;
        }

        getSuperclass(clazz.getSuperclass(),o);
        final Field[] declaredFields = clazz.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(BtaString.class)) {
                final BtaString annotation = field.getAnnotation(BtaString.class);
                final String startWith = annotation.startWith();
                if (field.getType()!=String.class) {
                    continue;
                }
                field.setAccessible(true);

                try {

                    final Object rawValue = field.get(o);

                    String value = (String) rawValue;
                    if (!value.startsWith(startWith)) {
                        throw new RuntimeException("Field "
                                + field.getName()
                                + " \"" + value + "\" is invalid! Must start with the string: \""
                                + startWith + "\"");
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
