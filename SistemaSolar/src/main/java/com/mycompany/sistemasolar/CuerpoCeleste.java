package com.mycompany.sistemasolar;

/**
 * CLASE ABSTRACTA CUERPOCELESTE
 * Base para todos los cuerpos celestes (planetas)
 * @author Persona 1
 */
public abstract class CuerpoCeleste {
    
    // Atributos comunes
    protected String nombre;
    protected double tamanio;
    protected double distanciaAlSol;
    
    // Constructor
    public CuerpoCeleste(String nombre, double tamanio, double distanciaAlSol) {
        this.nombre = nombre;
        this.tamanio = (tamanio < 0) ? 0 : tamanio;
        this.distanciaAlSol = (distanciaAlSol < 0) ? 0 : distanciaAlSol;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getTamanio() {
        return tamanio;
    }
    
    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }
    
    // Setters con validación
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTamanio(double tamanio) {
        if (tamanio >= 0) {
            this.tamanio = tamanio;
        }
    }
    
    public void setDistanciaAlSol(double distanciaAlSol) {
        if (distanciaAlSol >= 0) {
            this.distanciaAlSol = distanciaAlSol;
        }
    }
    
    // Métodos de comparación
    public boolean esMasGrandeQue(CuerpoCeleste otro) {
        return this.tamanio > otro.tamanio;
    }
    
    public boolean estaMasLejosQue(CuerpoCeleste otro) {
        return this.distanciaAlSol > otro.distanciaAlSol;
    }
    
    // Método abstracto (las clases hijas deben implementarlo)
    public abstract void mostrarInfo();
}
