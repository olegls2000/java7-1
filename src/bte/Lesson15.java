package bte;

//Reflection

import bte.anatation.processor.BtaNumberProcessor;
import bte.model.Car;
import bte.model.Point;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleTriangle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static bte.model.Color.BLACK;

public class Lesson15 {
    public static void main(String[] args) throws Exception {
        Object point = new Point(1, 1);
        Class pointClass = point.getClass();
        String className = pointClass.getName();
        String classPackageName = pointClass.getPackageName();
        String classSimpleName = pointClass.getSimpleName();

        Constructor[] constructors = pointClass.getConstructors();
        Method[] methods = pointClass.getMethods();
        Field[] fields = pointClass.getFields();

        System.out.println(classSimpleName);

        List generatedPoints = createObjects(Point.class, 100);
        System.out.println(generatedPoints);
        List generatedCircles = createObjects(SimpleCircle.class, 100);
        System.out.println(generatedCircles);
        final SimpleTriangle simpleTriangle = new SimpleTriangle(1, 1, 1);
        final SimpleTriangle simpleTriangle2 = new SimpleTriangle(2, 2, 2);
        callSecretMethod(simpleTriangle);
        callSecretMethod(simpleTriangle2);

        Car carToProcess = new Car(30_000, 2_500, BLACK);
        BtaNumberProcessor.getInstance().process(carToProcess);
    }

    private static void callSecretMethod(Object object) throws Exception {
        final Class<?> clazz = object.getClass();
        final Method[] methods = clazz.getDeclaredMethods();
        Method secretMethod = null;
        for (Method method : methods) {
            final String methodName = method.getName().toLowerCase();
            if (methodName.contains("secret")) {
                secretMethod = method;
                break;
            }
        }
        secretMethod.setAccessible(true);
        secretMethod.invoke(object);
    }

    private static List createObjects(Class clazz, int count) throws Exception {
        final Constructor[] constructors = clazz.getConstructors();
        Constructor defaultConstructor = null;

        for (Constructor constructor : constructors) {
            int parameterCount = constructor.getParameterCount();
            if (parameterCount == 0) {
                defaultConstructor = constructor;
                break;
            }
        }
        List result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Object instance = defaultConstructor.newInstance();
            result.add(instance);
        }
        return result;
    }
}
