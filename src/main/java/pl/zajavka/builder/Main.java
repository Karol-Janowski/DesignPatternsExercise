package pl.zajavka.builder;

public class Main {
    public static void main(String[] args) {
        // builder

        Car car = Car.builder()
                .brand("Ford")
                .model("Mustang")
                .year("1996")
                .skiRack("skiRack")
                .build();

        System.out.println(car);
    }
}
