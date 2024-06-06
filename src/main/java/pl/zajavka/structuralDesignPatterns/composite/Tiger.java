package pl.zajavka.structuralDesignPatterns.composite;

public class Tiger implements Animal{
    @Override
    public void eat(Food food) {
        System.out.println("Tiger eating food" + food);
    }
}
