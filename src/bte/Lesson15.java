package bte;

import bte.annotation.processor.BtaNumberProcessor;
import bte.annotation.processor.BtaStringProcessor;
import bte.model.*;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleTriangle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Lesson15 {
    public static void main(String[] args) throws Exception {

        Point point = new Point(1, 1);
        final Class<?> pointClass = point.getClass();
        System.out.println(pointClass);
        final String className = pointClass.getName();
        final String simpleName = pointClass.getSimpleName();
        final String packageName = pointClass.getPackageName();

        final Constructor<?>[] constructors = pointClass.getConstructors();
        final Method[] methods = pointClass.getMethods();
        final Field[] fields = pointClass.getFields();

        List generatedObjects = createObjects(Point.class, 100);
        System.out.println(generatedObjects);

        List generatedObjects2 = createObjects(SimpleCircle.class, 100);
        System.out.println(generatedObjects2);
        SimpleTriangle simpleTriangle = new SimpleTriangle(1, 1, 1);
        callSecretMethod(simpleTriangle);
    }

    private static List createObjects(Class class1, int count) throws Exception {
        Constructor defaultConstructor = null;
        Constructor[] constructors = class1.getConstructors();

        for (Constructor constructor : constructors) {
            int parameterCount = constructor.getParameterCount();
            if (parameterCount == 0) {
                defaultConstructor = constructor;
                break;
            }
        }
        List result = new ArrayList();
        for (int i = 0; i < count; i++) {
            result.add(defaultConstructor.newInstance());
        }
        return result;
    }

    private static void callSecretMethod(Object object) throws Exception {
        final Class<?> clazz = object.getClass();
        final Method[] methods = clazz.getDeclaredMethods();
        Method secretMethod = null;
        for (Method method : methods) {
            final String name = method.getName().toLowerCase();
            if (name.contains("secret")) {
                secretMethod = method;
                break;
            }

        }
        secretMethod.setAccessible(true);
        secretMethod.invoke(object);
        //   BtaNumberProcessor btaNumberProcessor= new BtaNumberProcessor();
        Car carToProcess = new Car("Toyota", 30_000, 2000, Color.RED);
        //    btaNumberProcessor.process(carToProcess);
        BtaNumberProcessor.getInstance().process(carToProcess);

        AbstractEmployee admin = new Administrator("Alex", 40, 3000, "department B");
        BtaStringProcessor.getInstance().process(admin);
    }
}
