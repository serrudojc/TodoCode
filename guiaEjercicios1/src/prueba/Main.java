
package prueba;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese una palabra");
            String nombre = teclado.nextLine();
           
           while(!nombre.equalsIgnoreCase("salir")){
               System.out.println("Ingrese una palabra");
               nombre=teclado.nextLine();
           }
    }
}
