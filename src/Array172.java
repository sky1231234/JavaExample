import java.util.Arrays;
import java.util.Comparator;

public class Array172 {

    public static void main(String[] args) {
        Item[] items = new Item[5];

        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("자바스크립트", 6000);
        items[4] = new Item("Dart", 2000);

        //sort(Object[]) - Object는 모든 객체의 조상이니까 어떤 객체의 배열이든 올 수 있다.
        Arrays.sort(items); //ClassCastExectopn - 정렬 기준이 없기때문에 에러
//       1. 정렬 방식을 넣어 줄 수 있음
        Arrays.sort(items,new ItemSorter());
//      2. 이름없는 객체
        Arrays.sort(items,new ItemSorter(){

            // o1 - o2
            @Override
            public int compare(Object o1, Object o2) {
                Item i1 = (Item) o1;
                Item i2 = (Item) o2;

                return i1.getName().compareTo(i2.getName());
            };
        });
//      3. 메소드 파라미터 전까지 지워주고 화살표 만들기 (람다 표현식)
        Arrays.sort(items,(Object o1, Object o2) -> {
                Item i1 = (Item) o1;
                Item i2 = (Item) o2;

                return i1.getName().compareTo(i2.getName());
        });

//       4.내부적으로 item이라고 인식 & return 제거
        Arrays.sort(items,(item1, item2) -> item1.getName().compareTo(item2.getName()));

        for (Item item : items
             ) {
            System.out.println(item);
        }
    }
}

class ItemSorter implements Comparator{
    // o1 - o2
    @Override
    public int compare(Object o1, Object o2) {
        Item i1 = (Item) o1;
        Item i2 = (Item) o2;

        return i1.getName().compareTo(i2.getName());
    }
}
//implements Comparable는 어떤 item이 큰지, 작은지 기준을 정하는 interface
class Item implements Comparable {

    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    //파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    @Override
    public int compareTo(Object o) {
        Item d = (Item) o;
//        이름 순으로 정렬
//        return this.name.compareTo(d.name);
//        가격 순으로 정렬
        return this.price - d.price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item {" +
                "name ='" + name + '\'' +
                ", price = " + price +
                        '}';
    }
}
