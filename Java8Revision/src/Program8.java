import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program8 {
    public static void main(String[] args) {
        String str= "I saw an animal";

        Character ch =
       str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
               .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
               .entrySet().stream().filter(entry->entry.getValue()>1L).findFirst()
               .map(s->s.getKey()).get();
        System.out.println(ch);

    }
}
