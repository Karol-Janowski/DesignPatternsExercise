package pl.zajavka.Factory;

public class PizzaFactory {

    public static Pizza preparePizza(final String whatPizza) {
        switch (whatPizza) {
            case "Pepperoni":
                return new PepperoniPizza();
            case "Hawaiian":
                return new HawaiianPizza();
            default:
                throw new RuntimeException("Sorry, we only sell Pepperoni or Hawaiian");

        }
    }
}
