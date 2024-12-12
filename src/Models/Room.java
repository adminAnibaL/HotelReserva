package Models;

public class Room {

    private String descripcion;
    private int numeroHabitacion;
    private String tipo;
    private boolean disponible;
    private double precioNoche;
    private boolean vistasMar;

    //Contructor Predeterminado

    public Room(String descripcion, int numeroHabitacion, String tipo, boolean disponible, double precioNoche, boolean vistasMar) {
        this.descripcion=descripcion;
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.disponible = disponible;
        this.precioNoche = precioNoche;
        this.vistasMar = vistasMar;
    }


    //******************** SET & GET *********************************

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isVistasMar() {
        return vistasMar;
    }

    public void setVistasMar(boolean vistasMar) {
        this.vistasMar = vistasMar;
    }


    //******************** SET & GET *********************************
    //**************************************************************** FIN


}


/*La creacion del metodo toSting() sirve para facilitar la vizualizacion del objeto en concreto
es de importancia CUANDO necesitamos la vizualizacion de la informacion total del objeto
* */