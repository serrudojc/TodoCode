/*
Un comerciante realiza 5 ventas por día. Necesita de un algoritmo que le
permita ingresar por teclado los montos de las 5 ventas y luego sumar el
total de todas ellas para luego mostrar por pantalla el resultado. ¿Podrías
ayudarlo a realizar el algoritmo?
 */
package ejercicio_3c;

import java.util.Scanner;


public class Ejercicio_3c {
    public static void main(String[] args) {
        float total = 0;
        Scanner entrada = new Scanner(System.in);
        int cantidadVentas = 5;
        
        for(int i=0; i<cantidadVentas; i++){
            System.out.print("Ingrsar venta nº"+(i+1)+" : ");
            total = entrada.nextFloat() + total;
        }
        
        System.out.println("El total de ventas fue: "+total);
        
    }
}
