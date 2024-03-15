/*Realizar un programa donde se provoque una excepción de tipo “error por desbordamiento”.
Tratar la excepción mediante los bloques try y catch y mostrar un mensaje indicando la situación.
Por ejemplo: “Se produjo un error por desbordamiento”.  */
package excepcion1;


public class Excepcion1 {

   
    public static void main(String[] args) {
       int cartas[]={ 25, 11 , 12 , 35 };
       try {
           System.out.println("La edad de la posicion 4 es de: "+ edades[4]);
       }
       catch (Exception e){
            System.out.println("El indice ingresado es inexistente!!");
       }
       
        
        
    }
    
}
