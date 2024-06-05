package pl.zajavka.creationalDesignPatterns.prototype;

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
    protected PrototypeCar clone() throws CloneNotSupportedException {
        final PrototypeCar cloned = (PrototypeCar) super.clone();
        cloned.brand = brand;
        cloned.model = model;
        cloned.steeringWheel = this.steeringWheel.clone();
        cloned.doors = new ArrayList<>(this.doors);
        return cloned;
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
