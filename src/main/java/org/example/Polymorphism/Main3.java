package org.example.Polymorphism;

public class Main3 {
    public static void main(String[] args) {
    Car car = new Car("BMW");
    GasPoweredCar gasPoweredCar = new GasPoweredCar("Subaru");
//    car.drive();
    gasPoweredCar.drive();
    }
}
