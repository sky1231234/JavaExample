public class ObjectBox<T> {

    private T object;

    //object만 들어올 수 있는게 아니라 object의 후손들 모두 들어올 수 있다
    public void add(T obj){
        this.object = obj;
    }

    public T get() {
        return this.object;
    }

    public void set(T obj) {
        this.object = obj;
    }
}
