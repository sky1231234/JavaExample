public class VendingMachineMain {
    public static void main(String[] args){

        //static한 메소드는 레퍼런스변수명.static메소드()
        VendingMachine.printVersion();
//        vm1.printVersion(); //가능하긴하지만 바람직하진않음

        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);
        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);
    }
}


//터미널에선
//javac VendingMachine.java
//javac VendingMachineMain.java
//java VendingMachineMain
//VendingMachineMain을 어디서 찾아서 실행할까요?
//CLASSPATH 경로에서 클래스를 찾아서 실행한다.