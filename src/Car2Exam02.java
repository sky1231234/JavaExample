public class Car2Exam02 {
    public static void main(String[] args) {
        //car2는 추상클래스이므로 인스턴스화 될 수 없다.
//        Car2 c = new Car2("name") ;

//        Bus b = new Bus() ;
//        b.run();
//
//        SportsCar s1 = new SportsCar("sportsCar!!");
//        s1.run();

        Car2[] array = new Car2[2];
        array[0] = new Bus();
        array[1] = new SportsCar("sportsCar!!");
        for(Car2 c2 : array){
            c2.run();
        }
    }
}
