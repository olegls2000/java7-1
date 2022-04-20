package pattern.builder;

public class Auto {
    private Wheel[] wheels;
    private Body body;
    private Engine engeen;

    public Auto(Wheel[] wheels, Body body, Engine engine) {
        this.wheels = wheels;
        this.body = body;
        this.engeen = engine;
    }
}
