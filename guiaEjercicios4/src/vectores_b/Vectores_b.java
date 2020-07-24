/*
Realizar un programa que permita la carga por teclado de 10 números en un
vector. Una vez cargados, se necesita que el programa determine cuál es el
mayor y cuál es el menor de ellos.
 */
package vectores_b;

import java.util.Scanner;


public class Vectores_b {
    public static void main(String[] args) {
        int array[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        int mayor, menor;

        for(int i=0; i<array.length; i++){
            System.out.print("Ingresar valor ["+(i+1)+"]: ");
            array[i] = entrada.nextInt();
        }
        
        mayor = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>mayor)
                mayor = array[i];
        }
        System.out.println("Mayor valor del array: "+mayor);
        
        menor = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<menor)
                menor = array[i];
        }
        System.out.println("Menor valor del array: "+menor);
    }
}
