package Segundo_Semestre.Interfaces_Excepciones.Manejo_Error;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            File archivo = new File("archivo.txt");
            scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("3RR0R: Archivo no encontrado");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
