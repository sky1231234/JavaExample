package com.example.car;

public class CarFactory extends Factory{

    @Override
    protected Car createCar(String car) {
        switch (car){
            case "taxi" :
                return new Taxi();
            case "SuperCar" :
                return new SuperCar();
        }
        return null;
    }
}
