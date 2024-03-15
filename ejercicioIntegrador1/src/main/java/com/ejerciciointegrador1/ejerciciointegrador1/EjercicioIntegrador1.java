/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ejerciciointegrador1.ejerciciointegrador1;

import java.util.Scanner;

public class EjercicioIntegrador1 {

    public static void main(String[] args) {
        /*int vector[]= new int[15];
        Scanner teclado= new Scanner(System.in);
        //cargar el vector
        for( int i=0; i<15; i++){
            System.out.println("ingrese un número al vector please");
            vector[i]=teclado.nextInt();
        }
        //recorrer el vector
        int cont=0;
        for( int i=0; i<15; i++){
            if (vector[i]==3);
            cont+=1;
        }
         System.out.println("La cantidad de números 3 que hay en el vector es de: "+ cont);*/
        
        //----------------------------------------------------------------------------------------
        
        // Declarar una matriz de 4 filas y 4 columnas
        Double matriz[][]= new Double[4][4];
        //cargar notas y sacar promedio 
        Scanner teclado= new Scanner(System.in);
        Double suma=0.0;
        //for para cargar la matriz
        for(int f=0; f<4; f++){
            for(int c=0; c<3; c++){
                System.out.println("Ingrese el alumno nro " + f);
                matriz[f][c] = teclado.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3]=suma/3;
            suma=0.0; //hay que cerrar el acumulador para no promediar al próximo alumno
            
        }
            //for para recorrer y mostrar calificaciones
            for(int f=0; f<4; f++){
                  System.out.println("Las calificaciones del alumno " + f + " son: ");
                for(int c=0; c<3; c++){
                    System.out.println("Nota nro " + c +" "+ matriz[f][c]);
                   }
                System.out.println("el promedio es de: " + matriz[f][3]);
            }
                
            
            
       
        }
        
        
        
        
            
        
    }
}
