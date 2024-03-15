
package ejerciciomatrices2;

import java.util.Scanner;


public class EjercicioMatrices2 {

    
    public static void main(String[] args) {
 /*Una escuela primaria utiliza una matriz para calcular los promedios de sus alumnos. 
 Para ello tienen una matriz de 10 filas, donde cada fila representa a un alumno y 4 columnas. 
 Las primeras 3 columnas representan las notas de cada uno de los alumnos, mientras que la 4 es el promedio de las mismas. 
 Se desea un programa que sea capaz de permitir la carga por teclado de las 3 notas de cada alumno, 
 de realizar el cálculo automático del promedio, de guardar el mismo en la 4 columna
 y luego mostrar por pantalla cada una de las notas y el promedio obtenido. Por ejemplo.
 Nota: tener en cuenta que generalmente las calificaciones y los promedios no suelen ser números enteros,
 sino que pueden tener decimales.*/
    
    double boletin[][]=new double[10][4];
    
    Scanner teclado= new Scanner(System.in);
    double suma=0.0;
        for (int f = 0; f <10; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("ingrese la nota del alumno " + (f+1) + " del trimestre: " + (c+1));
                boletin[f][c]=teclado.nextDouble();
                suma= suma + boletin[f][c];
                }
             boletin[f][3]=suma/3;
             suma=0.0; //hay que cerrar el acumulador para no promediar al próximo alumno
        }
        // for para recorrer y mostrar las calificaciones
          for(int f=0; f<10; f++){
                  System.out.println("Las calificaciones del alumno " + (f+1) + " son: ");
                for(int c=0; c<3; c++){
                    System.out.println("Nota trimestre " + (c+1) +" "+ boletin[f][c]);
                   }
                System.out.println("el promedio es de: " + boletin[f][3]);
            }
                
            }

 
            
    
}
