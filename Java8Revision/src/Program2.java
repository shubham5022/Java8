import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,12,13,32,4,5,6,7);
        list.stream().map(x->x+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
