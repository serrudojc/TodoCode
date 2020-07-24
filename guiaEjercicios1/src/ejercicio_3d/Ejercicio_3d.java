/*
Realizar un algoritmo que calcule el IVA de un producto. Para esto, el
usuario debe poder ingresar por teclado el valor del producto y el algoritmo
debe informarle por pantalla qué monto equivale al IVA. Recordar que el IVA
es igual al 21% (0,21).
 */
package ejercicio_3d;

import java.util.Scanner;


public class Ejercicio_3d {
    public static void main(String[] args) {
        final float  IVA = 0.21f;
        float precio,montoIva;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresar precio: ");
        precio = entrada.nextFloat();
        
        montoIva = precio*IVA;
        System.out.println("el IVA es: "+montoIva);
    }
}
