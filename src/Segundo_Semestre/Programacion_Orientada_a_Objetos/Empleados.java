package Segundo_Semestre.Programacion_Orientada_a_Objetos;

public class Empleados {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    //Constructor
    public Empleados( String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleados(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 10000;
    }

    public void actualizarSalario(double aumento){
        this.salario = salario + salario * aumento;
    }

    public void actualizarSalario(int aumento){
        this.salario = salario + aumento;
    }

    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    //Override
    public String toString(){
        return "Empleado{" + "id= " + id + ", nombre= " + nombre + ", puesto= " + puesto + ", salario= " + salario + "}";
    }

}
