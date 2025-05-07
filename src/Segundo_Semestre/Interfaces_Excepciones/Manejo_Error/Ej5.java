package Segundo_Semestre.Interfaces_Excepciones.Manejo_Error;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej5 {
    public static void main(String[] args) {
        String nombreArchivo = "datos.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
