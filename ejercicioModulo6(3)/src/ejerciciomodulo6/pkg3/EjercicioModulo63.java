
package ejerciciomodulo6.pkg3;


public class EjercicioModulo63 {

   
    public static void main(String[] args) {
/*Se tienen tres vectores. En el primero de ellos se guarda un número de dni,
en el segundo un nombre y en el tercero un apellido. 
Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO TIEMPO
y mostrar cada uno de estos datos por pantalla.
Pista: tener en cuenta que el índice de cada vector es correspondiente al índice de los demás, 
es decir, los datos contenidos en el índice cero del vector de dni,
se corresponde con el índice cero del vector de nombres y el de apellidos.*/
   
 int dni[]= new int[3];
 String nombre[]=new String[3];
 String apellido[]=new String[3];
 
 dni[0]=28643434;
 dni[1]=301245654;
 dni[2]=29256363;
 nombre[0]= "Ruben";
 nombre[1]= "Mario";
 nombre[2]= "Jasinto";
 apellido[0]= "Orlando";
 apellido[1]= "Bunge";
 apellido[2]= "Pierri";
 
  for( int i=0; i<3;i++){
      System.out.println("el numero de documento: " + dni[i] + " pertenece a: " + nombre[i] + " "+ apellido[i]);
  }
        
    }
    
}
