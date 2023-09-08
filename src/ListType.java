import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListType {

    private final List<Age> list;

    public ListType(final List<Age> list){
//그대로 참조하지 않고, 새로운 list 객체를 만들어 사용
        this.list = new ArrayList<>(list);
    }


    public List<Age> getList() {
//        값 변경 불가능하도록 unmodifiableList() 메소드 사용
        return Collections.unmodifiableList(list);
    }
}
