/*
Realizar un programa que muestre en pantalla palabras que sean ingresadas
por teclado hasta que se ingrese a palabra "salir"
*/
package ejercicio5pdf;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flag = "";
        
        while(!flag.equals("salir")){
            System.out.println(flag);
            System.out.print("Ingresar palabra: ");
            flag = scan.next();
            System.out.println(flag);
        }             
    }
}
