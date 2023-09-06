package com.example.example.myproject;

import com.example.fw.Controller;


public class FirstController extends Controller {

    //controller 클래스와 다른 패키지여도 상속받았으므로 protected 가능
    @Override
    protected void run() {
        System.out.println("별도로 동작하는 코드 11111");
    }

}
