package pl.zajavka.structuralDesignPatterns.composite;

public class Main {
    public static void main(String[] args) {
        // composite
        // obiekty sa traktowane jako rodzina
        // Base component - interfejs reprezentujacy baze rodziny
        // Leaf - konkretna implementacja zwierzatka
        // Composite - kolekcja lisci

        ZOO zoo = new ZOO();
        zoo.add(new Monkey());
        zoo.add(new Tiger());
        zoo.add(new Monkey());
        zoo.add(new Elephant());
        zoo.add(new Tiger());
        zoo.add(new Elephant());
        zoo.add(new Tiger());


        Food food = new Food();
        System.out.println("Food: " + food);
        zoo.eat(food);

    }
}
