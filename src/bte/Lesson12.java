package bte;

import bte.homeWorkLesson11.InvalidCarException;
import bte.homeWorkLesson11.Truck;
import bte.homeWorkLesson11.VehicleBrand;

public class Lesson12 {
    public static void main(String[] args) {

        Truck car1 = new Truck();
        try {
            throw new Exception("Random");
        } catch (InvalidCarException exception) {
            exception.printStackTrace();
            System.out.println("Car is invalid +" + exception.getCarPropertyName() + "=" + exception.getValue());
        } catch (Exception exception){
            System.out.println("Some random exc happened");
        }
        catch (Throwable tr){
            System.out.println("Some Parent exc");
        }
        if(car1 !=null){
            try{
                car1.printCarInfo();
            } catch (InvalidCarException e){
                e.printStackTrace();
            }catch (IllegalAccessException e){
                e.printStackTrace();
            }catch (Throwable e){
                e.printStackTrace();
            }
        }
        System.out.println(car1.excWithFinal());
    }
}
