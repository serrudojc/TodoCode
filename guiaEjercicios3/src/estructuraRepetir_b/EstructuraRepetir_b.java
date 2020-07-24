/*
Realizar un algoritmo que dado por teclado un límite numérico (por ejemplo
100) muestre en pantalla todos los números hasta ese límite (empezando por
1).
 */
package estructuraRepetir_b;

import java.util.Scanner;


public class EstructuraRepetir_b {
    public static void main(String[] args) {
        int limite;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresar limite númerico: ");
        limite = entrada.nextInt();
        
        for(int i=0; i<limite; i++){
            System.out.println(i+1);
        }
    }
}
