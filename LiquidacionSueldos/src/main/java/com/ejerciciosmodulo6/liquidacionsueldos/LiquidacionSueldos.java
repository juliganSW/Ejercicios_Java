package com.ejerciciosmodulo6.liquidacionsueldos;

/*Una contadora encargada de la liquidación de sueldos de una empresa
desea realizar la actualización de sueldos de los empleados en base a una suba de salario 
planificada para el nuevo mes. 
Para almacenar cada empleado se tiene una tabla en una base de datos que contiene:
nombre, apellido, cargo y sueldo.
Realizar un programa que sea capaz de actualizar a $80.000 los sueldos de todos 
los empleados que tengan el cargo de “programador”.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiquidacionSueldos {

    public static void main(String[] args) {

        //para conectarse a la base de datos
        String user = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/empleadosej4";
        Connection con;
        Statement stmt;
        ResultSet rs;

        //variables de conexion/intentar conectar
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LiquidacionSueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //intento de actualizacion de sueldos en la BD
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();// stmt ejecuta conexion  
            // Seleccion de cargo programador
            stmt.executeUpdate("UPDATE empleado SET sueldo=80000 WHERE cargo= 'programador'");
            rs = stmt.executeQuery("SELECT * FROM empleado");
            //Se define la lista actualizada de empleados para mostrar 
            List<Empleado> listaEmpleados = new ArrayList<>();
            //que vaya al siguiente registro 
            rs.next();

            do {
                // Se hace una instancia de la clase Empleado y solicita los datos de la BD
                Empleado em;
                em = new Empleado(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("cargo"), rs.getInt("sueldo"));
                listaEmpleados.add(em);
                //Mientras haya empleados los agrega a la lista
            } while (rs.next());
            //recorre e imprime la lista ya actualizada
            for (Empleado em : listaEmpleados) {
                System.out.println(em.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(LiquidacionSueldos.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
