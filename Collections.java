import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String args []){
        List list = new ArrayList();
        list.add(1);
        System.out.println(list);
        List list2 = new LinkedList();
        list2.add(1);
        list2.add(10);
        System.out.println(list2);
        list2.stream().map(el-> {
            System.out.println(el);
            return el;
        }).collect(Collectors.toSet());
        HashSet set = new HashSet();
        set.add(1);
        set.add(2);
        set.stream().map(e->{
            System.out.println(e);
            return e;
        }).collect(Collectors.toList());
        HashMap<String,Integer> map = new HashMap();
        map.put("a",1);
        map.entrySet().stream().map(e->{
            System.out.println(e.getKey()+" -> "+ e.getValue());
            return e;
        }).collect(Collectors.toList());
    }
}
