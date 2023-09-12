public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        // == : 같은 것은 참조하느냐 (같은 값이냐 x)
        if(str1.equals(str2))
            System.out.println("str1과 str2의 값이 같다.");

        String s = str1.toUpperCase();
        System.out.println(s);

        //string은 불변 클래스이므로 값이 변하지않음.
        //내부적으로 새로운 문자열을 만들어서 리턴하므로 자기 자신은 변화시키지 않는 불변 객체
        System.out.println(str1);



    }
}

