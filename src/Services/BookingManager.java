package Services;

import Models.Customer;
import Models.Room;

public class BookingManager {
    private Customer cliente;
    private Room habitacion;

    //Constructor

    public BookingManager(Customer cliente, Room habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;

    }

    public Customer getCliente() {
        return cliente;
    }

    public Room getHabitacion() {
        return habitacion;
    }

    public double getPrecio() {
        return habitacion.getPrecioNoche();
    }

    @Override
    public String toString() {
        return "Reserva realizada:\n" +
                "Cliente: " + cliente.getName() + "\n" +
                "Teléfono: " + cliente.getPhone() + "\n" +
                "Habitación: " + habitacion.getDescripcion() + " " + habitacion.getNumeroHabitacion() + " " + habitacion.getTipo() + "\n"+
                "Precio: " + getPrecio() + "€ por noche";
    }
}
