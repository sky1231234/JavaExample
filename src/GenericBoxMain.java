public class GenericBoxMain {

    public static void main(String[] args) {

        //GenericBox 클래스 내 T가 모두 String형식으로 취급된다.
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.set(new Integer(1000));
        Integer intValue = intBox.get();
        System.out.println(intValue);

        GenericBox<Object> objectBox = new GenericBox<>();

    }
}
