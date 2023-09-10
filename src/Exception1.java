public class Exception1 {
    public static void main(String[] args) {
        ExceptionObj1 exceptionObj1 = new ExceptionObj1();

//        1. ExceptionObj1에서 try-catch로 예외 처리 했을 경우
//        int value = exceptionObj1.divide(10,0);
//        System.out.println(value);

//        2. throws로 예외 떠넘기기 했을 경우
        try {
            int value = exceptionObj1.divide(10,0);
        }catch (ArithmeticException ex){
            System.out.println("0으로 나눌 수 없어요.");
        }
    }
}
class ExceptionObj1{
    public int divide(int i, int k){
        int value = 0;

        try {
            value = i / k;
        }catch (ArithmeticException ex){
            //0으로 나눌 수 없지만 에러를 리턴하지 않아서 나중에 더 큰 문제를 일으킬 수 있다
            System.out.println("0으로 나눌 수 없어요.");
            System.out.println(ex.toString());

        }
        return value;
    }

    /**
     * i를 k로 나눈 나머지를 반환한다.
     * @param i
     * @param k
     * @return
     * @throws ArithmeticException
     */
    public int divide1(int i, int k) throws ArithmeticException{
        int value = 0;
        value = i / k;

        return value;
    }
}
