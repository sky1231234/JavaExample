package com.example;

public class MyRunnableMain2 {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hello!!");
            }
        };

        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("-----------");
//        1.
        runnableExecute.execute(myRunnable);

//        2.
        //myRunnable이 재사용되지 않을 것 같을 때
        //MyRunnable을 구현하고 있는 이름없는 객체를 생성하자마자 메소드에 넣어준 것
        runnableExecute.execute(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hello!!");
            }
        });

//        3.
        runnableExecute.execute(() -> {
                System.out.println("hello!!");
        });

        System.out.println("-----------");

    }

}
