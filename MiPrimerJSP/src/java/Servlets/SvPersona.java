/*
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvPersona", urlPatterns = {"/SvPersona"})
public class SvPersona extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        }
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
     String dni= request.getParameter("dni");// traeme el parametro de la request dni y guardalo en la variable dni
     String nombre= request.getParameter("nombre");
     String apellido= request.getParameter("apellido");
     String telefono= request.getParameter("telefono");
     // todos los valores que los lee de la interfaz gráfica los guarda en las variables
     
        System.out.println("dni: "+ dni);
        System.out.println("nombre: "+ nombre);
        System.out.println("apellido: "+ apellido);
        System.out.println("telefono: "+ telefono);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
