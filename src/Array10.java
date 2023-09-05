import java.util.Arrays;
//java.lang 패키지의 클래스는 import를 하지 않아도 사용 가능

public class Array10 {

    public static void main(String[] args) {
        char[] copyForm = {'h', 'e', 'l', 'l', 'o', '!'};

        char[] copyTo = java.util.Arrays.copyOfRange(copyForm, 1,3);
        //import하면 Arrays로 사용 가능
        char[] copyTo1 = Arrays.copyOfRange(copyForm, 1,3);

        for (char i : copyTo
        ) {
            System.out.println(i);
        }
    }
}
