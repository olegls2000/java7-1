package bte.annotation.processor;

import bte.annotation.BtaNumber;

import java.lang.reflect.Field;

import static bte.util.Print.print;

public class BtaNumberProcessor {


    public void process(Object o) {
        final Class<?> clazz = o.getClass();
        final Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field :
                declaredFields) {
            if (field.isAnnotationPresent(BtaNumber.class)) {//Присутствует ли над филдом.
                final BtaNumber annotation = field.getAnnotation(BtaNumber.class);// Получаем ссылку на аннотацию
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
        final Field[] declaratedFields2 = clazz2.getDeclaredFields();// Получение полей...Задекларированные в классе поля.
        for (Field field:
             declaratedFields2) {
            if(field.isAnnotationPresent(BtaString.class)){//Присутствует ли над филдом.
                final BtaString annotation = field.getAnnotation(BtaString.class);// Получаем ссылку на аннотацию
                final String startWith = annotation.startWith();
                final Class<?> fieldType = field.getType();//спросить тип
                if(fieldType != String.class){//Если = Стринг - то работа продолжится...Если не стринг, то пропустит
                    continue;
                }
                try{
                    final Object rawValue = field.get(obj);//Нельзя взять у филда вэль....по этому передаём Обджект
                    String value = (String) (rawValue);// Получили вэлью
                    if(!value.startsWith(startWith)){
                        print("Must be started from: " + startWith);
                    }

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
