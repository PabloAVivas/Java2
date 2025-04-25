package Segundo_Semestre.Herencia_y_Polimorfismo;

public class EmpleadoComision extends Empleado{
    private int clienteCap;
    private double sueldoMin;
    private double cobroP;

    public EmpleadoComision(int DNI, String nombre, String apellido, int anioIngreso, int clienteCap, double sueldoMin, double cobroP) {
        super(DNI, nombre, apellido, anioIngreso);
        this.clienteCap = clienteCap;
        this.sueldoMin = sueldoMin;
        this.cobroP = cobroP;
    }

    public double comparar(){
        double sueldoCo = clienteCap * cobroP;
        if( sueldoCo >sueldoMin){
            return sueldoCo;
        }else{
            return sueldoMin;
        }
    }

    public int getClientesCaptados() {
        return clienteCap;
    }


    @Override
    public double obtenerSalario(){
        return comparar();
    }
}
