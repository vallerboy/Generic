package collections;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        Person person = new Person("Ktos", "tam", 15);
        Person person1 = new Person("Ktos", "tam", 15);
        Person person2 = new Person("Ktos3", "tam", 20);
        Person person3 = new Person("Ktos4", "tam", 25);


        HashMap<String, Person> map = new HashMap<>();
        map.put("1232 zł", person);
        map.put("21213 zł", person1);
        map.put("2125 zł", person2);


        System.out.println(map.get("1232 zł"));

        //iteracja po kluczu
        for (String s : map.keySet()) {
            System.out.println(s);
        }


        //iteracja po samych wartosciach
        for (Person value : map.values()) {
            System.out.println(value);
        }

        //iteracja po tym i po tym (key i value)
        for (Map.Entry<String, Person> stringPersonEntry : map.entrySet()) {
            System.out.println(stringPersonEntry.getKey() + " : " + stringPersonEntry.getValue());
        }


    }

}
