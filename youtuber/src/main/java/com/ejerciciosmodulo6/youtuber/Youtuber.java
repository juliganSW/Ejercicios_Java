/*Un youtuber posee almacenados en una tabla llamada videos dentro de una base de datos,
todos sus videos que ya fueron subidos a Youtube. 
Desea un programa que sea capaz de traer todos esos videos, almacenarlos en una lista
y mostrarlos luego por pantalla. Utilizar para ello la tecnología JDBC.*/

package com.ejerciciosmodulo6.youtuber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Youtuber {

    public static void main(String[] args) {
        //para conectarse a la base
        String user = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/productosej1";
        Connection con;
        Statement stmt;
        ResultSet rs;

        Scanner teclado = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Video.class.getName()).log(Level.SEVERE, null, ex);
        }
          //variables de conexion
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();// stmt ejecuta conexion
            //rs(record set o conjunto de registros) representa los registros de la tabla
            //Es decir, los registros de la consulta que se va a hacer  
            rs = stmt.executeQuery("SELECT * FROM productos");
            //Se declara  un arreglo    
            List<Video> listaVideos = new ArrayList<>();
            // que vaya al siguiente registro 
            rs.next();
            //recorrer los registros 
            do {
                Video vid=new Video(rs.getInt("id"), rs.getInt("codigo"), rs.getString("nombre"), rs.getString("marca"), rs.getDouble("precio"), rs.getInt("cantidad_stock"));
                listaVideos.add(vid);
            } while (rs.next());
            for (Video vid : listaVideos) {
                System.out.println(vid.toString());
            }
        } catch(SQLException ex)  {
            Logger.getLogger(Youtuber.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}


         
        
        
       
    

