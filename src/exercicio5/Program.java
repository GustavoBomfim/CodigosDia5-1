package exercicio5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)?");
            sc.nextLine();
            char option = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();


            if(option == 'i'){
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                list.add(new ImportedProduct(productName, price, fee));
            }
            else if (option == 'c'){
                list.add(new Product(productName, price));
            }
            else{
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(productName, price, date));
            }

        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : list){
            System.out.println(product.priceTag());
        }
    }
}
