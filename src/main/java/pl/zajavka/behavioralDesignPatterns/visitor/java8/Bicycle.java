package pl.zajavka.behavioralDesignPatterns.visitor.java8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Bicycle implements ShoppingCartElement {

    private BigDecimal price;
    private BigDecimal discount;

}
