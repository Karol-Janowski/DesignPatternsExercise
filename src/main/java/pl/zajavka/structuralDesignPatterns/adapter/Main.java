package pl.zajavka.structuralDesignPatterns.adapter;

public class Main {
    public static void main(String[] args) {
        // Adapter
        // Zmusic do pracy 2 interfejsy niezalezne od siebie
        // Ewentualnie piszemy Adapter zanim dostaniemy zrodlo danych

        Dimension dimension = new SonyTV();
        DimensionAdapter dimensionAdapter = new DimensionAdapterImpl(dimension);

        System.out.println("Original:" + dimension.getDimension());
        System.out.println("Adapter:" + dimensionAdapter.getDimension());
    }
}
