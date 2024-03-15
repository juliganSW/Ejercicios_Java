/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciointegrador2;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class EjercicioIntegrador2 {

    /**
     * @param args the command line arguments
     */
    
    /*Una pequeña despensa desea calcular los sueldos de sus empleados, 
    Los puestos de los mismos pueden tener 3 categorias: 1-repositor; 2-cajero; 3-supervisor
    Los repositores cobran $15890 + un bono del 10%
    Los cajeros cobran $25630,89 fijos
    Los supervisores cobran $35560,20 en bruto al cual se le descuenta un 11%
    de jubilacion.
    Se necesita un programa que, dependiendo del tipo de empleado del que se trate,
    calcule y muestre en pantalla el sueldo correspondiente
    */
    public static void main(String[] args) {
    double sueldo=0;
    int categoria;
    System.out.println("Ingrese una categoria: ");
    Scanner teclado= new Scanner(System.in);
    categoria= teclado.nextInt();
    if (categoria==1){
    sueldo= 15890 + 15890*0.10;
    }
    else if(categoria==2){
        sueldo= 25630.89;
    }
    else if(categoria==3){
       sueldo= 35560 - 35560*0.11;
    }
    else{
        System.out.println("Ingrese una categoria válida");
    }
    if(categoria==1 || categoria==2 || categoria==3){
        System.out.println("el sueldo total para la categoria " + categoria+ " es de: "+ sueldo);
    }
    }
    
}
