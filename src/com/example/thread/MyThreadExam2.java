package com.example.thread;

public class MyThreadExam2 {

    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("thread name : " + name);
        System.out.println("start!");

        MyRunnable myRunnable1 = new MyRunnable("*");
        MyRunnable myRunnable2 = new MyRunnable("+");

//        3. Thread 인스턴스를 생성하는데, 생성자에 Runnable 인스턴스를 넣어준다.
        Thread t1 = new Thread(myRunnable1);
        Thread t2 = new Thread(myRunnable2);

//        4. Thread가 가지고 있는 start() 메소드를 호출한다.
        t1.start();
        t2.start();

        System.out.println("end!");

    }
}
