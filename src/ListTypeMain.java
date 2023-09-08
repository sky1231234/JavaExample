import java.util.ArrayList;
import java.util.List;

public class ListTypeMain {

    public static void main(String[] args) {
        List<Age> age = new ArrayList<>();
        age.add(new Age(30));

        ListType listType = new ListType(age);

        for (Age a: listType.getList()
             ) {
            System.out.println(a.getValue());
        }
//      결과 : 30

        System.out.println("---------------------");
        //age 리스트에는 값이 추가되지만, listType의 list에는 추가되지 않는다.
        age.add(new Age(100));

        for (Age a: listType.getList()
        ) {
            System.out.println(a.getValue());
        }
        //      결과 : 30
    }
}

//https://velog.io/@conatuseus/Java-Immutable-Object%EB%B6%88%EB%B3%80%EA%B0%9D%EC%B2%B4