package pl.zajavka.structuralDesignPatterns.proxy;

public class PizzaBakerImpl implements PizzaBaker{
    @Override
    public void bake(String pizza) {
        System.out.println("Baking pizza: " + pizza);
    }
}
