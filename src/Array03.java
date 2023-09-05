public class Array03 {
    public static void main(String[] args) {
        ItemForArray[] array1;
        ItemForArray array2[];

        array1 = new ItemForArray[5];
        array2 = new ItemForArray[5];

        array1[0] = new ItemForArray(500, "item01");
        array1[1] = new ItemForArray(1000, "item02");

        ItemForArray i1 = new ItemForArray(500, "itemAAA");

        System.out.println(array1[0].getName());
        System.out.println(i1.getName());

        //현재 array2[2]에 참조하는 값이 없기때문에 NullPointExection 나옴
        //System.out.println(array2[2].getName());

    }
}
