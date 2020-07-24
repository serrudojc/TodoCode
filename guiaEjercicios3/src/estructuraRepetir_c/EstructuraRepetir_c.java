/*
Realizar un algoritmo que muestre por pantalla los números del 200 al 250
saltando de 2 en dos. La secuencia debería ser: 200...202...204...etc.
 */
package estructuraRepetir_c;

public class EstructuraRepetir_c {
    public static void main(String[] args) {
        int limiteInferior = 200;
        int limiteSuperior = 250;
        
        for(int i=limiteInferior; i<=limiteSuperior; i+=2){
            System.out.println(i);
        }
    }
}
