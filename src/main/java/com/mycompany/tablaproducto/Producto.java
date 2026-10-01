// Morones Torres Jorge Arnulfo
package com.mycompany.tablaproducto;

/**
 *
 * @author jorgi
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private double peso;
    
    public Producto(){
    this.nombre = "";
    this.precio = 0.0;
    this.cantidad = 0;
    this.peso = 0;
}
    public Producto(String nombre, double precio, int cantidad, double peso){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.peso = peso;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    
}
