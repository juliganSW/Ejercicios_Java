
<%@page import="java.util.List"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Personas</title>
    </head>
    <body>
        <h1>Ver Personas</h1>
        
        <%
        //acá lo tenemos que traer en la sesion del usuario
        //hay que castear porque vuelve como objeto generico(se pone List entre paréntesis)
      List<Persona> listaPersonas=(List)request.getSession().getAttribute("listaPersonas");
     // Se comienza a recorrer la lista
      for(Persona per:listaPersonas){
       
        %>
       <p><b>Dni: </b><%=per.getDni()%></p>  
        <p><b>Nombre: </b><%=per.getNombre()%></p>  
        <p><b>Apellido: </b><%=per.getApellido()%></p>  
        <p><b>Telefono: </b><%=per.getTelefono()%></p>
        <p>---------------------------------------------</p>
        <%
            }
%>
    </body>
</html>
