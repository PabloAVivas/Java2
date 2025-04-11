package Segundo_Semestre.UML_Basico;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemaSoporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Tecnico tec1 = new Tecnico("Santiago", "Telefonos");
        Tecnico tec2 = new Tecnico("Agustin", "Webs");
        Tecnico tec3 = new Tecnico("Nicolas", "Computadoras");
        Tecnico tec4 = new Tecnico("Maria", "Versatil");

        TicketSoporte recla1 = new TicketSoporte("Me robaron");
        TicketSoporte recla2 = new TicketSoporte("Me Hackearon");
        TicketSoporte recla3 = new TicketSoporte("Necesito ayuda");
        TicketSoporte recla4 = new TicketSoporte("No puedo entrar a mi cuenta");

        System.out.println("Bienvenido al Sistema de soporte");

        int crearT;
        int idTec;
        int li;
        int mod;
        int idTick;
        int cerra;
        String nom;
        String email;
        String prob;
        String fechaTexto;
        String sig;
        do {

            System.out.println("Quiere crear un ticket? 1=si 2=no ");
            crearT = scanner.nextInt();

            if (crearT == 1) {
                System.out.println("Cual es su nombre?");
                scanner.nextLine();
                nom = scanner.nextLine();

                System.out.println("Cual es su email?");
                email = scanner.nextLine();

                System.out.println("Cual es su problema?");
                prob = scanner.nextLine();

                System.out.println("Seleccione al tecnico por el numero de id para asignarlo:");
                Tecnico.mostrarTecnicos();
                idTec = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ingresá una fecha (dd/MM/yyyy): ");
                fechaTexto = scanner.nextLine();

                LocalDate fecha = LocalDate.parse(fechaTexto, formato);
                System.out.println("La fecha que ingresaste es: " + fecha);

                Tecnico tec = Tecnico.obtenerTecnicoPorId(idTec);

                Usuario usu = new Usuario(nom, email);

                TicketSoporte reclaNue = new TicketSoporte(prob, usu, tec, fecha);

                System.out.println("Su ticket se ha creado:");
                System.out.println(reclaNue);
            }

            System.out.println("¿Quieres listar todos los tickets? 1=si 2=no");
            li = scanner.nextInt();
            scanner.nextLine();
            if (li == 1) {
                TicketSoporte.mostrarTickets();
                System.out.println("Desea modificar algun ticket? 1=si 2=no");
                mod = scanner.nextInt();
                if (mod==1){
                    System.out.println("Coloque el numero de id del ticket que desea modificar");
                    idTick = scanner.nextInt();
                    scanner.nextLine();
                    TicketSoporte recla = TicketSoporte.obtenerTicketPorId(idTick);
                    recla.procesoTicket();
                    System.out.println("Ticket modificado con exito: ");
                    System.out.println(recla);
                    System.out.println("Desea cerrar este ticket? 1=si 0=no");
                    cerra = scanner.nextInt();
                    scanner.nextLine();
                    if (cerra == 1){
                        recla.cerrarTicket();
                        System.out.println("Ticket cerrado con exito: ");
                        System.out.println(recla);
                    }
                }
            }

            System.out.println("Quiere continuar con el programa?\n Precione 0 para salir o cualquier cosa para continuar");
            sig = scanner.nextLine();
        }while (!sig.equals("0"));
        scanner.close();
    }
}
