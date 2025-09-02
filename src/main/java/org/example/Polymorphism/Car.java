package org.example.Polymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Engine started");
    }

    public void drive(){
        System.out.println("Car driving " + this.getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("You are on a way!");
    }
}
