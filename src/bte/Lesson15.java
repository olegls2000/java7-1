package bte;

import bte.annotation.processor.BtaNumberProcessor;
import bte.model.Car;
import bte.model.Point;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleTriangle;
import bte.util.Color;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static bte.util.Print.print;

public class Lesson15 {
    public static void main(String[] args) throws Exception {

        int y = 0;
        boolean b = 4 > 9;
        //........
        if (b) {
            y = 1;
        } else {
            y = 2;
        }
        //Тернарный оператор
        y = 5 > 8 ? 1 + 6 : 2 - 1;
        //....................

        //......REFLECTION......//

        Object point = new Point(1, 1);
        Class pointClass = point.getClass();
        String className = pointClass.getName();
        String classPackageName = pointClass.getPackageName();
        String classSimpleName = pointClass.getSimpleName();

        final Constructor[] constructors = pointClass.getConstructors();
        final Method[] methods = pointClass.getMethods();
        final Field[] fields = pointClass.getFields();

        print(pointClass);

        List generatePoints = createObjects(Point.class, 100);
        List generateCircles = createObjects(SimpleCircle.class, 100);
        //print(generatePoints);
        //print(generateCircles);

        final SimpleTriangle simpleTriangle = new SimpleTriangle(1, 1, 1);
        final SimpleTriangle simpleTriangle2 = new SimpleTriangle(2, 2, 2);
        callSecretMethod(simpleTriangle);
        callSecretMethod(simpleTriangle2);


        BtaNumberProcessor btaNumberProcessor = new BtaNumberProcessor();
        Car carToProcess = new Car(30_000,2_000, Color.BLACK );
        btaNumberProcessor.process(carToProcess);
    }

    private static void callSecretMethod(Object object) throws Exception {
        final Class<?> clazz = object.getClass();
        final Method[] methods = clazz.getDeclaredMethods();
        Method secretMethod = null;
        //lookup
        for (Method method :
                methods) {
            final String methodName = method.getName().toLowerCase();
            if (methodName.contains("secret")) {
                secretMethod = method;
                break;
            }
        }
        secretMethod.setAccessible(true);
        secretMethod.invoke(object);
    }

    public static List createObjects(Class clazz, int count) throws Exception {
        Constructor defaultConstructor = null;
        final Constructor[] constructors = clazz.getConstructors();


        for (Constructor constructor : constructors) {
            int parameterCount = constructor.getParameterCount();
            if (parameterCount == 0) {
                defaultConstructor = constructor;
                break;

            }
        }
        final List result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            final Object instance = defaultConstructor.newInstance();
            result.add(instance);
        }
        return result;
    }
}
