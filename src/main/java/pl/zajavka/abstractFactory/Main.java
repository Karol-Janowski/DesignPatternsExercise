package pl.zajavka.abstractFactory;

public class Main {
    public static void main(String[] args) {
        // Abstract Factory
        AbstractFactory<?> pizzaFactory = FactoryProvider.getFactory("Car");
        Object created = pizzaFactory.create("SUV");
        System.out.println(created);
    }
}
