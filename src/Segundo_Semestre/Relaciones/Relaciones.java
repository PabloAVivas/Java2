package Segundo_Semestre.Relaciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        // Crear la división de curso
        DivisionCurso divisionCurso = new DivisionCurso(1, 2023, 1);

        // Crear cátedras
        Catedra catedra1 = new Catedra(1, "Matemáticas");
        Catedra catedra2 = new Catedra(2, "Historia");

        // Agregar las cátedras a la división
        List<Catedra> catedras = new ArrayList<>();
        catedras.add(catedra1);
        catedras.add(catedra2);
        divisionCurso.setCatedras(catedras);

        // Crear alumnos y asignar notas
        Alumno alumno1 = new Alumno(1, "Pablo", "Vivas", new Date(2000, 1, 1));
        List<Nota> notasAlumno1 = new ArrayList<>();
        notasAlumno1.add(new Nota(1, 8.0, new Date(), false, catedra1, alumno1));
        notasAlumno1.add(new Nota(2, 9.0, new Date(), false, catedra1, alumno1));
        notasAlumno1.add(new Nota(3, 7.5, new Date(), false, catedra1, alumno1));
        notasAlumno1.add(new Nota(4, 8.5, new Date(), false, catedra1, alumno1));
        notasAlumno1.add(new Nota(5, 9.5, new Date(), false, catedra1, alumno1));
        notasAlumno1.add(new Nota(6, 10.0, new Date(), false, catedra1, alumno1));
        alumno1.setNotas(notasAlumno1);
        alumno1.setCatedra(catedra1);

        Alumno alumno2 = new Alumno(2, "Sebastian", "Diaz", new Date(2000, 2, 2));
        List<Nota> notasAlumno2 = new ArrayList<>();
        notasAlumno2.add(new Nota(1, 7.0, new Date(), false, catedra1, alumno2));
        notasAlumno2.add(new Nota(2, 8.0, new Date(), false, catedra1, alumno2));
        notasAlumno2.add(new Nota(3, 8.5, new Date(), false, catedra1, alumno2));
        notasAlumno2.add(new Nota(4, 9.0, new Date(), false, catedra1, alumno2));
        notasAlumno2.add(new Nota(5, 8.0, new Date(), false, catedra1, alumno2));
        notasAlumno2.add(new Nota(6, 9.0, new Date(), false, catedra1, alumno2));
        alumno2.setNotas(notasAlumno2);
        alumno2.setCatedra(catedra1);

        Alumno alumno3 = new Alumno(3, "Manuel", "Diaz", new Date(2000, 3, 3));
        List<Nota> notasAlumno3 = new ArrayList<>();
        notasAlumno3.add(new Nota(1, 8.0, new Date(), false, catedra2, alumno3));
        notasAlumno3.add(new Nota(2, 9.0, new Date(), false, catedra2, alumno3));
        notasAlumno3.add(new Nota(3, 10.0, new Date(), false, catedra2, alumno3));
        notasAlumno3.add(new Nota(4, 8.5, new Date(), false, catedra2, alumno3));
        notasAlumno3.add(new Nota(5, 9.5, new Date(), false, catedra2, alumno3));
        notasAlumno3.add(new Nota(6, 9.0, new Date(), false, catedra2, alumno3));
        alumno3.setNotas(notasAlumno3);
        alumno3.setCatedra(catedra2);

        // Agregar alumnos a las cátedras
        catedra1.getAlumnos().add(alumno1);
        catedra1.getAlumnos().add(alumno2);
        catedra2.getAlumnos().add(alumno3);

        Alumno mejorAlumno = divisionCurso.mejorAlumnoDivisionCurso(); // Ahora se llama desde la instancia
        if (mejorAlumno != null) {
            System.out.println("El mejor alumno de la división es: " + mejorAlumno.getNombre() + " " + mejorAlumno.getApellido());
        } else {
            System.out.println("No se encontró un mejor alumno.");
        }
    }
}
