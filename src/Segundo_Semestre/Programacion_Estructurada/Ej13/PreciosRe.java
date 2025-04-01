package Segundo_Semestre.Programacion_Estructurada.Ej13;

public class PreciosRe {
    static double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

    public static void main(String[] args) {
        System.out.println("Precios originales:");
        mostrarPreciosOriginales(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        mostrarPreciosModificados(precios, 0);
    }

    public static void mostrarPreciosOriginales(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.printf("Precio: $%.2f%n", precios[indice]);
            mostrarPreciosOriginales(precios, indice + 1);
        }
    }

    public static void mostrarPreciosModificados(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.printf("Precio: $%.2f%n", precios[indice]);
            mostrarPreciosModificados(precios, indice + 1);
        }
    }
}
