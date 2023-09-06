package com.example.example;

/*
1. 1-45까지 써있는 ball을 로또 기계에 넣는다.
2. 로또 기계에 있는 ball을 섞는다.
3. 섞인 ball 중에서 6개를 꺼낸다.
 */
//추상클래스와 마찬가지로 new 연산자를 통해 인스턴스화 시킬 수 없다.
public interface LottoMachine {

    //인터페이스가 가지는 모든 필드는 public static하다. 메모리에 인스턴스를 만들지 않아도 올라갈 수 있다.
    int MAX_BALL_COUNT = 46;
    int RETURN_BALL_COUNT = 8;
    //구현하는 코드 없이 메소드 선언만 함. => 인터페이스가 갖고 있는 모든 메소드는 추상메소드 abstract 생략 가능

    public void setBalls(Ball[] balls); //Ball[] : ball 여러개를 받겠다. 45개를 받는다.
    public void mix(); //자기가 가지고 있는 ball들을 섞는다.
    public Ball[] getBalls(); //6개의 Ball을 반환한다.
}
