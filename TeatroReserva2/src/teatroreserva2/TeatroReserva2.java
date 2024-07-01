package teatroreserva2;
import java.util.ArrayList;
import java.util.List;
import teatroreserva2.logica.Cliente;
import java.util.Date;
import java.util.Scanner;
import teatroreserva2.logica.Ticket;
/**
 *
 * @author angelina
 */
public class TeatroReserva2 {

    public static void main(String[] args) {
        
        //creo estructura de datos
        List<Ticket> listaTickets = new ArrayList<>();
        
        //creo tickets
        Ticket ticket1 = new Ticket(12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket(10, 8, 5, 1500, new Date(), new Date());
        Ticket ticket3 = new Ticket();
        //Creo ticket mediante constructor vacío y aplico encapsulamiento
        ticket3.setNumero(20);
        ticket3.setFila(4);
        ticket3.setAsiento(3);
        ticket3.setPrecio(2300);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());
        
        //agrego elementos a la lista
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);
        
        //suma de precios
        double suma = 0;
        for(Ticket tick : listaTickets){
            suma = suma + tick.getPrecio();
        }
        System.out.println("La suma de precios es: "+suma);
        
        // pedir fila al usuario
        Scanner sc = new Scanner (System.in);
        boolean bandera = false;
        System.out.println("ingrese la fila de la que desea ver tickets: ");
        int fila = sc.nextInt();
        
        for(Ticket tick : listaTickets){
            if(tick.getFila()==fila){
                System.out.println(tick.toString());
                bandera = true;
            }
        }
        
        if(bandera!=true){
            System.out.println("No se encontraron datos de la fila en cuestion. ");
        }
        
        
        //prueba de cliente
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNombre("Angi");
        cliente.setApellido("Mora");
        cliente.setDni("237470");
        cliente.getListaTickets().add(ticket1);
        
        Ticket ticket4 = new Ticket(12, 4, 6, 200, new Date(2024-06-26), new Date());
        cliente.getListaTickets().add(ticket4);
        
    }
    
}
