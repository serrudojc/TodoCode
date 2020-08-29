/*
En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de
secundario. Cada fila corresponde a las notas y al promedio de cada alumno.
    • Se necesita un programa que permita a un profesor cargar en las 3
    primeras posiciones de cada fila las notas del alumno y que en la última
    columna se calculen los promedios.
    • Una vez realizados los cálculos, se desea mostrar las 3 notas de cada
    alumno y el promedio correspondiente recorriendo la matriz. Ejemplo:

   
              Nota1   Nota2   Nota3   Prom
    Alumno 1    8       8       7       ?
    Alumno 1    7       9       10      ?
    Alumno 1    10      9       5       ?
    Alumno 1    4       9       8.5     ?

 */
package matrices03;

import java.util.Scanner;

public class Matrices03 {

    public static void main(String[] args) {
        final int cantAlumnos = 4;
        final int cantNotas = 4;
        float tabla[][] = new float[cantAlumnos][cantNotas];
        float promedio = 0;
        Scanner entrada = new Scanner(System.in);
        
        for(int f=0; f<cantAlumnos; f++){
            for(int c=0; c<cantNotas; c++){
                if(c == cantNotas-1){
                    tabla[f][c] = promedio/(cantNotas -1);
                    promedio = 0;
                    break;
                }
                System.out.print("Alumno "+(f+1)+", Nota "+(c+1)+": ");
                tabla[f][c] = entrada.nextFloat();
                promedio+=tabla[f][c];
            }
        }
        entrada.close();
        
        System.out.println("\t\tNota 1 \t\tNota 2 \t\tNota 3 \t\tProm");
        for(int f=0; f<cantAlumnos; f++){
            System.out.print("Alumno "+(f+1));
            for(int c=0; c<cantNotas; c++){
                System.out.print("\t "+tabla[f][c]+"\t");
            }
            System.out.println("");
        }
    }
    
}
