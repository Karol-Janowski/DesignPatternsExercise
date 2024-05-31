package pl.zajavka.abstractFactory;

import pl.zajavka.factory.PepperoniPizza;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class CarFactory implements AbstractFactory<Car>{


    private static final Map<String, Supplier<Car>> PIZZA_MAP = new HashMap<>();

    static {
        PIZZA_MAP.put("SUV", SUV::new);
        PIZZA_MAP.put("Cabriolet", Cabriolet::new);
    }

    public Car create(final String whatCar) {
        return (Car) Optional.ofNullable(PIZZA_MAP.get(whatCar))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(String.format("Sorry, we dont sell: [%s]", whatCar)));
    }
}
