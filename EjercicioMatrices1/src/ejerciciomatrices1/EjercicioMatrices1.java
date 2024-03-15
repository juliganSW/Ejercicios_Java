
package ejerciciomatrices1;

import java.util.Scanner;


public class EjercicioMatrices1 {

    
    public static void main(String[] args) {
 /*Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol
en los últimos 3 partidos que jugaron, donde cada fila representa a un jugador 
y cada columna a la cantidad de goles que hizo. 
Se necesita un programa que sea capaz de permitir la carga de los goles, 
calcular el promedio de goles realizado por cada jugador
y almacenar el resultado en un vector de 5 posiciones, donde cada posición
representará a un jugador. Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:

Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.*/
  

// Declarar una matriz de 5 filas y 3 columnas
        int jugagol[][]= new int[5][3];
        double promgol[]= new double[5];
        
        
        //cargar goles y sacar promedio 
        
        Scanner teclado= new Scanner(System.in);
        for (int fila = 0; fila < 5; fila++) {
            int suma=0;
            for (int columna = 0; columna < 3; columna++) {
            System.out.println("ingrese jugador "+ fila); 
            jugagol[fila][columna]= teclado.nextInt();
            suma= suma + jugagol[fila][columna];
            }
        System.out.println("cantidad de goles:" + suma);
            
            promgol[fila]= (double)suma/3;
            System.out.println("el promedio de goles del jugador " + fila + " es " + promgol[fila]);
          }
        
         
            }
}

