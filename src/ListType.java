import java.util.ArrayList;
import java.util.List;

public class ListType {

    private final List<Age> list;

    public ListType(final List<Age> list){
        this.list = new ArrayList<>(list);
    }
    public List<Age> getList() {
        return list;
    }
}
