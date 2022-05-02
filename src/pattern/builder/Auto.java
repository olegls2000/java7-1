package pattern.builder;

public class Auto {
    private final Wheel[] wheels;
    private final Body body;
    private final Engine engine;

    public Auto(Wheel[] wheels, Body body, Engine engine) {
        this.wheels = wheels;
        this.body = body;
        this.engine = engine;
    }
}
