package Segundo_Semestre.UML_Basico;
import java.util.ArrayList;
import java.util.List;

public class Tecnico {

    private int id;
    private String nombre;
    private String especialidad;
    private static int idCon;
    private static List<Tecnico> tecnicos = new ArrayList<>();


    public Tecnico(String nombre, String especialidad){
        idCon++;
        id = idCon;
        this.nombre = nombre;
        this.especialidad = especialidad;

        tecnicos.add(this);
    }

    public static Tecnico obtenerTecnicoPorId(int id) {
        for (Tecnico tecnico : tecnicos) {
            if (tecnico.id == id) {
                return tecnico;
            }
        }
        return null;
    }

    public static void mostrarTecnicos() {
        System.out.println("Lista de Técnicos:");
        for (Tecnico tecnico : tecnicos) {
            System.out.println(tecnico);
        }
    }

    public String toString(){
        return "Informacion=" + " id= " + id + ", nombre= " + nombre + ", especialidad= " + especialidad;
    }
}
