

package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    //creamos una instancia
    PersonaJpaController persJPA = new PersonaJpaController();
    
    public void crearPersona( Persona per){
        persJPA.create(per);
        //lo que va a hacer cuando llame a la controladora de persistencia
        //llama a la controladora JPA de persona y a su método create
        //(creame el objeto persona)
    }
    
    public void eliminarPersona(int id){
        try {
            persJPA.destroy(id);
            //lo que va a hacer cuando llame a la controladora de persistencia
           //llama a la controladora JPA de persona y a su método destroy para eliminar la persona
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    public void eliminarPersona(Persona pers){
        try {
            persJPA.destroy(pers.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public List<Persona> traerPersonas(){
         //devuelve todas las personas existentes en forma de lista
      return persJPA.findPersonaEntities();
     }
    
    /* public Persona traerPersonas(int id){
         //devuelve todas las personas existentes en forma de lista
         return persJPA.findPersona(id);
     
     }
    
    public void modificarPersona(Persona pers){
        try {
            persJPA.edit(pers);
             //lo que va a hacer cuando llame a la controladora de persistencia
        //llama a la controladora JPA de persona y a su método edit
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }*/
}

