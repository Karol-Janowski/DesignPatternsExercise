package pl.zajavka.behavioralDesignPatterns.visitor;

import java.math.BigDecimal;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public BigDecimal visit(Apple apple) {
        BigDecimal result = apple.getWeight().multiply(apple.getPricePerKg());
        System.out.printf("Calculated total apple price: " + result);
        return result;
    }

    @Override
    public BigDecimal visit(Bicycle bicycle) {
        BigDecimal result = bicycle.getPrice().subtract(bicycle.getDiscount());
        System.out.printf("Calculated total bicycle price: " + result);
        return result;
    }
}
