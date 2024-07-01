package teatroreserva2.logica;
import java.util.List;

public class Cliente {
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private List<Ticket> listaTickets;

    public Cliente() {
       
    }
    
    public Cliente(int id, String dni, String nombre, String apellido, List<Ticket> listaTickets) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaTickets = listaTickets;
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Ticket> getListaTickets() {
        return listaTickets;
    }

    public void setListaTickets(List<Ticket> listaTickets) {
        this.listaTickets = listaTickets;
    }

    
     
    
}
