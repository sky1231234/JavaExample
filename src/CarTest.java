public class CarTest {
    public static void main(String[] args){
        Car c = new Car();
        System.out.println(c);
        c.printName();
        System.out.println("-----------------");
        Car c2 = new Car("ysCar");
        c2.printName();
    }

}
