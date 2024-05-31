package pl.zajavka.Factory;

public class HawaiianPizza implements Pizza{
    @Override
    public String whatSauce() {
        return "Tomato";
    }

    @Override
    public void bake() {
        System.out.println("im soo baking my pineapple!");
    }

    public void morePineapple() {
        System.out.println("more pineapple");
    }
}
