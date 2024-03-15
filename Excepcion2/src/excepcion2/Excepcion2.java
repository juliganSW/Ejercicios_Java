/* Realizar un programa que permita el ingreso de dos números por teclado para ser divididos entre sí. 
Tomar como precaución la utilización del try y el catch por si el segundo número ingresado para dividir
se trata de un cero. Mostrar un mensaje adecuado en caso de que se produzca la excepción.
*/
package excepcion2;

import java.util.Scanner;


public class Excepcion2 {
     
     
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del dividendo: ");
        int dividendo = teclado.nextInt(); // ingresa el valor y lo guarda en la variable dividendo

        System.out.println("Ingrese el valor del divisor: ");// ingresa el valor y lo guarda en la variable divisor
        int divisor = teclado.nextInt();

        try {
            int resultado = dividendo / divisor; // le pido que haga la division 
            System.out.println("el resultado de la division es: " + resultado);
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero!!");

        }

    }
}
