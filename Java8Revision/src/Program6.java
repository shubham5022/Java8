import java.util.Arrays;
import java.util.List;

public class Program6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,34,55,11,37);

        int max = list.stream().max(Integer::compare).get();

        System.out.println("Maximum::"+max);

    }
}
