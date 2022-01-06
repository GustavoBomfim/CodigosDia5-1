package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        double depositoInicial;


        System.out.println("Enter account number: ");
        int numeroConta = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.println("Is there na initial deposit value: ");
        char opcao = sc.next().charAt(0);

        if(opcao == 's'){
            System.out.println("Enter initial deposit value: ");
            depositoInicial = sc.nextDouble();
            conta = new Conta(numeroConta, nomeCliente, depositoInicial);
        }
        else {
            conta = new Conta(numeroConta, nomeCliente);
        }

        System.out.println("Account data: ");
        System.out.println(conta);

        System.out.println("Enter ad deposit value: ");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);

        System.out.println("Update account data: ");
        System.out.println(conta);


        System.out.println("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println("Update account data: ");
        System.out.println(conta);

    }
}
