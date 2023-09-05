public class Array05 {

    public static void main(String[] args) {
        double[] array = {1.5,2.4,3.5};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //초기화된 값 없기때문에 ArrayIndexOutOfBoundsException 에러 남
        System.out.println(array[3]);

        double[] array2 = new double[0];
        System.out.println(array2.length); // 결과 : 0
        //초기화된 값 없기때문에 ArrayIndexOutOfBoundsException 에러 남
        System.out.println(array2[0]);


    }

}
