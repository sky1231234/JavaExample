package com.example.car;

public class Main {
    public static void main(String[] args) {
        Factory factory = new CarFactory();

        Car taxi = factory.makeCar("taxi");
        taxi.getCar();

        Car superCar = factory.makeCar("SuperCar");
        superCar.getCar();
    }
}
