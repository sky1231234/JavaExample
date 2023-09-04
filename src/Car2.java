//추상 클래스
public abstract class Car2 {
    public Car2(String name){
        System.out.println("Car2 기본 생성자 호출");
    }

    //추상 메소드. Car2를 만든 사람은 run()이라는 메소드를 만드려고 한다.
    //run() 은 자동차마다 다르게 구현한다.
    //구현 부분없이 메소드 선언만 한다.
    public abstract void run();
}
