package pl.zajavka.structuralDesignPatterns.composite;

public class Elephant implements Animal{
    @Override
    public void eat(Food food) {
        System.out.println("elephant eating food" + food);
    }
}
