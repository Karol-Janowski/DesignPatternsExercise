package pl.zajavka.creationalDesignPatterns.abstractFactory;

public interface AbstractFactory<T> {

    T create(String type);
}
