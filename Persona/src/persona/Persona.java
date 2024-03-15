/*Crear una clase persona que tenga los siguientes atributos: 
dni, nombre, apellido, dirección, celular, edad 
(tener en cuenta todos sus atributos, constructores y métodos getters y setters). 
A partir de ello:
a.Crear una LinkedList de tipo Persona y agregar 20 personas distintas.
b.Crear dos LinkedLists de tipo Persona diferentes a la primera,
una para almacenar a los menores de edad y otra para los mayores.
c.Recorrer la lista principal buscando a las personas que sean mayores de 18 años. 
En caso que una persona tenga o sea mayor a 18 años, agregarla a la lista de mayores,
caso contrario agregarla a una lista de menores.
d.Una vez realizada la separación, recorrer ambas nuevas listas
y mostrar por pantalla el nombre, apellido y edad de cada una de las personas
contenidas en cada lista.*/
package persona;


import java.util.LinkedList;
import java.util.List;


public class Persona {
  int dni;
  String nombre;
  String apellido;
  String direccion;
  int celular;
  int edad;

public Persona(int dni, String nombre, String apellido, String direccion, int celular, int edad){
this.dni=dni;
this.nombre=nombre;
this.apellido=apellido;
this.direccion=direccion;
this.celular=celular;
this.edad=edad;
}
 //constructor vacio
public Persona(){
}

//getters
public int getDni(){
  return dni;
}

public String getNombre(){
  return nombre;
}

public String getApellido(){
  return apellido;
}

public String getDireccion(){
  return direccion;
}

public int getCelular(){
  return celular;
}

public int getEdad(){
  return edad;

    }
    public static void main(String[] args) {
      //Se declara lista de tipo List y se la inicializa como LinkedList
    List<Persona> listaPersonas= new LinkedList();
    // carga de registros a la LinkedList
    listaPersonas.add(new Persona(30212545,"Gabriel","Lopez","Gurruchaga 2112",1169871454,37   ));
    listaPersonas.add(new Persona(28654236,"Sabrina","Eguía","Cramer 2845",1167632547,40   ));
    listaPersonas.add(new Persona(25879988,"Lucia","Galán","Rivadavia 5435",117913514,46   ));
    listaPersonas.add(new Persona(27589632,"Leonardo","Roa","Gascón 6630",115696932,42  ));
    listaPersonas.add(new Persona(30212545,"Carolina","Ardohaín","Riobamba 631",116254655,38   ));
    listaPersonas.add(new Persona(12456654,"Micaela","Montiel","Cucha Cucha 1422",116366366,14   ));
    listaPersonas.add(new Persona(8621995,"Gonzalo","Bazán","Baigorria 2865",114322655,7   ));
    listaPersonas.add(new Persona(14569741,"Ramiro","Toledo","Freire 544",1155556223,16  ));
    listaPersonas.add(new Persona(20565744,"Miriam","Balbi","Azcuenaga 1225",1146392415,60   ));
    listaPersonas.add(new Persona(35414562,"Santino","Miloni","Sanabria 3254",1169813617,12   ));

    // se crean dos LinkedList nuevas
    List<Persona> listaMayores= new LinkedList();
    List<Persona> listaMenores= new LinkedList();

   //for each para recorrer y buscar personas mayores de 18
   for (Persona perso : listaPersonas){
       if (perso.getEdad()>18){
           listaMayores.add(perso);//agrega a listaMayores
       }
       else{
           listaMenores.add(perso);// caso contrario, agrega a listaMenores
       }

}
   // for para recorrer las nuevas listas y mostrar los registros que se deseen 
   for(Persona perso : listaMayores){
       System.out.println(perso.getNombre() +" "+perso.getApellido()+ " "+ "tiene" + " "+ perso.getEdad()+ " años");
   }
        System.out.println("****************************");
        
   for(Persona perso : listaMenores){
       System.out.println(perso.getNombre() +" "+perso.getApellido()+ " "+ "tiene" + " "+ perso.getEdad()+ " años");
   
    }
}
}