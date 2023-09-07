package com.example;

public class MyRunnableMain {
    public static void main(String[] args) {

        //이름없는 객체를 간략히 표현한 것
        //람다 인터페이스
//        () -> {
//            System.out.println("hello!!");
//        }

        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
                    System.out.println("MyRunnable run!!!");
            }
        };


        r.run();
    }
}
