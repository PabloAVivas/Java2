package Segundo_Semestre.Programacion_Estructurada.Ej1;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año para saber si es bisiesto o no: ");
        int num = scanner.nextInt();

        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
            System.out.println("El año " + num + " es bisiesto.");
        } else {
            System.out.println("El año " + num + " no es bisiesto.");
        }

        scanner.close();
    }
}
