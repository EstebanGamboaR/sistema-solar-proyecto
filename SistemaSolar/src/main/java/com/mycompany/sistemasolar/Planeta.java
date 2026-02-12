package com.mycompany.sistemasolar;

/**
 * INTERFAZ PLANETA
 * Define QUÉ métodos debe tener un planeta (el contrato)
 * @author Persona 1
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
