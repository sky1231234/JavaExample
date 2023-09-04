public class Bus extends Car2{
    public Bus(){
        super("Bus!!"); //부모의 기본 생성자를 호출하는 코드가 자동으로 생성된다.
    }

    //부모가 가지고 있는 추상메소드는 자식 클래스에서 반드시 구현을 해줘야 한다.
    public void run(){
        System.out.println("전기로 달린다.");
    }
}
