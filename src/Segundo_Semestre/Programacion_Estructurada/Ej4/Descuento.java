package Segundo_Semestre.Programacion_Estructurada.Ej4;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 10;
        double b = 15;
        double c = 20;
        System.out.print("Ingrese el precio del producto: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese su categoria: ");
        String cat = scanner.nextLine();

        if (cat.equalsIgnoreCase("a")) {
            System.out.println("Descuento aplicado: " + a + "%");
            System.out.println("Precio final: " + (num - a/100 * num));
        } else if(cat.equalsIgnoreCase("b")){
            System.out.println("Descuento aplicado: " + b + "%");
            System.out.println("Precio final: " + (num - b/100 * num));
        } else if(cat.equalsIgnoreCase("c")){
            System.out.println("Descuento aplicado: " + c + "%");
            System.out.println("Precio final: " + (num - c/100 * num));
        } else {
            System.out.println("No hay descuento para esa categoria");
            System.out.println("Precio final: " + num);
        }

        scanner.close();
    }
}