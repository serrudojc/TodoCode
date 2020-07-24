/*
Realizar un algoritmo que permita calcular el área de un triángulo. Se
recuerda que la fórmula para calcular el área de un triángulo es: (base *
altura) / 2. Se debe permitir al usuario ingresar la base y la altura,
mientras que el algoritmo debe calcular el área y mostrar el resultado por
pantalla.
 */
package ejercicio_3f;

import java.util.Scanner;


public class Ejercicio_3f {
    public static void main(String[] args) {
           
        float base, altura;
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Ingresar altura: ");
        altura = entrada.nextFloat();
        System.out.print("Ingresar base: ");
        base = entrada.nextFloat();
        
        System.out.println("El área es "+((base*altura)/2));
    }
}
