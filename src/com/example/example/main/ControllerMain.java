package com.example.example.main;

import com.example.fw.Controller;
import com.example.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();

        //public 메소드만 호출 가능
        c1.execute();
    }
}
