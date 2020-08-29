/*
En tres vectores diferentes se guardan los datos de temperaturas máximas y
mínimas de 5 ciudades de Misiones. En el primer vector se guardan los
nombres de las ciudades, en el segundo las temperaturas mínimas alcanzadas
y en el tercero las temperaturas máximas alcanzadas en la última semana. Se
necesita un programa que permita la carga de las ciudades, sus temperaturas
mínimas y máximas; además, deberá poder informar por pantalla cual fue la
ciudad con la temperatura más baja y cual con la temperatura más alta (dando
a conocer al mismo tiempo la cantidad de grados).

    |  Oberá  |         |  16  |        |  29  |
    | Posadas |         |  18  |        |  32  |
    | LN Alem |         |  15  |        |  28  |
    |   ...   |         |  ..  |        |  ..  |

 */
package vectores;

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
        String ciudades[] = new String[5];
        int tempMaximas[] = new int[5];
        int tempMinimas[] = new int[5];
        Scanner entrada = new Scanner(System.in);
        int tMin, tMax;
        int indiceMin, indiceMax;
        
        for(int i=0; i<ciudades.length; i++){
            System.out.print("Ingresar ciudad: ");
            ciudades[i] = entrada.nextLine();
            System.out.print("Ingresar tºC máxima y tºC mínima: ");
            tempMaximas[i] = entrada.nextInt();
            tempMinimas[i] = entrada.nextInt();
            entrada.nextLine(); //limpio el buffer
        }
        entrada.close();
        
        tMin = tempMinimas[0];
        indiceMin = 0;
        for(int i=0; i<tempMinimas.length; i++){
            if(tempMinimas[i]<tMin){
                tMin = tempMinimas[i];
                indiceMin = i;
            }
        }
        System.out.println(ciudades[indiceMin]+" tuvo la menor temperatura y fue "+tempMinimas[indiceMin]+"ºC");
        
        tMax = tempMaximas[0];
        indiceMax = 0;
        for(int i=0; i<tempMaximas.length; i++){
            if(tempMaximas[i]>tMax){
                tMax = tempMaximas[i];
                indiceMax = i;
            }
        }
        System.out.println(ciudades[indiceMax]+" tuvo la mayor temperatura y fue "+tempMaximas[indiceMax]+"ºC");
    }
    
}
