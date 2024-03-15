/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.matrices1.matrices1;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Matrices1 {

    public static void main(String[] args) {
       int matriz[][]= new int [3][3];
    //Asignacion Manual
       /*matriz[0][0]=4;
       matriz[0][1]=15;
       matriz[0][2]=78;
       matriz[1][0]=96;
       matriz[1][1]=712;
       matriz[1][2]=125;
       matriz[2][0]=215;
       matriz[2][1]=87;
       matriz[2][2]=36;**/
       
       //Asignacion Manual
       Scanner teclado = new Scanner(System.in);
       
       
       for(int f=0; f<3; f++){
           for(int c=0; c<3; c++){
               System.out.println("Ingrese el valor de la posicion f: " + f + " c: " + c);
               matriz[f][c]= teclado.nextInt();
               
           }
       }
       //Recorrido
       for(int f=0; f<3; f++){
           for(int c=0; c<3; c++){
               System.out.println("El valor de la posicion f: " + f + "c: " + c);
               System.out.println("Es de: " + matriz[f][c]);
           }
           
       }
       
       
       
        
    }
}