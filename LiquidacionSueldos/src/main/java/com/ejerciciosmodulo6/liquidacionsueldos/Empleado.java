
package com.ejerciciosmodulo6.liquidacionsueldos;


public class Empleado {
int id=0;
String nombre;
String apellido;
String cargo;
int sueldo=0;

    public Empleado(int id, String nombre, String apellido, String cargo,int sueldo) {
     this.id=id;
     this.nombre = nombre;
     this.apellido = apellido;
     this.cargo = cargo;
     this.sueldo=sueldo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", sueldo=" + sueldo + '}';
    }
    
    


    
}
