package com.example;

public class CarExam {

    public static void main(String[] args) {

        //Car는 추상클래스이므로 인스턴스 만들 수 없음
    //    Car c1 = new Car() ; //에러

        //Car를 상속받는 Bus는 인스턴스화 가능
        Car c2 = new Bus() ;

        //Car는 상속받고 싶은데 클래스는 만들고 싶지 않은 경우
        //Car를 상속받고 있는 이름없는 객체의 인스턴스가 만들어진다.
        Car c3 = new Car() {
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a()메소드 오버라이딩");
            }
        };
        c3.a();


    }
}
