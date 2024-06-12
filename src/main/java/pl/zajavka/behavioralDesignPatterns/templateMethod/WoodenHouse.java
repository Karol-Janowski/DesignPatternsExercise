package pl.zajavka.behavioralDesignPatterns.templateMethod;

public class WoodenHouse extends HouseTemplate{
    @Override
    protected void buildFoundation() {
        System.out.println("WoodenHouse buildFoundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("WoodenHouse buildWalls");
    }

    @Override
    protected void makeRoof() {
        System.out.println("WoodenHouse makeRoof");
    }

    @Override
    protected void insertWindows() {
        System.out.println("WoodenHouse insertWindows");
    }
}
