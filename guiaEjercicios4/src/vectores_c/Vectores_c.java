/*
Realizar un programa que permita la carga por teclado de 15 números en un
vector. Una vez cargados, se necesita que el programa cuente e informe por
pantalla cuántas veces se cargó el número 3 (si es que fue cargado alguna
vez).
 */
package vectores_c;

import java.util.Scanner;


public class Vectores_c {
    public static void main(String[] args) {
        int array[] = new int[6];
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int valor = 3;
        
        for(int i=0; i<array.length; i++){
            System.out.print("Ingresar valor ["+(i+1)+"]: ");
            array[i] = entrada.nextInt();
        }
        for(int i=0; i<array.length; i++){
            if(array[i] == valor)
                contador++;
        }
        System.out.println("Cantidad de veces que apareció el valor "+valor+": "+contador);
    }
    
}
