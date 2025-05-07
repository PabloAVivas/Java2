package Segundo_Semestre.Herencia_y_Polimorfismo;

public class principal {
    public static void main(String[] args) {
        Empresa emp = new Empresa();

        emp.agregarEmpleado(new EmpleadoFijo(30155378, "Pablo", "Vivas", 2021, 45000));
        emp.agregarEmpleado(new EmpleadoFijo(30385917, "Sebastian", "Diaz", 2019, 50000));
        emp.agregarEmpleado(new EmpleadoFijo(30037835, "Tobias", "Rivas", 2014, 100000));
        emp.agregarEmpleado(new EmpleadoComision(30105856, "Manuel", "Diaz", 2017, 1000, 20000, 50));
        emp.agregarEmpleado(new EmpleadoComision(30267754, "Jeremias", "Montiel", 2021, 1000, 25000, 75));
        emp.agregarEmpleado(new EmpleadoComision(30105512, "Mateo", "Morgui", 2024, 1000, 70000, 30));


        emp.mostrarSalarios();

        System.out.println("El Empleado del mes es: " + emp.empleadoConMasClientes().nombreCompleto());
    }
}
