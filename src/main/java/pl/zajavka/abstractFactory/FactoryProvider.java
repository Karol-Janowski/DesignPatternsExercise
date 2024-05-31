package pl.zajavka.abstractFactory;

import pl.zajavka.factory.PizzaFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class FactoryProvider {

    private static final Map<String , Supplier<AbstractFactory<?>>> FACTORIES_MAP = new HashMap<>();

    static {
        FACTORIES_MAP.put("Pizza", PizzaFactory::new);
        FACTORIES_MAP.put("Car", CarFactory::new);
    }

    public static AbstractFactory<?> getFactory(String whatFactory) {
        return Optional.ofNullable(FACTORIES_MAP.get(whatFactory))
            .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException("im sorry we only produce pizzas or cars"));
    }


//    public static AbstractFactory<?> getFactory(String whatFactory) {
//        switch (whatFactory) {
//            case "Pizza":
//                return new PizzaFactory();
//            case "Car":
//                return new CarFactory();
//            default:
//                throw new RuntimeException("i'm sorry! we only sell pizzas or cars");
//
//        }
//    }
}
