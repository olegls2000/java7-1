package bte.annotation.processor;

import bte.annotation.BtaNumber;

import java.lang.reflect.Field;
import java.util.Scanner;

import static bte.util.Print.print;

public class BtaNumberProcessor {


    public void process(Object o) {
        final Class<?> clazz = o.getClass();
        final Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field :
                declaredFields) {
            if (field.isAnnotationPresent(BtaNumber.class)) {
                final BtaNumber annotation = field.getAnnotation(BtaNumber.class);
                final int max = annotation.max();
                final int min = annotation.min();
                try {
                    final Object rawValue = field.get(o);
                    int value = (int) (rawValue);
                    if (value < min || value > max) {
                        throw new RuntimeException(
                                "Field with name: " + field.getName() + " has invalid value=" +
                                        value + " is invalid. Must be in range: " +
                                        min + "..." + max);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }


            }
        }

    }

    public void process2(Object obj){
        final Class<?> clazz2 = obj.getClass();
        final Field[] declaratedFields2 = clazz2.getDeclaredFields();
        for (Field field:
             declaratedFields2) {
            if(field.isAnnotationPresent(BtaString.class)){
                final BtaString annotation = field.getAnnotation(BtaString.class);
                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();
                String startStr = scan.nextLine();
                try{
                    final Object rawValue = field.get(obj);
                    String value = (String) (rawValue);
                    if(str.startsWith(startStr)){
                        print(str);
                    }else {
                        print("Must be started from: " + startStr);
                    }

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
