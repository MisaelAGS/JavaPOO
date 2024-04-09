package exercicioDois;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[]args){

        // Entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: " );
        employee.tax = sc.nextDouble();

        //Saída de dados
        System.out.printf("Employee: %s%n", employee);
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.printf("Updated data: %s%n", employee);

        sc.close();
    }
}
