package exercicio1;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.widht = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("AREA = " + rectangle.area());
        System.out.println("PERIMETER = " + rectangle.perimeter());
        System.out.println("DIAGONAL = " + rectangle.diagonal());

    }
}
