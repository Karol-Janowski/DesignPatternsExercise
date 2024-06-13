package pl.zajavka.behavioralDesignPatterns.visitor.java8;



import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // java 8 functional approach

        List<ShoppingCartElement> elements = List.of(
                new Bicycle(BigDecimal.valueOf(100.25), BigDecimal.TEN),
                new Bicycle(BigDecimal.valueOf(2542.25), BigDecimal.TEN),
                new Apple(BigDecimal.valueOf(154.2), BigDecimal.valueOf(2.523)),
                new Apple(BigDecimal.valueOf(152.2), BigDecimal.valueOf(2,345))
        );

        var visitorMap = new ShoppingCartVisitorMap();

        BigDecimal result = elements.stream()
                .map(element -> element.accept(visitorMap.apply(element.getClass())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total price: " + result);
    }
}
