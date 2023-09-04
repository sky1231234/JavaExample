package com.example.util;

public class Calculator {

    public int plus(int x, int y){
        return  x+y;
    }

    public static void main(String[] args){
        Calculator c = new Calculator();
        int plus = c.plus(100,200);

        System.out.println(plus);
    }
}
