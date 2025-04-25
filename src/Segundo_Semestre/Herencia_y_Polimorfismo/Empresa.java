package Segundo_Semestre.Herencia_y_Polimorfismo;
import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void mostrarSalarios() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.nombreCompleto() + ": $" + empleado.obtenerSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        int max = -1;
        Empleado elMayor = null;
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoComision) {
                EmpleadoComision empleado_comision = (EmpleadoComision) e;
                int cant = empleado_comision.getClientesCaptados();
                if (cant > max) {
                    max = cant;
                    elMayor = empleado_comision;
                }
            }
        }
        return elMayor;
    }

}
