public class SportsCar extends Car2{
    //Car2에 기본생성자가 없익때문에 반드시 super()를 호출해야함.
    public SportsCar(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("빠르게 달린다.");
    }
}
