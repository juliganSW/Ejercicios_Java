
/*Una fabricadora de bijouterie desea realizar un sorteo para su página de Instagram.
Para ello, había almacenado manualmente en una base de datos todas sus clientes que habían comentado la publicación.
Sin embargo, se dio cuenta que varios no habían cumplido con las condiciones del sorteo, 
por lo cual desea eliminarlos. 
Cada cliente tiene los datos: nombre, apellido, edad, compartió y comento. 
Donde los atributos compartió y comento pueden contener los valores si o no.
Realizar un programa que sea capaz de eliminar de la base de datos todos 
los clientes cuyos campos compartió y/o comento contengan un no. 
Luego de hacer la eliminación, traer todos los clientes en una lista
y mostrarlos por pantalla. Utilizar para esto la tecnología JDBC.*/
package com.ejerciciosmodulo6.bijouterie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bijouterie {

    public static void main(String[] args) {
        //para conectarse a la base
        String user = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/productosej1";
        Connection con;
        Statement stmt;
        ResultSet rs;
        //variables de conexion
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bijouterie.class.getName()).log(Level.SEVERE, null, ex);
        }
        //intento de borrar en la BD
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();// stmt ejecuta conexion  
            //borra clientes que no compartieron o no comentaron             
            stmt.executeUpdate("DELETE FROM clientes WHERE compartio=0 OR comento=0");
            rs = stmt.executeQuery("SELECT * FROM clientes");
            //Se declara  un arreglo    
            List<Clientes> listaClientes = new ArrayList<>();
            // que vaya al siguiente registro 
            rs.next();
            //recorrer los registros
            do {
                //Hacemos una instancia de Clientes y carga de datos tomados de la lectura 
                Clientes cli;
                cli = new Clientes(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("edad"), rs.getBoolean("compartio"), rs.getBoolean("comento"));
                listaClientes.add(cli);
                //Mientras haya clientes los agrega a la lista
            } while (rs.next());
            for (Clientes cli : listaClientes) {
                System.out.println(cli.toString());
            }
            }catch(SQLException ex)  {
               Logger.getLogger(Bijouterie.class.getName()).log(Level.SEVERE, null, ex);
       
        

    }
}
}