package exercicio10;


import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();


        System.out.println("How many students for course A? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n ; i++){
            int id = sc.nextInt();
            a.add(id);
        }
        System.out.println("How many students for course B?");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            int id = sc.nextInt();
            b.add(id);
        }
        System.out.println("How many studentes for coruse C? ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int id = sc.nextInt();
            c.add(id);
        }
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();

    }
}
