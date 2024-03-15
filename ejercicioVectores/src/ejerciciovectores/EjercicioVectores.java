/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovectores;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class EjercicioVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*realizar un programa que perminta cargar 15 números en un vector
     Una vez cargados se necesita que el programa cuente e informe por pantalla
     cuantas veces cargó el número 3
        */
     int vector[]= new int[15];
     Scanner teclado= new Scanner(System.in);
     //cargar el vector
    
     for(int i=0; i<15; i++){
     System.out.println("ingrese un numero al vector: ");
         
     vector[i]= teclado.nextInt();
     }
     //recorrer y contar cuantos numeros hay
     int cont=0;
     for(int i=0; i<15; i++){
         if (vector[i]==3){
            cont+=1;
         }
       }
        System.out.println("el numero 3 se ha cargado "+ cont + " veces");
     }
     
    }
  

