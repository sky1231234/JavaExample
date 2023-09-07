//T라는 아직 정해지지 않은 박스를 사용하겠다
public class GenericBox<T> {

    private T t;
    public void add(T t){
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }
}
