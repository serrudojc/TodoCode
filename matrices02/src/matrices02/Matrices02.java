/*
Llevar a cabo un programa que permita cargar mediante teclado una matriz de
3 x 3 (3 filas, 3 columnas) con razas de perros. Una vez cargada la misma,
será necesario realizar un recorrido por la misma y mostrar los datos
cargados por pantalla.
 */
package matrices02;

import java.util.Scanner;

public class Matrices02 {

    public static void main(String[] args) {
        String matriz[][] = new String[3][3];
        Scanner entrada = new Scanner(System.in);
        
        for(int f=0; f<3; f++){
            for(int c=0; c<3; c++){
                System.out.print("Ingresar perro ["+(f+1)+"]["+(c+1)+"]: ");
                matriz[f][c] = entrada.next();
            }
        }
        
        for(int f=0; f<3; f++){
            for(int c=0; c<3; c++){
                System.out.println("["+(f+1)+"]["+(c+1)+"]: "+matriz[f][c]);
            }
        }
    }
}
