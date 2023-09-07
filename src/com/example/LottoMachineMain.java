package com.example;

public class LottoMachineMain {
    public static void main(String[] args) {

        //변수가 45개 필요하다. Ball 인스턴스를 45개 참조할 수 있는 배열이 만들어진다.
        //인스턴스가 아니라 ball을 45개 참조할 수 있는 변수를 만든것

//        Ball b1 = new Ball(1);
//        Ball b2 = new Ball(2);
//        ...
//        Ball b45 = new Ball(45);
        //각 번호에 해당하는 방을 만든것 balls[0] = null 인 상태
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];

//        balls[0] = new Ball(1);
//        balls[1] = new Ball(2);
//        ...
//        balls[44] = new Ball(45);
        for (int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++){
            balls[i] = new Ball(i+1);
        }
        //LottoMachine인스턴스가 생성된다.
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for (int i=0; i < result.length; i++){
            System.out.println(result[i].getNumber());
        }
    }
}
