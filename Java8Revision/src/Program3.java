import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Program3 {

    public static void main(String[] args) {
        //duplicate elements in a given integers list
        List<Integer> list = Arrays.asList(11,11,122,122,3,4,5,5);
        HashSet<Integer>hset = new HashSet<>();
        list.stream().filter(s->!(hset.add(s))).forEach(System.out::println);
    }

}
