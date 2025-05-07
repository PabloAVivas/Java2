package Segundo_Semestre.Interfaces_Excepciones.Manejo_Error;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        double tot;
        try {
            System.out.println("Ingrese 2 numeros enteros para dividirlos:");
            num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo numero:");
            num2 = scanner.nextInt();
            tot = num1/num2;
            System.out.println(tot);
        } catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        } finally {
            scanner.close();
        }


    }
}
