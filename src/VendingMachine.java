public class VendingMachine {

    public static void main(String[] args){
        //static 메소드는 클래스 메소드 = 인스턴스를 생성하지 않아도 사용 가능
        // 사용 가능하다는 것은 인스턴스를 생성하지않아도 메모리에 올라가있다
        VendingMachine vm1 = new VendingMachine();
    }
    public int coin;

    public String pushProductButton(int menuId){
        System.out.println(menuId + "를 전달받았습니다.");
        return "콜라";
    }
    public static void printVersion(){

        System.out.println("v1.0");
    }
}
