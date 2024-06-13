package pl.zajavka.behavioralDesignPatterns.visitor;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Apple implements ShoppingCartElement{

    private BigDecimal pricePerKg;
    private BigDecimal weight;

    @Override
    public BigDecimal accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
