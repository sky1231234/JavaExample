package com.example.car;

public abstract class Factory {

    //팩토리 메소드
    public final Car makeCar(String car){
        Car c = createCar(car);
        return c;
    }

    protected abstract Car createCar(String car);
}
