package study;

import static bte.util.Print.print;

public class Truck extends Transport{
    private boolean isLoaded;


    public Truck(int weight, byte[] coordinates){
        super(weight, coordinates);
    }
    public Truck(int weight, byte[] coordinates, boolean isLoaded){
        super(weight, coordinates);
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public void getLoaded() {
        if(isLoaded)
            print("Truck is loaded");

        else
            print("Truck is empty");

    }
}
