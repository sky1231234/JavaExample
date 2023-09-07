package com.example;

public class Ball {
    private int number;

    //생성자에서 필드로 값을 넘겨서 값을 초기화해주는 객체를 불변 객체라고 함.
    public Ball(int number){
        this.number = number;
    }


    public int getNumber() {
        return number;
    }
}
