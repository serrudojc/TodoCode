/*
Una estudiante está dando sus primeros pasos en la programación y quiere
realizar un algoritmo que permita calcular cualquier porcentaje de un
número. Para ello necesita que el usuario ingrese por teclado el número a
calcular el porcentaje (por ejemplo 2500) y también el porcentaje que se
desea calcular (por ejemplo si quiere calcular 10% debería ingresar 0,10).
A partir de estos valores, necesita que el algoritmo calcule el porcentaje
(multiplicar el primer número por el valor del porcentaje), lo guarde en
una variable y se muestre por pantalla. ¿Podrías ayudarla a realizar el
algoritmo?
 */
package ejercicio_3b;

import java.util.Scanner;


public class Ejercicio_3b {
    public static void main(String[] args) {
        float valor, porcentaje,resultado;
        float test = 1.5f;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Imprimo test: "+test);
        System.out.print("Ingresar valor: ");
        valor = entrada.nextFloat();
        System.out.print("Ingresar porcentaje [0.x]: ");
        porcentaje = entrada.nextFloat();
        
        resultado = valor*porcentaje;
        System.out.println("El resultado es: "+resultado);
    }
}
