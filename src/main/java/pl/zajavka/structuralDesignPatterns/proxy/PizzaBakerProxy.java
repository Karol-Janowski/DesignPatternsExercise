package pl.zajavka.structuralDesignPatterns.proxy;

import lombok.RequiredArgsConstructor;
import net.sourceforge.plantuml.Run;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class PizzaBakerProxy implements PizzaBaker{

    private static final List<String> DENIED_PIZZAS = List.of("Hawaiian");

    private final PizzaBaker pizzaBaker;
    @Override
    public void bake(String pizza) {
        if (DENIED_PIZZAS.contains(pizza)) {
            throw new RuntimeException(String.format("%s? We dont sell that here", pizza));
        } else {
            pizzaBaker.bake(pizza);
        }
    }
}
