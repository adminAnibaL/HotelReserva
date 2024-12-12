package Services;

import Models.Room;

import java.util.ArrayList;

public class RoomManager {

    private ArrayList<Room> tipoRoomHotel;

    public RoomManager() {

        tipoRoomHotel = new ArrayList<>();
        inicializarHabitaciones();
    }

    public void inicializarHabitaciones() {
        tipoRoomHotel.add(new Room("LoveEsposos", 201, "Doble", true, 280.00, true));
        tipoRoomHotel.add(new Room("LovePareja", 302, "Doble", true, 180.00, false));
        tipoRoomHotel.add(new Room("DeluxeSuite", 403, "Suite", true, 500.00, true));
        tipoRoomHotel.add(new Room("Standard", 504, "Individual", true, 150.00, false));
    }

    public void mostrarRoom() {

        for (int i = 0; i < tipoRoomHotel.size(); i++) {
            Room room = tipoRoomHotel.get(i);
            System.out.println((i + 1) + "." + room.getDescripcion() + "- Disponible " + room.isDisponible());
        }
    }

    public Room seleccionarHabitacion(int indice) {
        if (indice >= 1 && indice <= tipoRoomHotel.size()) {
            Room room = tipoRoomHotel.get(indice - 1);
            if (room.isDisponible()) {
                room.setDisponible(false);//→ Indicamos que la habitacion esta ocupada
                return room;
            }
        }
        return null;
    }
}


