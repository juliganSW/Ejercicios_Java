
package com.miaplicacion.primerproyecto.Controller;


import com.miaplicacion.primerproyecto.model.Persona;
import com.miaplicacion.primerproyecto.service.IPersonaService;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
   /* List<Persona> listaPersonas= new ArrayList();
    
    @GetMapping("/hola/{nombre}/{apellido}/{edad}")
    public String decirHola(@PathVariable String nombre,
            @PathVariable String apellido,@PathVariable int edad){
        return "Hola Mundo " + nombre + " apellido: "+ apellido + " edad: "+ edad  ;
     //cuando ingrese desde el navegador( por defecto utiliza el método GET) 
    //a la url de la aplicación,
   //obtendremos el resultado de la función decirHola() 
    }
    @GetMapping("/chau")//@RequestParam para que los parametros se generen automaticamente en la URL
   public String decirChau(@RequestParam String nombre, 
           @RequestParam String apellido,@RequestParam int edad){
       return "Chau mundo " + nombre + " apellido: "+ apellido + " edad: "+ edad  ;
   
   }*/
   //armar el end-point
    @Autowired
    private IPersonaService persoServ;
   @PostMapping("/new/persona")
   public void agregarPersona(@RequestBody Persona pers){
       persoServ.crearPersona(pers);
     //   listaPersonas.add(pers);
   }
   
   
   //para consultar  las personas que se cargan a la lista
   @GetMapping("/ver/personas")
   @ResponseBody
    public List<Persona> verPersonas(){
         return persoServ.verPersonas();
    //   return listaPersonas;
    
    }
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
    persoServ.borrarPersona(id);
    }
    
}
