/*
Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
a) Los repositores cobran $15.890 + un bono de 10%.
b) Los cajeros cobran $25.630,89 fijos.
c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11%
de jubilación.
Se necesita un algoritmo que, dependiendo el tipo de empleado del que se trate,
calcule y muestre en pantalla el correspondiente sueldo.
 */
package condicionales_1;

import java.util.Scanner;


public class Condicionales_1 {
    public static void main(String[] args) {
        float sueldoRepositor = 15890;
        float sueldoCajero = 25630.20f;
        float sueldoSupervisor = 35560.20f;
        final float bono = 0.1f;
        final float jubilacion = 0.11f;
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        System.out.println("Elegir categoría: ");
        System.out.println("[1] repositor");
        System.out.println("[2] cajero");
        System.out.println("[3] supervisor");
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Sueldo repositor es "+(sueldoRepositor*(1+bono)));
                break;
            case 2: 
                System.out.println("Sueldo cajero es "+(sueldoCajero));
                break;
            case 3:
                System.out.println("Sueldo supervisor es "+(sueldoSupervisor*(1-jubilacion)));
                break;
            default:
                System.out.println("La categoria no existe");
        }
    
    }
    
}
