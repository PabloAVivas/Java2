package Segundo_Semestre.Interfaces_Excepciones.Manejo_Error;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero;
        try {
            System.out.println("Ingrese un caracter numerico para convertirlo en numero");
            numero = sc.nextLine();
            int num = Integer.parseInt(numero);
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("3RR0R: se ingreso algo que no se puede convertir en numero");
        }finally {
            sc.close();
        }
    }
}
