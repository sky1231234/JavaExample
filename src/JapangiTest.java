
public class JapangiTest {
    public static void main(String[] args){
        Japangi j = new Japangi();

        j.putCoin(1000);
        j.putCoin(2000);

        String product = j.clickButton("코카콜라");

        if( ! product.isEmpty() )
            j.giveProduct(product);
        else
            System.out.println( product+"의 재고가 없습니다.");
    }
}
