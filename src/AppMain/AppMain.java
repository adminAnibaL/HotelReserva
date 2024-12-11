package AppMain;

import Models.Room;
import Services.Services;

public class AppMain {
    public static void main(String[] args) {

        //***********************************
        //PASO NUMERO 2 CREAMOS LA INSTANCIA
        //***********************************


        Room roomJuniorSuite = new Room(192, "doble", true, 280.00, true);
        Room roomPareja = new Room(168, "doble", true, 90.00, true);
        Room roomCallejeroViajero = new Room(255, "Individual", true, 30.00, false);

        //***********************************
        //PASO NUMERO 3 CREAMOS EL OBJETO SERVICES Y LE PASAMOS LOS OBJETOS [ROOM]
        //***********************************

        Services services = new Services();

        //***********************************
        //PASO NUMERO 5 UTILIZAMOS TRABAJAMOS [mostrarInfo]
        //***********************************

        services.mostrarInfo(roomJuniorSuite);


    }
}
