package Segundo_Semestre.Programacion_Estructurada.Ej5;

import java.util.Scanner;

public class Suma_num_par {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        while(true){
            System.out.print("Ingrese un numero (0 para acabar este bucle): ");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("La suma de los numeros totales es: " + sum);
        scanner.close();
    }
}