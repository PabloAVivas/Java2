package Segundo_Semestre.UML_Basico;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    private static int idCon;

    public Usuario(String nombre, String email){
        idCon++;
        this.id = idCon;
        this.nombre = nombre;
        this.email = email;
    }

    public String toString(){
        return "Informacion=" + " id= " + id + ", nombre= " + nombre + ", email= " + email;
    }
}
