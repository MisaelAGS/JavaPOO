package exercicioTres;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[]args){

        //Entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.name = sc.nextLine();
        student.firstGrade = sc.nextDouble();
        student.secondGrade = sc.nextDouble();
        student.thirdGrade = sc.nextDouble();

        //Saída de dados
        System.out.println(student);

        sc.close();
    }
}
