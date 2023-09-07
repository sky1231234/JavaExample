import java.util.Arrays;

public class ArrayType {

//    2. Array일 때
    private final int[] array;

    public ArrayType( final int[] array){
        this.array = Arrays.copyOf(array, array.length);
    }

    //2. 배열을 그대로 참조하거나, 반환할 경우 외부에서 배열 내부 값 변경 가능하므로 clone한 배열 값을 반환
    public int[] getArray(){
        return array.clone();
    }
}



