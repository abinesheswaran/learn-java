import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_samples {

    public static void main(String agrs[]) {
        List list = List.of(1, 2, 3, 4, 5);
        list.stream().forEach(System.out::println);
        String[] str = { "1", "2", "3", "4" };
        ArrayList<String> str2 = new ArrayList<>();
        str2.add("1");
        str2.add("2");
        System.out.println(str);
        System.out.println(str2);
        Stream<Integer> stream = Stream.iterate(1,n->++n);
        stream.limit(5).forEach(System.out::println);
    }
}
