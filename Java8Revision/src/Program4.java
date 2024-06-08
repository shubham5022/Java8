import java.util.Arrays;
import java.util.List;

public class Program4 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,7);

        list.stream().findFirst().ifPresent(System.out::println);
    }
}
