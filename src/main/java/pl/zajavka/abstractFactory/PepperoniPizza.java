package pl.zajavka.abstractFactory;

public class PepperoniPizza implements Pizza {
    @Override
    public String whatSauce() {
        return "Spicy";
    }

    @Override
    public void bake() {
        System.out.println("i'm soo baking!");
    }

    public void beMoreSpicy() {
        System.out.println("be more spicy");
    }
}
