package Segundo_Semestre.Programacion_Estructurada.Ej10;

import java.util.Scanner;

public class Stock {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevo;
        nuevo = stockActual - cantidadVendida + cantidadRecibida;
        return nuevo;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nuevo;

        System.out.print("Ingrese el stock actual: ");
        int actual = scanner.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = scanner.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = scanner.nextInt();

        nuevo = actualizarStock(actual,vendida,recibida);
        System.out.println("El nuevo stock es: " + nuevo);

        scanner.close();
    }
}