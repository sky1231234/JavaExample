import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListExam03 {

    public static void main(String[] args) {
//        ArrayList는 list 인터페이스 구현 list 인터페이스는 collection 상속받기때문에 가능
//        Collection<String> collection = 뒤에는 collection을 구현하고 있는 자료구조가 모두 나올 수 있다
//        앞부분은 인터페이스 타입 뒤에 인스턴스 만드는 부분만 클래스 타입으로 구현하면 더 효율적
        Collection<String> collection = new ArrayList<>();
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

//참조 타입의 메소드만 사용가능하므로 get(int) 메소드 사용 불가
//        System.out.println(collection.get(0));

        //collection 안의 Iterator를 통해 값 확인
//        collection은 순서를 기억하지 않지만 arralylist가 구현되어 있기때문에 순서대로 나옴
        Iterator<String> iter = collection.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);

        }
    }
}
