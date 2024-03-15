/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ejercicioluisi.luisina;




public class Luisina {
int id;
String nombre;
String apellido;

   
    

    public Luisina() {
    }

    public Luisina(int id, String nombre, String apellido) {
    }
    
    
     
     public void mostrarNombre(){
     System.out.println("Hola, soy un alumno y se decir mi nombre");
    }
    public void saberAprobado(double calificacion){
        if (calificacion>=6){
            System.out.println("aprobé la materia");
        }
        else{
            System.out.println("pucha, no aprobé");
        }
    }
}

    
        

