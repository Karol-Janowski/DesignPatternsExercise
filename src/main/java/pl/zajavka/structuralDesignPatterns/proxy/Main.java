package pl.zajavka.structuralDesignPatterns.proxy;

public class Main {
    public static void main(String[] args) {
        // Proxy
        // Kontrolowany dostep do jakiegos zasobu
        // my -> proxy -> zrodlo
        // cashowanie danych
        // klient -> kelner -> chef

        PizzaBaker executor = new PizzaBakerProxy(new PizzaBakerImpl());
        executor.bake("pepperoni");
        executor.bake("Hawaiian");
        executor.bake("Margaritta");
    }
}
