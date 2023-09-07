import java.util.ArrayList;

//제네릭 사용하여 ArrayList 사용하기
public class ListExam02 {

    public static void main(String[] args) {
//        ArrayList가 string 타입을 갖게 하겠다.
        ArrayList<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        // string으로 형변환 필요없음
        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


    }
}
