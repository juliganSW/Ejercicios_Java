 
package logica;
// esta controladora se conecta con la controladora de persistencia


import java.util.List;
import persistencia.ControladoraPersistencia;



public class Controladora {
     ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearPersona(Persona per){
     controlPersis.crearPersona(per);
    }
    
    public void eliminarPersona(int id){
     controlPersis.eliminarPersona(id);
    }
    
     public void eliminarPersona(Persona pers){
         controlPersis.eliminarPersona(pers);
     }
    
     
     public List<Persona> traerPersonas(){
         //devuelve todas las personas existentes en forma de lista
     return controlPersis.traerPersonas();
     }
     
     public void modificarPersona(Persona pers){
           controlPersis.modificarPersona(pers);
     
     }
     
     public Persona traerPersonas(int id){
     //me devuelve todas las personas existentes en forma de lista
     return controlPersis.traerPersonas(id);
     }
}
    

