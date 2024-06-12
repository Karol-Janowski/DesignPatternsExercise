package pl.zajavka.structuralDesignPatterns.bridge;

import lombok.ToString;

@ToString
public class Green implements Color{
    @Override
    public String apply() {
        return "Color is Green";
    }

}
