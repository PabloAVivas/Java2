package Segundo_Semestre.Programacion_Estructurada.Ej11;

import java.util.Scanner;

public class DescuentoMas {
    public static double descuento = 0.10;

    public static double calcularDescuentoEspecial(double precio){
        double descu;
        descu = precio * descuento;
        return descu;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double des;
        double fin;
        System.out.print("Ingrese el precio del producto: ");
        double num = scanner.nextInt();

        des = calcularDescuentoEspecial(num);
        fin = num - des;
        System.out.println("El descuento es de: " + des);
        System.out.println("El precio final es de: " + fin);

        scanner.close();
    }
}