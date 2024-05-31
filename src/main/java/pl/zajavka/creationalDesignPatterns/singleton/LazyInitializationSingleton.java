package pl.zajavka.creationalDesignPatterns.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {
        System.out.println("creating LazyInitializationSingleton");
    }

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    static void someStaticMethod() {
        System.out.println("calling some static method");
    }
}
