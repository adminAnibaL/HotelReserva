package Models;

public class Customer {

    private static int contadorID = 1;
    private int ID;
    private String name;
    private int phone;
    //Como es un ejemplo básico lo que se desea es que cada vez que se cree un usuario → Su número de ID sea único.
    // y se incremente para saber cuantos clientes hay.



// Constructor
    public Customer(String name, int phone) {
        this.ID = contadorID++;
        this.name = name;
        this.phone = phone;
    }

 // get-set


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
