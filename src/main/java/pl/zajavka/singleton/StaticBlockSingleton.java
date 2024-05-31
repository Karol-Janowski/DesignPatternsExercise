package pl.zajavka.singleton;

public class StaticBlockSingleton {

    // eager implementation

    private static final StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception thrown while creating instance");
        }
    }

    private StaticBlockSingleton() {
        System.out.println("Constructor");
    }

    public static StaticBlockSingleton getInstance() {
        System.out.println("get instance");
        return instance;
    }
}
