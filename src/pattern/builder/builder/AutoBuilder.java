package pattern.builder.builder;

import pattern.builder.Auto;
import pattern.builder.Body;
import pattern.builder.Engine;
import pattern.builder.Wheel;

public class AutoBuilder {
    private Wheel[] wheels;
    private Body body;
    private Engine engine;

    public AutoBuilder wheels(Wheel[] wheels) {
        this.wheels = wheels;
        return this;
    }

    public AutoBuilder body(Body body) {
        this.body = body;
        return this;
    }

    public AutoBuilder engine(Engine engine) {
        this.engine = engine;
        return this;
    }
    public Auto build() {
        return new Auto(wheels,body, engine);
    }
}
