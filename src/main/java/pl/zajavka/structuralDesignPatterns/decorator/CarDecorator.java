package pl.zajavka.structuralDesignPatterns.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class CarDecorator implements Car{

    private final Car car;

    @Override
    public String create() {
        return car.create();
    }
}
