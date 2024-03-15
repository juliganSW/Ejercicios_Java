
package ejerciciomodulo6.pkg4;

import java.util.Arrays;
import java.util.Scanner;


public class EjercicioModulo64 {

    
    public static void main(String[] args) {
/*En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales
de las 23 provincias argentinas en el último mes. 
A partir de esta información, un noticiero desea determinar
el top 5 de las temperaturas más altas para poder mostrar en la pantalla de su programa,
para ello se necesita un programa que sea capaz de recorrer el vector de temperaturas,
determinar las 5 más altas y copiarlas en un nuevo vector de 5 posiciones*/
       
    
    int temp[]= new int[23];
    int tempMax[]= new int[5];
    
    Scanner teclado= new Scanner(System.in);
    for(int i=0; i<23; i++){
        System.out.println("Ingrese la temperatura de la provincia en la posicion " + i);
        temp[i]=teclado.nextInt();
    }
    // clase Array que ordena de menor a mayor
    Arrays.sort(temp);
    // recorre el array y hace uno nuevo de temperaturas máximas
    for ( int i=0; i<5; i++){
        tempMax[i]=temp[(23-(i+1))];
    }
          for( int i=0; i<5;i++){
          System.out.println("las temperaturas mayores son: " + tempMax[i]);
           
       }
          
    }
}
