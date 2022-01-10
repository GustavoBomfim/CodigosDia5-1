package exercicio1;

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

        System.out.print("Enter department's name: ");
        String setor = sc.nextLine();

        System.out.println("Enter work data: ");
        System.out.print("Name: ");
        String funcionarioNome = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        double salary = sc.nextDouble();

        Worker worker = new Worker(funcionarioNome, WorkerLevel.valueOf(level), salary, new Department(setor));
        System.out.println("How many contracts to this worker? ");
        int quantityContracts = sc.nextInt();

        Date x = new Date();

        for(int i = 1; i<=quantityContracts; i++){
            System.out.println("Enter contract " + i + " data");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.println("Value per hour: ");
            double salaryHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, salaryHour, hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

    }
}
