package bte.pattern.sinlgeton;

public final class Singleton {
    private static Singleton instance;

    private Singleton(){
      //  throw new RuntimeException("Impossible to use Constructor");
    }

    public synchronized static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
