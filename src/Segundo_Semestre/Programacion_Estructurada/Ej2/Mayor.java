package Segundo_Semestre.Programacion_Estructurada.Ej2;

import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros para saber cual es el mayor ");
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();

        if (num1 < num2) {
            if (num2 < num3) {
                System.out.println("El numero " + num3 + "es el mayor");
            } else {
                System.out.println("El numero " + num2 + "es el mayor");
            }
        } else {
            if (num1 > num3) {
                System.out.println("El numero " + num1 + "es el mayor");
            } else {
                System.out.println("El numero " + num3 + "es el mayor");
            }
        }

        scanner.close();
    }
}
