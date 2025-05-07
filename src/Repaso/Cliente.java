package Repaso;



public class Cliente {
    private String id;
    private String direccion;
    private String telefono;
    private String correo_electronico;


    public Cliente(String id, String direccion, String telefono, String correo_electronico) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        System.out.println("Se ha creado el cliente");
    }


}
