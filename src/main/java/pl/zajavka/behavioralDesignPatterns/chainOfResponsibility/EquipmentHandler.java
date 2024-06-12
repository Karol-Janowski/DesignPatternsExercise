package pl.zajavka.behavioralDesignPatterns.chainOfResponsibility;

import java.util.Objects;

public class EquipmentHandler implements CarHandler{

    private CarHandler nextHandler;

    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Car car) {
        if (Objects.nonNull(car.getEquipment())) {
            System.out.printf("Preparing equipment: %s%n", car.getEquipment());
        } else {
            this.nextHandler.handle(car);
        }
    }
}
