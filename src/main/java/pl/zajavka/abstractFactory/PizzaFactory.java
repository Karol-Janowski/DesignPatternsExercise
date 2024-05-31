package pl.zajavka.abstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class PizzaFactory implements AbstractFactory<Pizza> {

    private static final Map<String, Supplier<Pizza>> PIZZA_MAP = new HashMap<>();

    static {
        PIZZA_MAP.put("Pepperoni", PepperoniPizza::new);
        PIZZA_MAP.put("Hawaiian", PepperoniPizza::new);
    }

    public Pizza create(final String whatPizza) {
        return Optional.ofNullable(PIZZA_MAP.get(whatPizza))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(String.format("Sorry, we dont sell: [%s]", whatPizza)));
    }



//    public static Pizza preparePizza(final String whatPizza) {
//        switch (whatPizza) {
//            case "Pepperoni":
//                return new PepperoniPizza();
//            case "Hawaiian":
//                return new HawaiianPizza();
//            default:
//                throw new RuntimeException("Sorry, we only sell Pepperoni or Hawaiian");
//
//        }
//    }
}
