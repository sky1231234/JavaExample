public class Exception2 {

    public static void main(String[] args) {
// 1. ArithmeticException 에러
        int[] array = {4, 0};
// 2. value = null이므로 value[0]은 존재하지 않음
//        NullPointException -> Exception 에러
        int[] array1 = {4, 2};
//        int[] value = null;
        int[] value = new int[1];
        try {
            value[0] = array[0] /array[1];
        }catch (ArrayIndexOutOfBoundsException aiob){
//            int[] array = {4}; 일 때
            System.out.println(aiob.toString());
        }catch (ArithmeticException ae){
            System.out.println(ae.toString());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
