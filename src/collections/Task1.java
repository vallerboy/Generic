package collections;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("krowa", "krowa", "słoń", "jacek", "krowa");
        Map<String, Integer> count = new HashMap<>();


        for (String word : words) {
            if(count.containsKey(word)){
                count.put(word, count.get(word) + 1);
            }else{
                count.put(word, 1);
            }
        };

        //wyswietlanie
        for (Map.Entry<String, Integer> stringIntegerEntry : count.entrySet()) {
            System.out.println(stringIntegerEntry.toString());
        }
    }
}
