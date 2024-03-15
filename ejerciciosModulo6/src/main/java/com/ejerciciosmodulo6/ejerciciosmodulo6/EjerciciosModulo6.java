

package com.ejerciciosmodulo6.ejerciciosmodulo6;

import java.util.Scanner;

public class EjerciciosModulo6 {
    /*1.Se necesita de un vector que sea capaz de almacenar 10 números enteros 
     entre 1 y 100. Realizar un programa que permita
    la carga por teclado de los 10 números solicitados.*/

    public static void main(String[] args) {
    //declaracion de vector
        int vector[]= new int[10];
        Scanner teclado= new Scanner(System.in);
        //cargar el vector
        for( int i=0; i<10; i++){
            System.out.println("ingrese un número del 1 al 100 al vector please: ");
            vector[i]=teclado.nextInt();
            
            if(vector[i]<1||vector[i]>100)
                System.out.println("numero invalido, ingresar otro");
            }
            
        for (int i=0; i<10; i++){
        System.out.println("Los numeros ingresados son: " + vector[i]);
}
}
} 
    

