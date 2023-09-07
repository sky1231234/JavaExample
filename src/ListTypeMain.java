import java.util.ArrayList;
import java.util.List;

public class ListTypeMain {

    public static void main(String[] args) {
        List<ReferenceType> referenceTypes = new ArrayList<>();
        referenceTypes.add(new ReferenceType(new Age(1)));

        ListType listType = new ListType(referenceTypes);

        for (ReferenceType list : listType.getList()
             ) {
            System.out.println(list.getAge().getValue());
        }
        System.out.println("-------------------");

        referenceTypes.add(new ReferenceType(new Age(2)));
        for (ReferenceType list : listType.getList()
        ) {
            System.out.println(list.getAge().getValue());
        }
    }
}

