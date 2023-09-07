public abstract class Teacher {

    //템플릿 메소드
    public void startClass(){
        this.enterClassroom();
        this.sayHi();
        this.teach();
        this.leaveClassroom();
    }

    //protected 사용 이유 : 사용자가 개별 메소드를 호출하지 못하게 하기 위함
    //final 사용 이유 : 하위 클래스에서 오버라이딩 금지
    protected final void enterClassroom(){
        System.out.println("선생님이 교실에 들어오셨다");
    }

    protected final void sayHi(){
        System.out.println("인사를 건네신다.");
    };

    protected abstract void teach();

    public final void leaveClassroom(){
        System.out.println("선생님이 교실을 나가신다.");
    }
}
