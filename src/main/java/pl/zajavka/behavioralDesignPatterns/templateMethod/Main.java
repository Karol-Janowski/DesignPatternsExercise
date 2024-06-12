package pl.zajavka.behavioralDesignPatterns.templateMethod;

public class Main {
    public static void main(String[] args) {
        // Template Method

        System.out.println("#Brick");
        HouseTemplate houseTemplate1 = new BrickHouse();
        houseTemplate1.build();

        System.out.println();

        System.out.println("#Wood");
        HouseTemplate houseTemplate2 = new WoodenHouse();
        houseTemplate2.build();
    }
}
