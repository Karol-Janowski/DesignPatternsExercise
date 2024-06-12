package pl.zajavka.structuralDesignPatterns.bridge;

public class Main {
    public static void main(String[] args) {
        // Bridge
        // polaczenie dwoch abstrakcji
        Shape shape1 = new Square(new Green());
        System.out.println(shape1);

        Shape shape2 = new Triangle(new Red());
        System.out.println(shape2);
    }
}
