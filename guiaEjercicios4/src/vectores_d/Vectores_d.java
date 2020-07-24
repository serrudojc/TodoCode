/*
Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir
de esa carga, necesita un programa que determine y muestre por pantalla la
suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.
 */
package vectores_d;

import java.util.Scanner;


public class Vectores_d {
    public static void main(String[] args) {
        float sueldos[] = new float[12];
        Scanner entrada = new Scanner(System.in);
        float suma = 0, promedio = 0;
        
        for(int i=0; i<sueldos.length; i++){
            System.out.print("ingresar sueldo "+(i+1)+": ");
            sueldos[i] = entrada.nextFloat();
            suma+=sueldos[i];
        }
        
        promedio = suma/sueldos.length;
        System.out.println("Suma total de sueldos: "+suma);
        System.out.println("Promedios de sueldo: "+promedio);
    }
}
