package pl.zajavka.structuralDesignPatterns.adapter;

import java.math.BigDecimal;

public class SonyTV implements Dimension{

    @Override
    public BigDecimal getDimension() {
        return BigDecimal.valueOf(49);
    }
}
