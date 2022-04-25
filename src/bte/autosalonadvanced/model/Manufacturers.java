package bte.autosalonadvanced.model;

public enum Manufacturers {
    HONDA("Honda") {
        @Override
        String sayName() {
            return "It's me " + model;
        }
    },
    MERCEDES("Mercedes") {
        @Override
        String sayName() {
            return "My name is " + model;
        }
    },
    BMW("BMW") {
        @Override
        String sayName() {
            return "My NAME is " + model;
        }
    },
    TOYOTA("Toyota") {
        @Override
        String sayName() {
            return "I am is " + model;
        }
    };

    String model;

    Manufacturers(String model) {
        this.model = model;
    }
    Manufacturers() {}

    boolean hasName() {
        return model != null;
    }
    abstract String sayName();

    @Override
    public String toString() {
        return "Model = '" + model + '\'';
    }
}
