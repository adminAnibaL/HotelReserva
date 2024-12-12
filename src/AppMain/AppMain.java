package AppMain;
import Models.Customer;
import Services.BookingManager;
import Models.Room;
import Services.CustomerManager;
import Services.RoomManager;



import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();
        RoomManager roomManager = new RoomManager();



        System.out.println("Bienvenido a Reservas");

        //Bucle
        while (true) {

            System.out.println("¿Como te llamas?");
            String nombre = sc.nextLine();

            System.out.println("Dame un teléfono! ");
            int phone = sc.nextInt();
            sc.nextLine();

            Customer customer = new Customer(nombre, phone);
            customerManager.agregandoCliente(customer);
// Mostrar habitaciones y permitir selección
            roomManager.mostrarRoom();
            System.out.println("Selecciona el número de la habitación que deseas reservar:");
            int seleccion = sc.nextInt();
            sc.nextLine();

            Room habitacionSeleccionada = roomManager.seleccionarHabitacion(seleccion);
            if (habitacionSeleccionada != null) {
                BookingManager bookingManager = new BookingManager(customer, habitacionSeleccionada);
                System.out.println(bookingManager.toString());
            } else {
                System.out.println("La habitación seleccionada no está disponible.");
            }

            System.out.println("¿Quieres hacer otra reserva? (sí/no)");
            String otraReserva = sc.nextLine();
            if (!otraReserva.equalsIgnoreCase("sí")) {
                break;
            }
        }

    }

}

