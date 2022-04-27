package study;

import static bte.util.Print.print;

public class Transport {
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinates;




    public Transport(float _speed, int _weight, String _color, byte[] _coordinates) {
        print("Object created");
        setValues(_speed, _weight, _color,_coordinates);
        print(getValues());
    }

    public Transport(int weight, byte[] coordinates){
        this.weight = weight;
        this.coordinates = coordinates;
        print(getValues());
    }

    public void setValues(float speed, int weight, String color, byte[] coordinates) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }

    public String getValues() {
        String info = "Object speed: " + speed + " Weight: " + weight + " Color: " + color + ".\n";
        String infoCoordinates = "Coordinates:\n";

        for (int i = 0; i < coordinates.length; i++) {
            infoCoordinates += coordinates[i] + "\n";
        }
        return info + infoCoordinates;
    }
}
