
package ejerciciomatrices4;

import java.util.Scanner;


public class EjercicioMatrices4 {

    
    public static void main(String[] args) {
/*Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para determinar
cada plato del menú y sus correspondientes ingredientes que contiene. 
Para ello, cada fila representa un plato principal en donde en la primera columna
se especifica su nombre (por ejemplo: Milanesa), 
y en las demás los posibles acompañamientos que puede tener el plato 
(por ejemplo, puré, ensalada rusa, papas fritas, ensalada de lechuga y tomate, ensalada de zanahoria, etc).
En caso de que tenga el plato menos de 4 tipos de acompañamiento, 
en la matriz se cargará la palabra Ninguno en las posiciones que queden vacías.
Se desea un programa que sea capaz de permitir la carga de la matriz, 
de buscar un plato en particular que un cliente ingrese por teclado
y mostrarle de forma automática los posibles acompañamientos del mismo. */
 
// definimos los valores dos variables para fila y columna
//( se pueden redefinir según la cantidad deseada)
int platoPrincipal=4;
int guarnicion=5;

// definicion de matriz principal 
String platos[][]=new String[platoPrincipal][guarnicion];
 // cargar por teclado
 Scanner teclado= new Scanner(System.in);
 // ingresar el plato principal
        for (int fila = 0; fila < 4; fila++) {
         int col=0;// porque el plato principal tiene que estar en col 0
            System.out.print("Ingrese el plato: ");
           String plato = teclado.nextLine();
           platos[fila][col]=plato;
        
        //ingreso de posibles guarniciones
            for ( col = 1; col < 5; col++) {
                System.out.print("Ingrese guarnicion: ");
            }
            System.out.println("ingrese guarnicion para el plato principal: ");
             plato= teclado.nextLine();
            platos[fila][col]= plato;
        //chequea si la guarnicion ingresada es "ninguno"
        if(plato.equalsIgnoreCase("ninguno")){//equals compara Strings
            col++;
            //proceso automatico
            while (col<guarnicion){
                platos[fila][col]="Ninguno";
                 col++;
            }
        }
    }
    
    
        
            
        
    
    
    
     String pp;
    // ciclo para imprimir plato principal y guarniciones
    do {
            System.out.println("Ingrese plato a consultar");
            pp=teclado.nextLine();
            boolean esta=false;
            int fila=0;
            int col=0;
            while(( esta== false) && ( fila < platoPrincipal) && !(pp. equals("0"))){
                
             // if por si encuentra en la lista el plato principal ingresado
             if((platos[fila][col]).equals(pp)){
                 esta= true;
                 System.out.println("Plato principal: "+ platos[fila][col]);
             //control por si encuentra una guarnicion "ninguno"
                 for (int colu=1; colu <5; colu++) {
                     System.out.println("posible guarnicion: " + platos[fila][colu]);
                 }
             }else{
                     fila++;
                     }
            }
         if((esta== false)&& (pp.equals("0")==false)){
             System.out.println("No existe este plato");
         }
         while((pp.equals("0")==false));
            System.out.println("Gracias por usar Rest Menú");
//Noooo me saliiiooooooooooooooo




       
                      
            
            
    
    


             

    
    
                        
            
        

 


