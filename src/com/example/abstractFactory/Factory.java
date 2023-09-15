package com.example.abstractFactory;

public class Factory {

    public void createComputer(String company) {
        NewComputer newComputer = null;
        if (company == "LG") {
            newComputer = new LGnotebook();
        } else if (company == "SamSung") {
            newComputer = new SamSungnotebook();
        }

        newComputer.createMouse();
        newComputer.createMoniter();
    }
}
