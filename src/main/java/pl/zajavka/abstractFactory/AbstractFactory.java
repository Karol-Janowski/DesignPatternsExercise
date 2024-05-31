package pl.zajavka.abstractFactory;

public interface AbstractFactory<T> {

    T create(String type);
}
