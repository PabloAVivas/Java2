package Segundo_Semestre.Relaciones;

import java.util.ArrayList;
import java.util.List;

public class Catedra {

    private int codigo;
    private String denominacion;
    private DivisionCurso divisionCurso;
    private List<Alumno> alumnos = new ArrayList<>();
    private List<Nota> notas = new ArrayList<>();

    public Catedra() {
    }

    public Catedra(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public DivisionCurso getDivisionCurso() {
        return divisionCurso;
    }

    public void setDivisionCurso(DivisionCurso divisionCurso) {
        this.divisionCurso = divisionCurso;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public Alumno mejorAlumnoCatedra(){
        Alumno mejorAlumno = null;
        double mejorPromedio = 0;

        for (Alumno alumno : alumnos) {
            double promedio = 0;
            int contadorNotas = 0;

            for (Nota nota : notas) {
                if (nota.getAlumno().equals(alumno)) {
                    promedio += nota.getValor();
                    contadorNotas++;
                }
            }

            if (contadorNotas > 0) {
                promedio /= contadorNotas;

                if (promedio > mejorPromedio) {
                    mejorPromedio = promedio;
                    mejorAlumno = alumno;
                }
            }
        }

        return mejorAlumno;
    }

}
