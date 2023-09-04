public class Car {

    private String name;

    //생성자는 메소드와 비슷하다
    // return type이 없다. 클래스 이름과 같아야함
    // 매개변수가 0개인 생성자를 기본 생성자라고 한다.( 매개변수를 하나도 받지 않는 생성자)
    // 생성자가 하나도 없으면 아무일도 안하는 기본생성자가 자동으로 만들어진다.

    public Car(){
        System.out.println("자동차가 한대 생성됩니다.");
    }

    //이름을 가지고 인스턴스가 만들어지게 하고싶다.
    public Car(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("자동차 이름 : " + this.name);
    }
}
