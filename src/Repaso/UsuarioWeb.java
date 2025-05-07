package Repaso;

import java.util.ArrayList;

public class UsuarioWeb {
    private String id_inicio_sesion;
    private String contrasenia;
    private EstadoDeUsuario estado;

    public UsuarioWeb(String id_inicio_sesion, String contrasenia, EstadoDeUsuario estado) {
        this.id_inicio_sesion = id_inicio_sesion;
        this.contrasenia = contrasenia;
        this.estado = estado;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getId_inicio_sesion() {
        return id_inicio_sesion;
    }

}
