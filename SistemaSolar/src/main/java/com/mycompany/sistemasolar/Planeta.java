package com.mycompany.sistemasolar;

/**
 * Interfaz que define los métodos que debe tener un planeta
 */
public interface Planeta {
    
    double calcularAnio();
    String getNombre();
    double getTamanio();
    double getDistanciaAlSol();
    int getNumeroLunas();
    String getTipo();
    void mostrarInfo();
}
