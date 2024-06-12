package pl.zajavka.structuralDesignPatterns.bridge;

import lombok.ToString;

@ToString(callSuper = true)
public class Triangle extends Square {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle with color " + color.apply());
    }
}
