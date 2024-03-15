
package com.ejerciciosmodulo6.youtuber;


public class Video {
     int id =0;
     int codigo=0;
     String nombre="";
     String marca="";
     double precio=0;
     int cantidad_stock=0;
   


    public Video() {
    }

    public Video( int id ,int codigo, String nombre, String marca, double precio, int cantidad_stock) {
        this.id= id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad_stock = cantidad_stock;
    }

    public void setId(int id) {
        this.id = id;
    }
      public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   public void setCantidad_stock(int cantidad_stock) {
        this.cantidad_stock = cantidad_stock;
    }

    public int getId() {
        return id;
    }
     public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

   

    public int getCantidad_stock() {
        return cantidad_stock;
    }

    @Override
    public String toString() {
        return "Video{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", cantidad_stock=" + cantidad_stock + '}';
    }

   

  
    
}
