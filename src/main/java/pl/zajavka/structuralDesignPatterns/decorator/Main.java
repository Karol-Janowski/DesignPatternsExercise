package pl.zajavka.structuralDesignPatterns.decorator;

import org.jsoup.nodes.Attribute;

public class Main {
    public static void main(String[] args) {
        // Decorator
        // dodanie nowych funkcjonalnosci do gotowych klas (biblioteki, .jar etc)
        // mozna korzystac z oryginalego obiektu oraz tego udekorowanego

//        CarImpl carNotDecorated = new CarImpl();
//        System.out.println(carNotDecorated.create());
//
//        Car car1 = new SpoilerDecorator(new CarImpl());
//        System.out.println(car1.create());
//
//        Car car2 = new NeonDecorator(new CarImpl());
//        System.out.println(car2.create());
//
//        Car car3 = new SpoilerDecorator(
//                new RimsDecorator(
//                        new RimsDecorator(
//                                new NeonDecorator(
//                                        new CarImpl()
//                                )
//                        )
//                )
//        );
//        System.out.println(car3.create());

//        System.out.println("Example1");
//        Attribute attribute1 = new AttributeBeforeDecorator(new Attribute("key1", "value"));
//        System.out.println(attribute1.getKey());
//        System.out.println();
//
//        System.out.println("Example2");
//        Attribute attribute2 = new AttributeAfterDecorator(new AttributeBeforeDecorator(new Attribute("key2", "value2")));
//        System.out.println(attribute2.getKey());

        // After Java 8 lambda examples
        Car originalCar = new CarImpl();

        Car car1 = () -> "Before Car! " + originalCar.create() + " with Spoiler";
        Car car2 = () -> "Before Car! " + originalCar.create() + " with Rims with Spoiler";
        Car car3 = () -> "Before Car! " + originalCar.create() + " with Rims with Spoiler with Neon";

        System.out.println(car1.create());
        System.out.println(car2.create());
        System.out.println(car3.create());
    }
}
