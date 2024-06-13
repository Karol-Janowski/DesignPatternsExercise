package pl.zajavka.behavioralDesignPatterns.visitor;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Bicycle implements ShoppingCartElement {

    private BigDecimal price;
    private BigDecimal discount;

    @Override
    public BigDecimal accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
