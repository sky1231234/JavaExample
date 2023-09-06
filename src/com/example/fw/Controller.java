package com.example.fw;

/*
Controller의 종류가 여러개
초기화 - 같은 코드
실행 - 다른 코드?
마무리 - 같은 코드
 */

//execute() 메소드만 사용자가 호출 가능
//init() 이나 close() 메소드는 사용자가 호출 불가능하게 하려면 protected 접근 제한자 사용
public abstract class Controller {

    //protected는 같은 패키지이거나 상속받았을 때만 사용 가능
    //final이 붙은 메소드는 오버라이딩이 금지됨
    protected final void init(){
        System.out.println("초기화 하는 코드");
    }

    protected final void close(){
        System.out.println("마무리 하는 코드");
    }
    protected abstract void run(); //매번 다른 코드

    //내가 가지고 있는 메소드를 호출한다
    //어떤 순서를 가지고 있다. 이런 메소드를 템플릿 메소드라고 함
    public void execute(){
        this.init(); //this. 생략가능
        this.run();
        this.close();
    }
}
