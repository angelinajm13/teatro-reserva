package teatroreserva;
import java.util.Scanner;
/**
 *
 * @author angelina
 */
public class TeatroReserva {

    public static void main(String[] args) {
        char asientos[][] = new char [10][10];
        boolean bandera = false;
        boolean band = false;
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        int asiento = 0;
        String respuesta;
        String respuesta2;
        
        //cargamos la matriz de asientos
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                asientos[i][j] = 'L';
            }
        }
        
        System.out.println("----------------BIENVENIDO AL SISTEMA DE RESERVAS----------------");
        
        //reserva de asientos
        while(bandera!=true){
            band = false;
            System.out.println("¿Desea ver los asientos disponibles? S: SI, cualquier tecla: NO");
            respuesta2 = sc.next();
            if(respuesta2.equalsIgnoreCase("S")){
                //llamar método
                dibujarMapa(asientos);
            }
            //reserva
            while(band!=true){
                System.out.println("Ingrese fila y asiento a reservar: ");
                System.out.print("Ingrese Fila (entre 0 y 9): ");
                fila = sc.nextInt();
                System.out.print("Ingrese Asiento (entre 0 y 9): ");
                asiento = sc.nextInt();
                if(fila<= 9 && fila >=0){
                    if(asiento<=9 && asiento>=0){
                        band = true;
                    }
                    else {
                    System.out.println("Numero de asiento no valido. ");
                }
                }
                else {
                    System.out.println("Numero de fila no valido. ");
                }
            }         
            if(asientos[fila][asiento]=='L'){
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente. ");                              
            }
            else {
                System.out.println("El asiento está ocupado. Por favor elija otro. ");
            }
            System.out.println("¿Desea finalizar la reserva? S: SI; cualquier tecla: NO");
            respuesta = sc.next();
            if(respuesta.equalsIgnoreCase("S")){
                bandera = true;
            }            
        }
    }
    static void dibujarMapa(char asientos[][]){
        for(int i=0; i<10; i++){
            System.out.print("Fila "+i+") ");
            for(int j=0; j<10; j++){
                System.out.print("["+asientos[i][j]+"] ");
            }
            System.out.println("");
        }
    }
}
