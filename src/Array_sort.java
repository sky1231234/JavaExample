import java.util.Arrays;

public class Array_sort {
    public static void main(String[] args) {
        int[] array = {5,4,3,1,2};

        Arrays.sort(array);

        for (int i : array) {
            System.out.println(i);
        }

        //4를 찾아라
        int b = Arrays.binarySearch(array,4);
        System.out.println(b);

    }
}
