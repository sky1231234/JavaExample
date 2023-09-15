package com.example.abstractFactory;

public class SamSungnotebook implements NewComputer{
    @Override
    public Mouse createMouse() {
        System.out.println("삼성마우스");
        return new Mouse("SamSung");
    }

    @Override
    public Monitor createMoniter() {
        System.out.println("삼성모니터");
        return new Monitor("SamSung");
    }
}
