package pl.zajavka.behavioralDesignPatterns.chainOfResponsibility;

public interface CarHandler {

    void setNextHandler(CarHandler nextHandler);

    void handle(Car car);
}
