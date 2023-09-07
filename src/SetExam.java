import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {
//      set은 순서 보장 x
        Set<String> set = new HashSet<>();
//        set.add("hello");
//        set.add("hi");
//        set.add("hong");
//        set.add("hong");

        boolean flag1 =  set.add("hello");
        boolean flag2 = set.add("hi");
        boolean flag3 = set.add("hong");
        boolean flag4 =set.add("hong");

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);

        }


    }

}
