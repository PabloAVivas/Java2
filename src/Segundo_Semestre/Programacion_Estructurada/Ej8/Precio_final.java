package Segundo_Semestre.Programacion_Estructurada.Ej8;

import java.util.Scanner;

public class Precio_final {
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){

        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio base: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto (numeros decimales, es decir, con (,) para evitar problemas ): ");
        double impuesto = scanner.nextDouble();

        System.out.print("Ingrese el descuento (numeros decimales, es decir, con (,) para evitar problemas ): ");
        double descuento = scanner.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final es: " + precioFinal);
        scanner.close();
    }
}