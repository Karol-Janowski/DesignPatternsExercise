package pl.zajavka.behavioralDesignPatterns.visitor.java8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Apple implements ShoppingCartElement {

    private BigDecimal pricePerKg;
    private BigDecimal weight;

}
