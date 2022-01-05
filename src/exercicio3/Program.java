package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Aluno aluno = new Aluno();

        System.out.print("Enter name of student: ");
        aluno.nome = sc.nextLine();

        System.out.println("insert the three notes");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno.notaFinal());

        String result = (aluno.notaFinal()>=60.0) ? "PASS" : "REPROVED";
        System.out.println(result);


    }
}
