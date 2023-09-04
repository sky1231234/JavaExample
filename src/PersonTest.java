public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();

        p1.name = "홍길동";
        p1.printName();
        p1.printCount();

        Person.count ++;
        Person.printCount();
        p1.printCount();
    }
}
