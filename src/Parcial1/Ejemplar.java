package Parcial1;
//{}
public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;
    private Publicacion publicacion;

    public Ejemplar(String codigo, EstadoEjemplar estado, Publicacion publicacion) {
        this.codigo = codigo;
        this.estado = estado;
        this.publicacion = publicacion;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public boolean estaDisponible(Ejemplar ejemplar){
        if (ejemplar.getEstado() == EstadoEjemplar.DISPONIBLE){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigo='" + codigo + '\'' +
                ", estado=" + estado +
                ", publicacion=" + publicacion +
                '}';
    }
}

