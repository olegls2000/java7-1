package bte.homeWorkLesson11;

public class AutoSalonApiImpl implements AutoSalonApi {
    int balance;
    private AbstractVehicle[] parking = new AbstractVehicle[8];
   // AutoSalonApiImpl autoSalon = new AutoSalonApiImpl();


    @Override
    public int buyCar(AbstractVehicle auto) {
        final int carPrice = evaluatePrice(auto);
        final int parkingPlace = getFreeParkingPlace();
        if (balance < carPrice) {
            System.out.println("Not enough money");
            return -1;
        }
        if (parkingPlace >= 0) {
            System.out.println("Not enough space");
            return -1;
        }

        parking[parkingPlace] = auto;
        balance -= evaluatePrice(auto);
        return parkingPlace;
    }



    @Override
    public int sellCar(int i) {
        checkParkingPlace(i);
        final var car = parking[i];
        int autoPrice = (int) estimatedValueOfTheCar(car);
        parking[i] = null;
        var salePrice = autoPrice * 1.2;
        balance += salePrice;
        return (int) salePrice;
    }

       private void checkParkingPlace(int i) {

         //  if (parkingPlace < 0) {
                System.out.println("Not enough space");
             //   return -1;
            //    parking[parkingPlace] = auto;
           //     balance -= evaluatePrice(auto);
           //     return parkingPlace;
            }



    private int getFreeParkingPlace() {
        int freePlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                freePlace = i;
                //  break;
            }
        }
        return freePlace;
        }

       // private void checkParkingPlace ( int i){
            //TODO /// i>=0, i<parking.lenght
     //   }

        @Override
        public void report() {
            System.out.println(balance);
            System.out.println("Cars in stock " + parking.length);
        }

    private int evaluatePrice(AbstractVehicle auto) {
        // double estValTruck = (.cargo * CARGO) - (auto.releaseDate * AGE) + (auto.techStatus * TECHSTATUS);
        return 0;
    }

    private double estimatedValueOfTheCar(AbstractVehicle auto) {
        //double estValTruck = (auto.capacity * CAPACITY) - (auto.releaseDate * AGE) + (auto.techStatus * TECHSTATUS);
        return 0;
    }
    }

