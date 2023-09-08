public class CalculateMain {

    public static void main(String[] args) {
    int a = 30;
    int b = 20;

    Calculate calculate = new Calculate(a,b);

    int sum = calculate.result(new Operate() {
        @Override
        public int operate(int a, int b) {
            return a+b;
        }
    });
    System.out.println(sum);


    int minus = calculate.result(new Operate() {
        @Override
        public int operate(int a, int b) {
            return a-b;
        }
    });
        System.out.println(minus);

    }
}
