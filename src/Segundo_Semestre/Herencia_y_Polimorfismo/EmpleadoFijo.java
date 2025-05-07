package Segundo_Semestre.Herencia_y_Polimorfismo;

public class EmpleadoFijo extends Empleado{
    private double sueldoFijo;
    private static double antiguedad1 = 0.05;
    private static double antiguedad2 = 0.10;

    public EmpleadoFijo(int DNI, String nombre, String apellido, int anioIngreso, double sueldoFijo) {
        super(DNI, nombre, apellido, anioIngreso);
        this.sueldoFijo = sueldoFijo;
    }

    private double antiguedad(){
        int anios = antiguedadEnAnios();
        if(anios >= 2){
          return antiguedad1;
        }else if(anios > 5) {
            return antiguedad2;
        }else return 0;
    }

    @Override
    public double obtenerSalario(){
        return sueldoFijo + sueldoFijo * antiguedad();
    }
}
