/*Crear una stack que permita objetos de tipo Autos, donde cada objeto auto debe tener:
num_patente, marca, modelo, color, chasis. 
Cargar la pila con 7 autos diferentes luego hacer lo siguiente:
a.Buscar un auto de color rojo.
b.Mostrar el auto que se encuentra en la cima de la pila.
c.Borrar el auto que se encuentra en la cima de la pila.
d.Agregar dos nuevos autos a la pila.
Recorrer la pila mostrando el nuevo contenido luego de las operaciones realizadas.*/
package coche;

import java.util.Stack;


public class Coche {
    String num_patente;
    String marca;
    String modelo;
    String color;
    int chasis;
    
    public Coche( String num_patente, String marca, String modelo, String color, int chasis){
        
        this.num_patente=num_patente;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.chasis=chasis;
    }
    
    public Coche(){
}
//getters
    public String getNum_patente(){
          return num_patente;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public int getChasis(){
        return chasis;
    }

    @Override
    public String toString() {
        return "Coche{" + "num_patente=" + num_patente + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", chasis=" + chasis + '}';
    }
    
    
    public static void main(String[] args) {
        //Se crea el Stack(pila) 
        Stack<Coche> pilaCoches= new Stack<>();
       
        //Se crean los elementos coches
        Coche coche1=new Coche("JKC456", "Ford","fiesta","rojo",245555 );
        Coche coche2=new Coche("FDV587", "Chevrolet","astra","azul",130214 );
        Coche coche3=new Coche("VTV123", "Renault","Duster","verde",547893 );
        //agregar coches creados y luego agregar mas usando push
        pilaCoches.push(coche1);
        pilaCoches.push(coche2);
        pilaCoches.push(coche3);
        pilaCoches.push(new Coche("PRO205", "Toyota", "corolla","blanco", 522412));
        pilaCoches.push(new Coche("JEP981", "VW", "vento","gris", 742581));
        
        // recorro la pila buscando un auto rojo. Si lo encuentra, imprimo
        for (Coche auto: pilaCoches){
        if(auto.getColor().equalsIgnoreCase("rojo")){
            System.out.println("el auto " + auto.getMarca()+ " "+ auto.getModelo()+ " es rojo");
        }
        }
        //muestro el elemento tope de la pila usando método peek de Stack
        System.out.println("El primer auto de la pila es: " + pilaCoches.peek());
        // borro el auto que se encuentra en la cima de la pila usando metodo  pop de Stack
        pilaCoches.pop();
        //agrego dos coches mas
        pilaCoches.push(new Coche("PRI541", "Toyota", "etios","bordo", 727545));
        pilaCoches.push(new Coche("MGR757", "Fiat", "cronos","plata", 620963));
        
        // recorro la pila nueva e imprimo
        System.out.println("La pila definitiva es: ");
        for (Coche auto: pilaCoches){
            System.out.println( auto.getMarca()+ " "+ auto.getModelo()+" "+
                    auto.getColor()+" "+auto.getNum_patente());
                    
        }
   }
    
}
