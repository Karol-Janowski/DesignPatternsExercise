package pl.zajavka.creationalDesignPatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class SteeringWheel implements Cloneable{

    private double diameter;

    public SteeringWheel deepCopy() {
        var newSteeringWheel = new SteeringWheel();
        newSteeringWheel.diameter = diameter;
        return newSteeringWheel;
    }

    @Override
    public SteeringWheel clone() {
        try {
            SteeringWheel clone = (SteeringWheel) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
