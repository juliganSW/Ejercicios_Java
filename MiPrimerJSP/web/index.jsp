

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Prueba</title>
    </head>
    <body>
        <h1>Datos de la persona</h1>
        <form action="SvPersona" method= "POST"><!--Se llama al Servlet y se usa método post porque es un alta-->
            <p><label> DNI:</label><input type="text" name: "dni"></input></p>
            <p><label>Nombre:</label><input type="text" name:"nombre"></input></p>
            <p><label> Apellido:</label><input type="text" name: "apellido"></input></p>
            <p><label> Telefono:</label><input type="text" name: "telefono"></input></p>
            <button type="submit"> Enviar</button><!-- Enviar manda una request al Servlet Persona-->
            </form>
        
        <h1> Ver listas de las personas</h1>
        <p>Si desea ver todoas las personas haga click en el boton mostrar personas</p>
        <form action="" method="">
            
            <button type="submit">Mostrar personas</button>
            </form>
            
        <h1>Eliminar personas</h1>
        <p>Ingrese el DNI de la persona a eliminar</p>
        <form action="" method="">
            <p><label>DNI:</label ><input type="text" name:"dni"></input></p>
            <button type="submit"> Elimiar</button>
            </form>
        
         

    </body>
</html>
