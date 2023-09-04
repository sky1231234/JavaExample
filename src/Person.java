public class Person {
    String name; //static이 안붙어있으면 인스턴스 필드
    String address;
    boolean isVip;
    static int count; //클래스 필드

    static{
        count = 100;
    }
    public void printName(){ //인스턴스 메서드
        System.out.println("내 이름은 " + name );
    }
    public static void printCount(){
//        System.out.println(name); //static한 메소드에서 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없음
        System.out.println("count : " + count );

    }
}
