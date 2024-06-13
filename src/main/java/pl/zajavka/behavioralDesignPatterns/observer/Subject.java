package pl.zajavka.behavioralDesignPatterns.observer;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);
}
