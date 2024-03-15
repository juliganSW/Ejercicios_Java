
package com.ejerciciosmodulo6.almacen;


public class Producto {
         private     int código;
           private  String nombre;
          private   String marca;
          private  double precio;
         private   int cantidad_stock ;

    public Producto() {
    }

    public Producto(int código, String nombre, String marca, double precio, int cantidad_stock) {
        this.código = código;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad_stock = cantidad_stock;
    }

    public int getCódigo() {
        return código;
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

    public void setCódigo(int código) {
        this.código = código;
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

    @Override
    public String toString() {
        return "Producto{" + "c\u00f3digo=" + código + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", cantidad_stock=" + cantidad_stock + '}';
    }
         
         
    
}
