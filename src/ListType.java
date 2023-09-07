import java.util.ArrayList;
import java.util.List;

public class ListType {

    private final List<ReferenceType> list;

    public ListType(final List<ReferenceType> list){
        this.list = new ArrayList<>(list) ;
    }
    public List<ReferenceType> getList() {
        return list;
    }
}
