
package servlets;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;

import logica.Persona;


    


@WebServlet(name = "SvPersona", urlPatterns = {"/SvPersona"})
public class SvPersona extends HttpServlet {

   Controladora control= new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //Traemos la lista de las personas de la BD
        //creamos una variable de tipo lista
        
        List<Persona> listaPersonas=control.traerPersonas();
       //vamos a obtener el listado de las personas, pero ese listado
       //lo vamos a enviar a otro jsp
       //como todos los datos de la navegacion quedan dentro de la sesion actual 
       //vamos a recuperar los datos para despues poder enviarlos 

         HttpSession miSession= request.getSession();
        
         //Ahora definimos un nuevo atributo de la sesion, un listado de las
         //personas que trajimos de la BD
         miSession.setAttribute("listaPersonas", listaPersonas);
         
         //Ahora vamos a redirigir a otro jsp que se encargue de
         //generar el listado de las personas 
          response.sendRedirect("verPersonas.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
     String dni= request.getParameter("dni");// traeme el parametro de la request dni y guardalo en la variable dni
     String nombre= request.getParameter("nombre");
     String apellido= request.getParameter("apellido");
     String telefono= request.getParameter("telefono");
     //todos los valores que los lee de la interfaz gráfica los guarda en las variables
     
     //dando de alta a las personas. Se llama a la logica para crear personas
     
       Persona pers = new Persona(0, dni, nombre, apellido, telefono);
           control.crearPersona(pers);
            
         // response.sendRedirect("index.jsp"); //reenvia nuevamente al index
     
     
      /*  System.out.println("dni: "+ dni);
        System.out.println("nombre: "+ nombre);
        System.out.println("apellido: "+ apellido);
        System.out.println("telefono: "+ telefono);*/
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }


    
}

