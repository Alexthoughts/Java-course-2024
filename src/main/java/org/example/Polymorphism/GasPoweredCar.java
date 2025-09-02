package org.example.Polymorphism;

public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("My gas car");
    }
}
