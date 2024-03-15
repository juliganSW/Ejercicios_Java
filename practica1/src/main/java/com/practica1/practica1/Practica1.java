/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.practica1.practica1;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Practica1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
 
int vector[]=new int[4];

//Asignacion Manual

//vector[0]=12;
//vector[1]=23;
//vector[2]=41;
//vector[3]=145;

//Asignacion por teclado
Scanner teclado =new Scanner(System.in);
for (int i=0; i<vector.length; i++){
    System.out.println("ingrese el valor para el indice "+i);
    vector[i]=teclado.nextInt();

}


//Hacer un recorrido con el for

for (int i=0; i<vector.length; i++){
    System.out.println("Estoy en el indice " + i);
    System.out.println("Tengo guardado un " + vector[i]);
    System.out.println("-----------------");
}
    }
}

    
    

    


