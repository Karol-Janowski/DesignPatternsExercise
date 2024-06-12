package pl.zajavka.behavioralDesignPatterns.chainOfResponsibility;

public class QualityCheckHandler implements CarHandler{

    @Override
    public void setNextHandler(CarHandler nextHandler) {
    }

    @Override
    public void handle(Car car) {
        System.out.printf("Checking quality!%n");
    }
}
