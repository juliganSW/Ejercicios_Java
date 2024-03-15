

<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <%
        Persona per=(Persona)request.getSession().getAttribute("persona");
        %>
        <h1>Datos de la Persona a Modificar</h1>
        <form action="SvModificar" method="POST">
            <p><label>Id:</label><input type="text" value="<%=per.getId()%>" readonly="readonly"  name= "id"></p>
            <p><label> Dni:</label><input type="text" value= "<%=per.getDni()%>" name= "dni"></p>
            <p><label>Nombre:</label><input type="text" value="<%=per.getNombre()%>" name= "nombre"></p>
            <p><label> Apellido:</label><input type="text" value="<%=per.getApellido()%>" name="apellido"></p>
            <p><label> Telefono:</label><input type="text" value="<%=per.getTelefono()%>" name= "telefono"></p>
            <button type="submit"> Enviar</button>
            </form>
        
    </body>
</html>
