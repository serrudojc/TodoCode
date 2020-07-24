/*
Llevar a cabo un programa que incluya un vector que almacene los siguientes
nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y
Ludmila. Realizar un recorrido del vector para cargar los datos y otro
recorrido para mostrar los mismos por pantalla.
 */
package vectores_a;

import java.util.Scanner;


public class Vectores_a {
    public static void main(String[] args) {
        String nombres[] = new String[8];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0; i<nombres.length; i++){
            System.out.print("Ingresar nombre ["+(i+1)+"]: ");
            nombres[i] = entrada.next();
        }
        for(int i=0; i<nombres.length; i++){
            System.out.print(nombres[i]+", ");
        }
        System.out.println("");
    }
}
