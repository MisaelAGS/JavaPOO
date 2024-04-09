package exercicioUm;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[]args){

        //Entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        //Saída de dados
        System.out.println(rectangle);

        sc.close();
    }
}
