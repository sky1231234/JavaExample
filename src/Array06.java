public class Array06 {

    public static void main(String[] args) {

        //배열이 배열을 참조하는 형태
        int[][] array = new int[2][3];
        array[0][0] = 0;
        array[0][1] = 1;
        array[0][2] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
        array[1][2] = 5;
        int[][] array1 = {{0,1,2},{3,4,5}};

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.println( array[i][j] + "\t");
            }
        }
    }
}
