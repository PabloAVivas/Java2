package Segundo_Semestre.Programacion_Estructurada.Ej7;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Ingrese una nota de 0-10: ");
            num = scanner.nextInt();
        } while((num <0) || (num>10));
        System.out.println("La nota fue guardada con exito");
        scanner.close();
    }
}