package pl.zajavka.behavioralDesignPatterns.visitor.java8;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

public class ShoppingCartVisitorMap implements Function<Class<? extends ShoppingCartElement>, ShoppingCartVisitor> {

    private static final Map<Class<? extends ShoppingCartElement>, ? extends ShoppingCartVisitor> VISITORS = Map.of(
            Apple.class, element -> visit((Apple) element),
            Bicycle.class, element -> visit((Bicycle) element)
    );

    private static BigDecimal visit(final Apple apple) {
        BigDecimal totalCost = apple.getWeight().multiply(apple.getPricePerKg());
        System.out.println("Calculated Apple cost: " + totalCost);
        return totalCost;
    }

    private static BigDecimal visit(final Bicycle bicycle) {
        BigDecimal totalCost = bicycle.getPrice().subtract(bicycle.getDiscount());
        System.out.println("Calculated Bicycle cost: " + totalCost);
        return totalCost;
    }

    @Override
    public ShoppingCartVisitor apply(Class<? extends ShoppingCartElement> clazz) {
        return VISITORS.get(clazz);
    }
}
