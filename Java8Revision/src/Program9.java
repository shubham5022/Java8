import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,55,21,6,12,66);
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

    }
}
