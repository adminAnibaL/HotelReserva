package Services;

import Models.Customer;
import java.util.ArrayList;

public class CustomerManager {


    private ArrayList<Customer> clientesNuevos;

    //Creando constructor
    public CustomerManager() {
        clientesNuevos = new ArrayList<>();
    }

    public void agregandoCliente(Customer customer){
        clientesNuevos.add(customer);
    }
}
