package Segundo_Semestre.Programacion_Estructurada.Ej12;

import java.util.Scanner;

public class Precios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.printf("Precio: $%.2f%n", precio);
        }
        System.out.println("Que precio desea modificar? Elija del 1 al 5: ");
        int num= scanner.nextInt() - 1;

        if (num >= 0 && num < precios.length) {
            System.out.print("Ingresa el nuevo precio para el producto " + (num + 1) + ": ");
            double nuevoPrecio = scanner.nextDouble();
            precios[num] = nuevoPrecio;

            System.out.println("Precios modificados:");
            for (double precio : precios) {
                System.out.printf("Precio: $%.2f%n", precio);
            }
        } else {
            System.out.println("Número de producto no válido.");
        }

        scanner.close();
    }
}
