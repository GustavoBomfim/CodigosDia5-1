package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextInt();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + employee);

        sc.close();
    }
}
