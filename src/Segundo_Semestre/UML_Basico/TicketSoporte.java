package Segundo_Semestre.UML_Basico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private static int idContar;
    private Usuario datos;
    private Tecnico data;
    private static List<TicketSoporte> ticketSoporte = new ArrayList<>();

    public TicketSoporte(String descripcion, Usuario datos, Tecnico data, LocalDate fechaCreacion){
        idContar++;
        this.id = idContar;
        this.descripcion = descripcion;
        this.datos = datos;
        this.data = data;
        this.estado = "Abierto";
        this.fechaCreacion = fechaCreacion;
        ticketSoporte.add(this);
    }


    public TicketSoporte(String descripcion) {
        idContar++;
        this.id = idContar;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        ticketSoporte.add(this);
    }
    public void procesoTicket(){
        this.estado= "En proceso";
    }
    public void cerrarTicket(){
        this.estado= "Cerrado";
    }

    public static TicketSoporte obtenerTicketPorId(int id) {
        for (TicketSoporte ticket : ticketSoporte) {
            if (ticket.id == id) {
                return ticket;
            }
        }
        return null; // Retorna null si no se encuentra el ticket
    }

    public static void mostrarTickets() {
        System.out.println("Lista de Tickets:");
        for (TicketSoporte ticket : ticketSoporte) {
            System.out.println(ticket);
        }
    }

    public String toString(){
        return "--------Ticket--------\n" + "id= " + id + "\nUsuario: " + datos + "\nTecnico: "+ data + "\ndescripcion= " + descripcion + "\nestado= " + estado  + "\nfecha: " + fechaCreacion + "\n________________";
    }
}
