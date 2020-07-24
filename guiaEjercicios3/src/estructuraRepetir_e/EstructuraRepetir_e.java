/*
Un gerente de una empresa prestadora de servicios de internet necesita un
algoritmo que permita realizar el cálculo del monto a pagar de la factura
de consumo de internet de 5 clientes de una empresa. Para ello, el algoritmo
debe solicitar por teclado dos datos: Dni del cliente y tipo de servicio.
Los tipos de servicio son 3:
    1. Internet 30 megas (cuyo valor es de $750 – 10% de descuento)
    2. Internet 50 megas (Cuyo valor es de $930 – 5% de descuento)
    3. Internet 100 megas (Cuyo valor fijo es de $1200)
El algoritmo debe poder calcular el monto a pagar (dependiendo del tipo de
servicio con el que cuente el cliente) e informar por pantalla el dni del
mismo junto con el monto a pagar y el número de servicio con el que cuenta.
 */
package estructuraRepetir_e;

import java.util.Scanner;


public class EstructuraRepetir_e {
    public static void main(String[] args) {
        int dni, servicio;
        Scanner entrada = new Scanner(System.in);
        float abono;
        
        for(int i=0; i<5; i++){
            System.out.print("Ingresar DNI cliente: ");
            dni = entrada.nextInt();
            System.out.println("[1]Internet 30 megas");
            System.out.println("[2]Internet 50 megas");
            System.out.println("[3]Internet 100 megas");
            System.out.print("Ingresar tipo de servicio: ");
            servicio = entrada.nextInt();
            
            if(servicio == 1){
                abono = 750*(1-0.1f);
            }else if(servicio == 2){
                abono = 930*(1-0.05f);
            }else if(servicio == 3){
                abono = 1200;
            }else{
                abono = -1;
            }
            if(abono>0){
                System.out.println("----------------------");
                System.out.println("Cliente "+dni+" con tipo de servicio "+servicio+" debe abonar $"+abono+"\n");
            }else{
                System.out.println("No existe el servicio.\n");
            }       
        }
    }
}
