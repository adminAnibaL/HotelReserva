package Services;

import Models.Room;

import java.sql.SQLOutput;

public class Services {

    //***********************************
    //PASO NUMERO 4 CREAMOS EL OBJETO SERVICES Y LE PASAMOS LOS OBJETOS [ROOM]
    //***********************************

    public void mostrarInfo(Room room){

        System.out.println("********* Información ********** ");
        System.out.println("La habitación " + room.getNumeroHabitacion());
        System.out.println("Es tipo " + room.getTipo());
        System.out.println("Disponibilidad " + (room.isDisponible() ? "SI" : "NO"));
        System.out.println("Su precio por noche " + String.format("%.2f €",room.getPrecioNoche()));
        System.out.println("Tiene vistas al mar [" + (room.isVistasMar() ?  "SI" : "NO")+ "]");


    }
}
