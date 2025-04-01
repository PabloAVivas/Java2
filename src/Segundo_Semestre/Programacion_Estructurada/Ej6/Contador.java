package Segundo_Semestre.Programacion_Estructurada.Ej6;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int nump = 0;
        int numn = 0;
        int cer = 0;
        for (int i = 1; i <= 10; i++){
            System.out.print("Ingrese un numero: ");
            num = scanner.nextInt();

            if (num < 0) {
                numn += 1;
            } else if (num > 0 ) {
                nump += 1;
            } else {
                cer += 1;
            }
        }
        System.out.println("Numeros positivos: " + nump);
        System.out.println("Numeros negativos: " + numn);
        System.out.println("Ceros: " + cer);
        scanner.close();
    }
}