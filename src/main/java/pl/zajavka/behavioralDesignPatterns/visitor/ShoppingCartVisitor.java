package pl.zajavka.behavioralDesignPatterns.visitor;

import java.math.BigDecimal;

public interface ShoppingCartVisitor {

    BigDecimal visit(Apple apple);

    BigDecimal visit(Bicycle bicycle);
}
