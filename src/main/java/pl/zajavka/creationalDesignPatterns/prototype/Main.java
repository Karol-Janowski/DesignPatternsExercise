package pl.zajavka.creationalDesignPatterns.prototype;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        //prototype

        PrototypeCar original = new PrototypeCar();

        System.out.println("Original before: " + original);

        // lombok builder toBuild = True example (shallow copy)
        List<String> doorsNew = new ArrayList<>(original.getDoors());
        doorsNew.add("back door");
        PrototypeCar cloned = original.toBuilder()
                        .doors(doorsNew)
                        .build();

        System.out.println(original == cloned);
        System.out.println(original.getSteeringWheel() == cloned.getSteeringWheel());
        System.out.println(original.getBrand() == cloned.getBrand());
        System.out.println(original.getModel() == cloned.getModel());
        System.out.println(original.getDoors() == cloned.getDoors());

        System.out.println("Before adding doors: ");


        // deep copy / shallow copy
//        PrototypeCar copyCar = new PrototypeCar();
//        SteeringWheel steeringWheel = new SteeringWheel();
//        steeringWheel.setDiameter(10.5);
//        copyCar.setSteeringWheel(steeringWheel);
//
//        PrototypeCar shallowCopy = copyCar.shallowCopy();
//        PrototypeCar deepCopy = copyCar.deepCopy();
//
//        System.out.println("shallow copied == " + (copyCar == shallowCopy));
//        System.out.println("shallow copied equals " + (copyCar.equals(shallowCopy)));
//
//        System.out.println("shallow copied == " + (copyCar.getSteeringWheel() == shallowCopy.getSteeringWheel()));
//        System.out.println("shallow copied equals " + (copyCar.getSteeringWheel().equals(shallowCopy.getSteeringWheel())));
//
//
//        System.out.println("deep copied == " + (copyCar.getSteeringWheel() == deepCopy.getSteeringWheel()));
//        System.out.println("deep copied equals " + (copyCar.getSteeringWheel().equals(deepCopy.getSteeringWheel())));
    }
}
