public class ObjectBox {

    private Object object;

    //object만 들어올 수 있는게 아니라 object의 후손들 모두 들어올 수 있다
    public void add(Object obj){
        this.object = obj;
    }

    public Object get() {
        return this.object;
    }

    public void set(Object obj) {
        this.object = obj;
    }
}
