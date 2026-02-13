package com.mycompany.sistemasolar;

/**
 * Clase abstracta que representa un cuerpo celeste
 */
public abstract class CuerpoCeleste {
    
    // Atributos comunes
    protected String nombre;
    protected double tamanio;
    protected double distanciaAlSol;
    
    // Constructor
    public CuerpoCeleste(String nombre, double tamanio, double distanciaAlSol) {
        this.nombre = nombre;
        this.tamanio = (tamanio >= 0) ? tamanio : 0;
        this.distanciaAlSol = (distanciaAlSol >= 0) ? distanciaAlSol : 0;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getTamanio() {
        return tamanio;
    }
    
    public void setTamanio(double tamanio) {
        if (tamanio >= 0) {
            this.tamanio = tamanio;
        }
    }
    
    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }
    
    public void setDistanciaAlSol(double distanciaAlSol) {
        if (distanciaAlSol >= 0) {
            this.distanciaAlSol = distanciaAlSol;
        }
    }
    
    // Método para comparar tamaños
    public boolean esMasGrandeQue(CuerpoCeleste otro) {
        return this.tamanio > otro.tamanio;
    }
    
    // Método para comparar distancias
    public boolean estaMasLejosQue(CuerpoCeleste otro) {
        return this.distanciaAlSol > otro.distanciaAlSol;
    }
    
    // Método abstracto
    public abstract void mostrarInfo();
}
