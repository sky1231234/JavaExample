public class Calculate {

    private int a;
    private int b;

    public Calculate(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int result(Operate operate){
        return operate.operate(a,b);
    }
}

//https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%9D%B5%EB%AA%85-%ED%81%B4%EB%9E%98%EC%8A%A4Anonymous-Class-%EC%82%AC%EC%9A%A9%EB%B2%95-%EB%A7%88%EC%8A%A4%ED%84%B0%ED%95%98%EA%B8%B0