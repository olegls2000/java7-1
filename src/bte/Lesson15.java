package bte;

import bte.annotation.processor.BtaNumberProcessor;
import bte.model.Car;
import bte.model.Color;
import bte.model.Point;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleTriangle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/*Reflection*/
public class Lesson15 {
    public static void main(String[] args) throws Exception {
        boolean b = 4 > 9;
        int y = 0;
        if (b) {
            y = 1;
        } else {
            y = 2;
        }
        System.out.println("y = " + y);
        String ss = 5 > 8 ? "1 + 6" : "2 - 1";
        y = 5 > 8 ? 1 + 6 : 2 - 1 + 5 == 5 ? 1 : 2;
        System.out.println("y = " + y);

        Point point = new Point(1, 1);
        Class pointClass = point.getClass();
        String className = pointClass.getName();
        String classPackageName = pointClass.getPackageName();
        String classSimpleName = pointClass.getSimpleName();

        final Constructor[] constructors = pointClass.getConstructors();
        final Method[] methods = pointClass.getMethods();
        final Field[] fields = pointClass.getFields();

        System.out.println(pointClass);

        List generatedOPoints = createObjects(Point.class, 100);
        System.out.println(generatedOPoints);
        List generatedOCircles = createObjects(SimpleCircle.class, 100);
        System.out.println(generatedOCircles);

        final SimpleTriangle simpleTriangle = new SimpleTriangle(1, 1, 1);
        final SimpleTriangle simpleTriangle2 = new SimpleTriangle(2, 2, 2);
        callSecretMethod(simpleTriangle);
        callSecretMethod(simpleTriangle2);


        Car carToProcess = new Car(30_000, 2_500, Color.BLACK);
        //Car carOld = new Car();
        BtaNumberProcessor.getInstance().process(carToProcess);
        BtaNumberProcessor.getInstance().process(new Point(-1, 1));


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
        Constructor defaultConstructor = null;
        final Constructor[] constructors = clazz.getConstructors();

        for (Constructor constructor : constructors) {
            int parameterCount = constructor.getParameterCount();
            if (parameterCount == 0) {
                defaultConstructor = constructor;
                break;
            }
        }
        final List result = new ArrayList();
        for (int i = 0; i < count; i++) {
            final Object instance = defaultConstructor.newInstance();
            result.add(instance);
        }
        return result;
    }
}
