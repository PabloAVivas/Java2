package Segundo_Semestre.Programacion_Estructurada.Ej3;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad para saber en que etapa de su vida se encuentra: ");
        int num = scanner.nextInt();

        if (num < 0 ) {
                System.out.println("No puede ingresar una edad menor a 0");
        } else if (num < 12){
                System.out.println("Es un niño");
        } else if (num < 17){
            System.out.println("Es un adolescente");
        } else if (num < 59){
            System.out.println("Es un adulto");
        } else{
            System.out.println("Es un adulto mayor");
        }

        scanner.close();
    }
}
