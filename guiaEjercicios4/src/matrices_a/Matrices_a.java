/*
Llevar a cabo un programa que permite cargar completamente con números 5
una matriz de 4x5 (4 filas, 5 columnas).
 */
package matrices_a;


public class Matrices_a {
    public static void main(String[] args) {
        int matriz[][] = new int[4][5];
        
        for(int f=0; f<4; f++){
            for(int c=0; c<5; c++){
                matriz[f][c] = 5;
            }
        }
        
        for(int f=0; f<4; f++){
            for(int c=0; c<5; c++){
                System.out.print(matriz[f][c]);
            }
            System.out.println("");
        }
    }
}
