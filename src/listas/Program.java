package listas;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Anna");
        list.add(2,"Marco");

        System.out.println(list.size());

        list.remove("Anna");
        list.removeIf(x -> x.charAt(0) == 'M');


        for (String x : list){
            System.out.println(x);
        }
    }
}
