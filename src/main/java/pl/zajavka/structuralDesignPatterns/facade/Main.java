package pl.zajavka.structuralDesignPatterns.facade;

import pl.zajavka.structuralDesignPatterns.facade.car.CarFactoryFacade;

public class Main {
    public static void main(String[] args) {
        // Facade
        // zunifikowany punkt dostepui gdzie ukrywamy logike ktora jest pod spodem

        CarFactoryFacade carFactoryFacade = new CarFactoryFacade();
        carFactoryFacade.produceCar();

    }
}
