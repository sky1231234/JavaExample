public class Japangi {
    private int amount;

    //동전을 넣는다.
    public int putCoin(int coin) {
        this.showAmount(coin);
        return coin;
    }

    //현재 잔액을 보여준다.
    public int showAmount(int coin) {
        this.amount += coin;
        System.out.println("현재 잔액은 "+ this.amount+"입니다.");
        return this.amount;
    }

    //버튼을 누른다.
    public String clickButton(String product) {
        System.out.println( product+"를 선택하였습니다.");
        return product;
    }

    //상품을 준다.
    public void giveProduct(String product) {
        System.out.println("선택한 상품"+ product+"가 나왔습니다.");
    }

}
