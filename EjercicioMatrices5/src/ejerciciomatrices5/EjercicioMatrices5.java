/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomatrices5;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class EjercicioMatrices5 {

 /* Una empresa constructora desea llevar a cabo un premio para sus obreros que
  hayan realizado horas extras 
en los últimos 6 meses. Para ello, lleva una matriz de control de 15 filas x 6 columnas
 , donde cada fila corresponde
a un empleado distinto y donde cada columna representa el total de horas trabajadas por mes.
El monto de horas normal trabajado x mes es de 8 horas diarias, 5 días a la semana, 4 semanas por mes, 
es decir: 160 horas. Todo monto superior a este es considerado como horas extras.
Se desea un programa que permita la carga de horas trabajadas por cada obrero y
que sea capaz de determinar aquellos que hayan realizado horas extras. 
Para registrar las horas extras realizadas se utilizará un vector de 15 posiciones
en donde se deberá calcular y almacenar la cantidad de horas extras de cada obrero. 
En caso de que no haya realizado horas extras, deberá incluirse un número 0.
Tomar como ejemplo la siguiente imagen:*/
    public static void main(String[] args) {
        //declaracion de los valores de las variables para fila y columna
        int empleado=3;
        int horasMes=6;
        // declaracion de la matriz principal
        int constructora[][]=new int[empleado][horasMes];
        int horasExtras[]=new int[empleado];//vector que almacena las hs. extras
        // cargar por teclado las horas trabajadas
        Scanner teclado= new Scanner(System.in);
       
        for (int fila = 0; fila < constructora.length; fila++) {
             int extras=0; //inicia la variable que vamos a usar para contar horas
            for (int col = 0; col < constructora[0].length; col++) {
                System.out.println("ingrese las horas trabajo del obrero: " + (fila+1)+ " del mes " + (col+1)+ " : " );
                constructora[fila][col]=teclado.nextInt();
                extras+=constructora[fila][col];//acumulamos las horas en la variable extras
                }
            
            // Se hace la comparacion mediante un if
            if(extras>(160*6)){
            horasExtras[fila]=(extras-160*6);
            }
           else{
                horasExtras[fila]=0;
            }
            
        }
        //recorrer y mostrar mediante otro for
        for (int hora = 0; hora< horasExtras.length; hora++) {
            System.out.println("las horas extras del empleado: " + (hora+1) + " son: " + horasExtras[hora]);// se pone el vector par que pueda ser recorrido
        }
    }
    
}
