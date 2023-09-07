public class ArrayTypeMain {

    public static void main(String[] args) {
        int[] array = {1,2,100};
        ArrayType arrayType = new ArrayType(array);

        for (int i : arrayType.getArray()
             ) {
            System.out.println(i + " ");
        };
//        결과 : 1,2,100

        array[0] = 2000; //array값을 바꿔도 arrayType의 값은 변하지 않는다.

        for (int i : arrayType.getArray()
        ) {
            System.out.println(i + " ");
        };
//        결과 : 1,2,100
    }
}
