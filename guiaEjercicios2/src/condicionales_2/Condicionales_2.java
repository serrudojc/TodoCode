/*
Una mercería vende canutillos y mostacillas al por mayor mediante su página
web. Como se trata de una mercería mayorista, solicita la cantidad de paquetes
en cada venta y dependiendo de esta realiza los siguientes controles:
a) Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando
que no se permiten compras inferiores a 5 productos.
b) Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15:
Se debe emitir un mensaje que el costo de envío es de $200.
c) Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe
emitir un mensaje de que el envío es gratuito.
Realizar el algoritmo necesario para llevar a cabo los 3 controles citados.
 */
package condicionales_2;

import java.util.Scanner;


public class Condicionales_2 {
    public static void main(String[] args) {
        int pedido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresar cantidad pedida: ");
        pedido = entrada.nextInt();
        
        if(pedido < 5){
            System.out.println("No se permiten compras inferiores a 5 productos");
        }
        else if (pedido <=15){
            System.out.println("Costo de envio $200");
        }
        else{
            System.out.println("El envio es gratuito");
        }
    }
}
