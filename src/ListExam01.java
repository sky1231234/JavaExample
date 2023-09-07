import java.util.ArrayList;
import java.util.List;

//제네릭을 사용하지 않고 ArrayList 사용하기
public class ListExam01 {

    public static void main(String[] args) {

//        자료구조객체들은 generic을 사용하지않으면 object 타입을 저장
        ArrayList list = new ArrayList();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        //object형태로 받기때문에 string으로 형변환 해줘야함
        String str1 = (String) list.get(0);
        String str2 = (String) list.get(1);
        String str3 = (String) list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


    }
}
