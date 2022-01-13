package exercicio9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("****** Enter contract data *********");
        System.out.print("Number: ");
        int numberContract = sc.nextInt();

        System.out.println("Date (dd/MM/yyyy): ");
        Date dateContract = sdf.parse(sc.nextLine());

        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();

        Contrato contrato = new Contrato(numberContract, dateContract, contractValue);

        System.out.print("Enter number of installments: ");
        int parcela = sc.nextInt();
        Parcelas parcelas = new Parcelas(parcela);

        //ServicoDePagamento sp = new ServicoDePagamento(new Paypal());
        //sp.





        sc.close();
    }
}
