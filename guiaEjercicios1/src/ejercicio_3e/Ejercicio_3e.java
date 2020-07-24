/*
Realizar un algoritmo que permita a un profesor calcular el promedio de un
alumno. Para esto, el algoritmo debe permitir ingresar las 4 notas de un
alumno (por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de las
mismas y mostrar el resultado por pantalla. Se recuerda que el promedio es
la suma de todas las notas dividido la cantidad, en el ejemplo sería:
(8+7+9.50+10)/4.
 */
package ejercicio_3e;

import java.util.Scanner;


public class Ejercicio_3e {
    public static void main(String[] args) {
        
        final int NOTAS = 4;
        float promedio = 0, nota;
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0; i<NOTAS; i++){
            System.out.print("Ingresar nota: ");
            nota = entrada.nextFloat();
            promedio+=nota;
        }
        promedio = promedio/NOTAS;
        System.out.println("El promedio es "+promedio);
    }
}
