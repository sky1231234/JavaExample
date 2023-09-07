import java.util.Arrays;

public class ReferenceType {

    //    1. 참조 변수가 일반 객체일 때
    private final Age age;

    public ReferenceType(final Age age){
        this.age = age;
    }

    public Age getAge(){
        return age;
    }
}


//1. Age 클래스를 불변으로 만든다.
class Age {

    private final int value;

    public Age(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
