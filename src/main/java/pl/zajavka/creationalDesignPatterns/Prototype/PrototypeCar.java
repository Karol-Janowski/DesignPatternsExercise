package pl.zajavka.creationalDesignPatterns.Prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class PrototypeCar implements Cloneable {

    // shallow copy
    // deep copy
    private String brand;
    private String model;
    private SteeringWheel steeringWheel;
    private List<String> doors;

    public PrototypeCar() {
        this.brand = "Ford";
        this.model = "Mustang";
        this.steeringWheel = SteeringWheel.of(10.65);
        this.doors = new ArrayList<>(Arrays.asList("lf", "rf", "lr", "rr"));

    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //    public PrototypeCar shallowCopy() {
//        var newCar = new PrototypeCar();
//        newCar.steeringWheel = steeringWheel;
//        return newCar;
//    }
//    public PrototypeCar deepCopy() {
//        var newCar = new PrototypeCar();
//        newCar.steeringWheel = this.steeringWheel.deepCopy();
//        return newCar;
//    }
}
