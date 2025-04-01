package Segundo_Semestre.Programacion_Estructurada.Ej9;

import java.util.Scanner;

public class Envio {

    public static double calcularCostoEnvio(double peso, String zona){
        double envio;
        if(zona.equalsIgnoreCase("N")){
            envio = 5 * peso;
            return envio;
        } else if(zona.equalsIgnoreCase("I")){
            envio = 10 * peso;
            return envio;
        } else{
            envio = 100 * peso;
            return envio;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double compra = precioProducto + costoEnvio;
        return compra;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double envio;
        double compra;

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el peso del paquete: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el tipo de envio, N para nacional o I para internacional: ");
        String zona = scanner.nextLine();

        envio = calcularCostoEnvio( peso, zona);
        compra = calcularTotalCompra( precio, envio);
        System.out.println("El costo de envío es: " + envio);
        System.out.println("El total es de: " + compra);

        scanner.close();
    }
}