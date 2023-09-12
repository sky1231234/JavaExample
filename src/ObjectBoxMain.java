public class ObjectBoxMain {

    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        ObjectBox<String> box1 = new ObjectBox<>();
        ObjectBox<Integer> integer = new ObjectBox<>();

        box1.set("gg");
        String str1 = box1.get();
        System.out.println(str1.toUpperCase());

        box.set("kim");
        String str = (String)box.get();
        System.out.println(str.toUpperCase());

        box.set(new Integer(5));
        Integer i = (Integer) box.get();
        System.out.println(i.intValue());

        integer.set(5);
        Integer intGeneric = integer.get();
        System.out.println(intGeneric.intValue());

    }
}
