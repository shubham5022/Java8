import java.util.LinkedHashMap;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countEachCharater {

    public static void main(String[] args) {


        String str = "ABCD";
        String str2 = "DCBA";
        int num = 371;
        countCharacter(str);
        uniqueCharacter (str);
        noOfCharacter(str);
        removeAllspaces(str);
        armstrongNumber(num);
        anagram(str,str2);
        countOccurrences(str);
    }

    private static void countOccurrences(String str) {
        Map<Character,Long> occurance=
        str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s))).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(occurance);
    }
    private static void anagram(String str,String str2) {
        if(str.length()==str2.length()){

            boolean result = true;

            char[] ch11= str.toCharArray();
            char[] ch22 = str2.toCharArray();

            ArrayList<Character> ch1 = new ArrayList<>();
            ArrayList<Character> ch2 = new ArrayList<>();

            for (char c : ch11){
                ch1.add(c);
            }

            for (char c : ch22){
                ch2.add(c);
            }

            for (char c : ch1){
                if (!ch2.contains(c)){
                    result =false;
                }
            }

            if (result){
                System.out.println("Anagram");
            }else {
                System.out.println("Not anagram!!");
            }
            }
        }



    private static void armstrongNumber(int num) {
        //34567
        int number = num;
        double digit=0;
        double sum=0;
        while (number!=0){
        digit = number%10;
        sum = sum + Math.pow(digit,3);
        number/=10;
    }
        System.out.println("Sum:"+sum);
        if(sum == num){
            System.out.println("Armstrong!!");
        }else
            System.out.println("Not armstrong!!");
    }

    private static void removeAllspaces(String s) {
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch != ' ')
                System.out.print(ch);
        }
    }

    private static void noOfCharacter(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }

    private static void uniqueCharacter(String str) {
        List<Object> list = str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s))).collect(Collectors.toList());
        System.out.println(list);
        Set <Object> set = new HashSet<>(list);
        System.out.println(set);
        if (set.size()==list.size()){
            System.out.println("Unique character present!");
        }else{
            System.out.println("No unique");
        }
    }

    private static void countCharacter(String str) {
        HashMap<Character,Integer> countCh = new LinkedHashMap<>();
        for (int i =0;i<str.length();i++){
           Character ch = str.charAt(i);

           if (countCh.containsKey(ch)){
               countCh.put(ch, countCh.get(ch)+1);
           }
           else{
               countCh.put(ch,1);
           }

        }

        System.out.println(countCh);

        for (Map.Entry<Character,Integer> entry:countCh.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }

    }
}