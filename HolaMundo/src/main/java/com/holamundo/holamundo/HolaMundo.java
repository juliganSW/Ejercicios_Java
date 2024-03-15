
package com.holamundo.holamundo;


public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo cruel!!!");
        System.out.println("Linda noche pa tomarse un birro");
        int num1, num2, resultado;
        num1=168;
        num2=584;
        resultado= num1 + num2;
        System.out.println("El resultado de la operacion es de: "+ resultado);
        
        int numero1=20;
        int numero2=35;
        int aux;//variable auxiliar
        
        System.out.println("------Antes-------");
        System.out.println("Numero uno: "+ numero1);
        System.out.println("Numero dos: "+ numero2);
        aux=numero2;
        numero2=numero1;
        numero1=aux;
         System.out.println("------Después-------");
        System.out.println("Numero uno: "+ numero1);
        System.out.println("Numero dos: "+ numero2);
        
       }
}
