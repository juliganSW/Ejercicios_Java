 /*Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:

a.Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la lista.

b.Recorrer la lista creada y mostrar por pantalla el nombre, especie y pelaje de las mascotas almacenadas.

c.Durante el recorrido, cambiar el nombre de dos mascotas. Volver a recorrer la lista y mostrar los nuevos datos

d.Agregar dos nuevas mascotas a la lista.

e.Recorrer la lista pero solo mostrando las mascotas que sean de la especie “perro"*/

package mascota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Proyecto Mascota
public class Mascota {
 // declaracion de atributos con tipos de datos
String nombre;
String especie;
String sexo;
String color;
String pelaje;
String raza;
//Se define el constructor con los atributos 
public Mascota(String nombre,String especie,String sexo,String color, String pelaje,String raza){

this.nombre=nombre;
this.especie=especie;
this.sexo=sexo;
this.color=color;
this.pelaje=pelaje;
this.raza=raza;
}
//constructor vacio
public Mascota(){
}
//getters
public String getNombre(){
  return nombre;
}

public String getEspecie(){
  return especie;
}

public String getSexo(){
  return sexo;
}

public String getColor(){
  return color;
}

public String getPelaje(){
  return pelaje;
}

public String getRaza(){
  return raza;
}

//setters
public void  setNombre(String nombre){
    this.nombre=nombre;
}

public void setEspecie(String especie){
    this.especie=especie;
}

public void setSexo(String sexo){
    this.sexo=sexo;
}

public void setColor(String color){
    this.color=color;
}

public void setPelaje(String pelaje){
    this.pelaje=pelaje;
}

public void setRaza(String raza){
    this.raza=raza;
}

public static void main(String[] args) {
    //Se declara lista de tipo List y se la inicializa como ArrayList
    List <Mascota> listaMascotas= new ArrayList<Mascota> ();
    //Ingresar elementos al arreglo
    listaMascotas.add(new Mascota("Tarugo","perro","macho","negro","corto","labrador"));
    listaMascotas.add(new Mascota("Branca","perro","hembra","marron","corto","beagle"));
    listaMascotas.add(new Mascota("Manchi","gato","hembra","blanco","largo","mestizo"));
    listaMascotas.add(new Mascota("Lolo","gato","macho","gris","corto","británico"));
    listaMascotas.add(new Mascota("Arturo","perro","macho","chocolate","largo","pastor belga"));
    
    //recorremos el arrayList mediante un for each y se imprime por pantalla
       for (Mascota animal : listaMascotas){ //declaré una variable auxiliar animal
        System.out.println("nombre: " + animal.getNombre());
        System.out.println("especie: " + animal.getEspecie());
        System.out.println("sexo: " + animal.getSexo());
        System.out.println("color: " + animal.getColor());
        System.out.println("pelaje: " + animal.getPelaje());
        System.out.println("raza: " + animal.getRaza());
        } 
      //cargar por teclado 
      Scanner teclado= new Scanner(System.in);
        for (int i = 0; i < listaMascotas.size(); i++) {
            System.out.println("Mascota: " + (i+1)+ " de "+ listaMascotas.size());
            System.out.println(listaMascotas.get(i).getEspecie()+" "+listaMascotas.get(i).getNombre());   
                 // Ofrecemos cambio de nombre
                  System.out.println("desea cambiar el nombre de la mascota?");  
                  String respuesta=teclado.next();
                  if("si".equalsIgnoreCase(respuesta)){//comparacion de strings y acceso a cambio de nombre si ingresa "si"
                      System.out.println("Ingrese el nuevo nombre: ");
                      listaMascotas.get(i).setNombre(teclado.next());//setea el nuevo nombre
                  }
        }
           //devuelve el listado actualizado
        for (Mascota nom : listaMascotas) { // declaré la variable auxiliar nom
            System.out.println("nombre: " + nom.getNombre());
        }
            System.out.println("********************************");
            System.out.println("********************************");
            System.out.println("********************************");
            
            System.out.println("Ingrese dos nuevas mascotas: ");
            
         // for para agregar las dos mascotas
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese los datos de la mascota " + (i+1));
            System.out.println("nombre: ");
            String nombre=teclado.next();
            System.out.println("especie: ");
            String especie=teclado.next();
            System.out.println("sexo: ");
            String sexo=teclado.next();
            System.out.println("color: ");
            String color=teclado.next();
            System.out.println("pelaje: ");
            String pelaje=teclado.next();
            System.out.println("raza: ");
            String raza=teclado.next();
            listaMascotas.add(new Mascota(nombre, especie, sexo, color, pelaje, raza));
            }
        // for para imprimir el nombre de las mascotas
         for (Mascota m : listaMascotas){
             System.out.println("nombre: "+ m.getNombre());
         }
            System.out.println("********************************");
            System.out.println("********************************");
            System.out.println("********************************");
        //imprimir nombre de las mascotas especie "perro"
         for (Mascota m : listaMascotas){
            if("perro".equalsIgnoreCase(m.getEspecie())){
                System.out.println("nombre: "+ m.getNombre());
                
            }
         }
        }
    }
