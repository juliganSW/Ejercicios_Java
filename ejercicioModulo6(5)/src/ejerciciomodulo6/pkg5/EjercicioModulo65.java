
package ejerciciomodulo6.pkg5;

import java.util.Scanner;


public class EjercicioModulo65 {

    
    public static void main(String[] args) {
/* Se necesita un vector que permita cargar por teclado el nombre de 10 animales.
A partir de esta carga, se desea otro vector que copie los mismos nombres pero en el orden inverso, 
es decir, si los nombres son: perro, gato, lagartija, el nuevo vector debe contener: lagartija,
gato, perro. Una vez realizado el cambio, mostrar por pantalla ambos vectores para compararlos.*/


String animales[]= new String[10];
String selamina[]=new String[10];

        Scanner teclado =new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre de un animal en la posicion: " + i);
            animales[i]=teclado.next();
        }
        for (int i = 0; i < 10; i++) {
        selamina[i]=animales[10-(i+1)];
        }
        System.out.println("los animales son: ");
        for (int i = 0; i < 10; i++) {
            System.out.println( animales[i]);
            }
        System.out.println("los animaes a la inversa son: ");
         for (int i = 0; i < 10; i++) {
             System.out.println( selamina[i]);
            
        }
 
    } 
    }  
            
            
    

