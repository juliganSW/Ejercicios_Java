
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Persona;


@WebServlet(name = "SvModificar", urlPatterns = {"/SvModificar"})
public class SvModificar extends HttpServlet {
    Controladora control= new Controladora();

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //recupero el id que me llega de la persona a modificar
        int id=Integer.parseInt(request.getParameter("id_modificar"));
        
        Persona pers= control.traerPersonas(id);
        
        if(pers != null){
        //vamos a obtener la  persona si existe, pero ese listado
       //lo vamos a enviar a otro jsp
       //como todos los datos de la navegacion quedan dentro de la sesion actual 
       //vamos a recuperar los datos para despues poder enviarlos
       
         HttpSession miSession= request.getSession();
        
         //Ahora definimos un nuevo atributo de la sesion, un listado de las
         //personas que trajimos de la BD
         miSession.setAttribute("persona",pers);
         
         //Ahora vamos a redirigir a otro jsp que se encargue de
         //generar el listado de las personas 
          response.sendRedirect("modificacion.jsp");
          return;
        }
        else
            System.out.println("Error! id no encontrado en la BD" + id);
         response.sendRedirect("index.jsp");
            
            
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         int id= Integer.parseInt(request.getParameter("id"));
        
     String dni= request.getParameter("dni");
     String nombre= request.getParameter("nombre");
     String apellido= request.getParameter("apellido");
     String telefono= request.getParameter("telefono");
     
     Persona pers= new Persona(id,dni,nombre,apellido,telefono);
             control.modificarPersona(pers);
             
             response.sendRedirect("index.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
