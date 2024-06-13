package pl.zajavka.behavioralDesignPatterns.observer;

public class Main {
    public static void main(String[] args) {
        // Observer
        // Observer, Observable/Subject

        NewsTopic subject = new NewsTopic();

        Observer observer1 = news -> System.out.printf("Message - %s%n", news);
        Observer observer2 = news -> System.out.printf("Message - %s%n", news);
        Observer observer3 = news -> System.out.printf("Message - %s%n", news);

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        subject.setNews("Some new news!");
    }
}
