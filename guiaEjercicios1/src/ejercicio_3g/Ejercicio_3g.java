/*
Realizar un algoritmo que permita intercambiar el valor de dos variables.
Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, hacer que la
variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al asignar
un valor a una variable se sobrescribe el valor anterior.
 */
package ejercicio_3g;

import java.util.Scanner;


public class Ejercicio_3g {
    public static void main(String[] args) {
        int variable1, variable2, variable3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresar variable 1: ");
        variable1 = entrada.nextInt();
        System.out.print("Ingresar variable 2: ");
        variable2 = entrada.nextInt();
        
        System.out.println("Estado de variables antes de swap");
        System.out.println("variable1 = "+variable1);
        System.out.println("variable2 = "+variable2);
        
        variable3 = variable1;
        variable1 = variable2;
        variable2 = variable3;
        
        System.out.println("Estado de variables luego de swap");
        System.out.println("variable1 = "+variable1);
        System.out.println("variable2 = "+variable2);
    }
}
