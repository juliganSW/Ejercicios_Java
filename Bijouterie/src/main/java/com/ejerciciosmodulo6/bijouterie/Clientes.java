
package com.ejerciciosmodulo6.bijouterie;


class Clientes {
    int id=0;
    String nombre;       
    String apellido;
    int edad=0;
    boolean compartio=false;
    boolean comento=false;

    public Clientes( int i,String n, String a,int e, boolean co, boolean ce) {
    id= i;
    nombre = n;
    apellido = a;
    edad= e;
    compartio = co;
    comento = ce;
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

    public int getEdad() {
        return edad;
    }

    public boolean isCompartio() {
        return compartio;
    }

    public boolean isComento() {
        return comento;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCompartio(boolean compartio) {
        this.compartio = compartio;
    }

    public void setComento(boolean comento) {
        this.comento = comento;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", compartio=" + compartio + ", comento=" + comento + '}';
    }
    
    
            
            
            
            }