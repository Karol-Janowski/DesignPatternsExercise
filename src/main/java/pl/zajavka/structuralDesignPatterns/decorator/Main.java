package pl.zajavka.structuralDesignPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        // Decorator
        // dodanie nowych funkcjonalnosci do gotowych klas (biblioteki, .jar etc)
        // mozna korzystac z oryginalego obiektu oraz tego udekorowanego

        CarImpl carNotDecorated = new CarImpl();
        System.out.println(carNotDecorated.create());

        Car car1 = new SpoilerDecorator(new CarImpl());
        System.out.println(car1.create());

        Car car2 = new NeonDecorator(new CarImpl());
        System.out.println(car2.create());

        Car car3 = new SpoilerDecorator(
                new RimsDecorator(
                        new RimsDecorator(
                                new NeonDecorator(
                                        new CarImpl()
                                )
                        )
                )
        );
        System.out.println(car3.create());
    }
}
