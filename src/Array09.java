public class Array09 {

    public static void main(String[] args) {
        int[] copyForm = {1,2,3};

        int[] copyTo = java.util.Arrays.copyOf(copyForm, copyForm.length);

        for (int i : copyTo
             ) {
            System.out.println(i);
        }
        System.out.println("------------------------------");

        int[] copyTo1 = java.util.Arrays.copyOf(copyForm, 5);

        for (int i : copyTo1
        ) {
            System.out.println(i);
        }

        System.out.println("------------------------------");

        int[] copyTo2 = copyForm;

        for (int i : copyTo2
        ) {
            System.out.println(i);
        }

        //같은 걸 참조함
        if(copyForm == copyTo2)
            System.out.println("copyForm == copyTo2");
        else
            System.out.println("copyForm != copyTo2");

        //배열 복사한 것은 다른 것을 참조함 값만 같은 것

        int[] copyTo3 = java.util.Arrays.copyOfRange(copyForm, 1,3);

        for (int i : copyTo3
        ) {
            System.out.println(i);
        }

    }
}
