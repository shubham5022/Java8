import java.util.Arrays;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,6,8,9,10);
        //Print only even numbers

        list.stream().filter(x->x%2!=0).forEach(System.out::println);


    }
}
