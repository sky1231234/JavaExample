public class MathBeanTest {

    //static 은 인스턴스를 생성하지 않아도 메모리에 올라가기 때문에 실행할 수 있다.
    public static void main(String[] args){

        //MathBean 인스턴스가 만들어지고, 메모리에 올라가게 됨
        //인스턴스는 heap이라고 하는 메모리에 올라감

        MathBean math = new MathBean();
        math.printClassName();

        math.printNumber(500);

        int x = math.getOne();
        System.out.println(x);

        int value = math.plus(250,300);
        System.out.println(value);

    }
}
