/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicionmodulo6.pkg2;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class EjercicionModulo62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*2.En un vector de 15 posiciones se almacenan las edades de 15 alumnos.
        Se desea un programa que sea capaz de determinar cuál es la mayor edad
        y cuál es la menor edad que se encuentra entre los estudiantes.*/
        
        int vector[]= new int[15];
       
       
        Scanner teclado= new Scanner(System.in);
        //cargar el vector con las edades
         
          for( int i=0; i<10; i++){
          System.out.println("Ingrese una edad en la posicion: " + i);
          vector[i]=teclado.nextInt();
          }
          
           int menor,mayor;
           mayor= menor= vector[0];
           
            for( int i=0; i<10; i++){
               if(vector[i]< menor){
                 menor=vector[i];
            }
               if(vector[i]> mayor){
                 mayor=vector[i];
        }
            
       }
        System.out.println("la mayor edad es de: " + mayor);
        System.out.println("la menor edad es de: " + menor);
        
    
}
}