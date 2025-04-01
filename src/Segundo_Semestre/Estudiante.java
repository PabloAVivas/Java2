public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private Double calificacion;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String curso, Double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInfo(){
        System.out.println("Apellidos del estuiante: "+ apellido + "\n Nombre del estudiante: " + nombre + "\n Curso: " + curso + "\n Calificacion: "+ calificacion);
    }

    public void subirCalificacion(double puntos){
        if(puntos>=0){
            if(calificacion+puntos <= 10){
              calificacion += puntos;
            }else{
             calificacion = 10.0;
            }
        }else{
            System.out.println("No puede ingresar numeros negativos");
        }
    }

    public void bajarCalificacion(double puntos){
        if (puntos >= 0){
            if(calificacion-puntos >= 0){
                calificacion -= puntos;
            } else{
                calificacion = 0.0;
            }
        }else{
            System.out.println("No puede ingresar numeros negativos");
        }
    }

}
