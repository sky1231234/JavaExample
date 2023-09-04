public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        //new가 쓰이면 heap 메모리에 항상 새로운 객체가 만들어짐
        String str3 = new String("hello");
        String str4 = new String("hello");

        // == : 같은 것은 참조하느냐 (같은 값이냐 x)
        if(str1 == str2)
            System.out.println("str1 == str2");
        //string 쓸 때는 new를 쓰지 않는 것이 좋음
        if(str1 == str3)
            System.out.println("str1 == str3");
        if(str1 == str4)
            System.out.println("str1 == str4");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);


    }
}
