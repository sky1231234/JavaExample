package com.example.abstractFactory;

public class LGnotebook implements NewComputer{
    @Override
    public Mouse createMouse() {
        System.out.println("LG마우스");
        return new Mouse("LG");
    }

    @Override
    public Monitor createMoniter() {
        System.out.println("LG모니터");
        return new Monitor("LG");
    }
}
