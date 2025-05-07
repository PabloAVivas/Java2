package Segundo_Semestre.PracticaPrimerParcial.Compras_Online;

public class UsuarioWeb {
    private String idInicioSesion;
    private String contrasena;
    private EstadoDeUsuario estado;

    public UsuarioWeb(String idInicioSesion, String contrasena) {
        this.idInicioSesion = idInicioSesion;
        this.contrasena = contrasena;
        this.estado = EstadoDeUsuario.NUEVO;
    }

    public void activarUsuario() {
        this.estado = EstadoDeUsuario.ACTIVO;
    }
}

