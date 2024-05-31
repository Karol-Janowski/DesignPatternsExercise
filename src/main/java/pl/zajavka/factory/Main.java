package pl.zajavka.factory;

public class Main {

    public static void main(String[] args) {
    // Factory
        Pizza pepperoni = PizzaFactory.preparePizza("Pepperoni");
        System.out.println(pepperoni);
        Pizza hawaiian = PizzaFactory.preparePizza("Hawaiian");
        System.out.println(hawaiian);
        PizzaFactory.preparePizza("Margerita");
    }
}
