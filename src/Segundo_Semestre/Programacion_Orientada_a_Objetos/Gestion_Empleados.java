package Segundo_Semestre.Programacion_Orientada_a_Objetos;

import java.util.Scanner;

public class Gestion_Empleados {
    public static void main(String[] args) {
        Empleados Em1 = new Empleados("Miguel", "Administrador", 100604);
        Empleados Em2 = new Empleados("Pedro", "Contador", 50987);
        Empleados Em3 = new Empleados("Marcos", "Repuesto");
        Empleados Em4 = new Empleados("Agustin", "Repuesto");

        System.out.println(Em1);
        System.out.println(Em2);
        System.out.println(Em3);
        System.out.println(Em4);

        System.out.println(" ");

        Em1.actualizarSalario(5000);
        Em2.actualizarSalario(0.4);
        Em3.actualizarSalario(-0.1);
        Em4.actualizarSalario(-500);

        System.out.println(Em1);
        System.out.println(Em2);
        System.out.println(Em3);
        System.out.println(Em4);

        System.out.println("Caantidad de empleados: " + Empleados.mostrarTotalEmpleados());
    }
}