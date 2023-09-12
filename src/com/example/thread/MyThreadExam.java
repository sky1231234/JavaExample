package com.example.thread;

public class MyThreadExam {

    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("thread name : " + name);
        System.out.println("start!");

        MyThread myThread1 = new MyThread("*");
        MyThread myThread2 = new MyThread("+");

//        3. Thread는 start() 메소드로 실행한다.
        myThread1.start();
        myThread2.start();

        System.out.println("end!");

    }
}
