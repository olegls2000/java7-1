package pattern.singleton;

public final class Singleton {
    // private static Singleton instance= new Singleton();
    private static Singleton instance;

    private Singleton() {
    }

    public  synchronized static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
