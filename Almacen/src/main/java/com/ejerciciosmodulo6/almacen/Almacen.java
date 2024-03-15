/*Una despensa de un barrio desea realizar el alta de sus diferentes productos
a una base de datos. Para ello, tiene una tabla creada en su base de datos, 
llamada productos. 
A partir de esto desea poder solicitar por teclado cada uno de los elementos de un producto:
código, nombre, marca, precio, cantidad_stock y guardarlos en la correspondiente tabla. 
Utilizar para ello la tecnología JDBC y la correspondiente consulta SQL.*/

package com.ejerciciosmodulo6.almacen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Almacen {

    public static void main(String[] args) {

        String user = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/productosej1";
        Connection con;
        Statement stmt;
        ResultSet rs;
        
        int codigo=0;
        String nombre = "";
        String marca = "";
        double precio = 0;
        int cantidad_stock = 0;
        boolean salida = false;

        Scanner teclado = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(url, user ,clave);
            stmt = con.createStatement();
            while(!salida) {
                System.out.println("ingrese nombre del producto( o ingrese 0 para salir ): ");
                String nombre1 = teclado.nextLine();
                if (nombre1.equals("0")) {
                    salida = true;
                } else {
                    nombre="'"+nombre1 +"'";
                    System.out.println("ingrese codigo del producto: ");
                    codigo=teclado.nextInt();
                    String bashura=teclado.nextLine();
                    
                    System.out.println("ingrese la marca del producto: ");
                    String marca1=teclado.nextLine();
                    marca="'"+marca1 +"'";
                    System.out.println("ingrese el precio del producto: ");
                    precio=teclado.nextDouble();
                    System.out.println("Ingrese stock del producto: ");
                    cantidad_stock=teclado.nextInt();
                   String basura=teclado.nextLine();
                    
                    stmt.executeUpdate("INSERT INTO productos VALUES ("+codigo+" ,"+nombre+", "+marca+", "+precio+", "+cantidad_stock+");");
                }
            }
                     }catch (SQLException ex){
                        Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE,null, ex) ;  
                             
                     }
      


        
        
            }

        }

    


