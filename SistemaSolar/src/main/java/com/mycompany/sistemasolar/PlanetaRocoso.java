package com.mycompany.sistemasolar;

/**
 * Clase que representa un planeta rocoso
 */
public class PlanetaRocoso extends CuerpoCeleste implements Planeta {

    private int numeroLunas;
    private String composicion;

    // Constructor
    public PlanetaRocoso(String nombre, double tamanio, double distanciaAlSol, 
                         int numeroLunas, String composicion) {
        super(nombre, tamanio, distanciaAlSol);
        this.numeroLunas = numeroLunas;
        this.composicion = composicion;
    }

    // Calcula el año del planeta usando la distancia al sol
    // Formula: distancia elevada a 1.5 (Ley de Kepler)
    @Override
    public double calcularAnio() {
        return Math.pow(distanciaAlSol, 1.5);
    }

    @Override
    public int getNumeroLunas() {
        return numeroLunas;
    }

    @Override
    public String getTipo() {
        return "Rocoso";
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public void setNumeroLunas(int numeroLunas) {
        this.numeroLunas = numeroLunas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n--- Planeta Rocoso ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tamaño: " + tamanio + " km");
        System.out.println("Distancia al Sol: " + distanciaAlSol + " UA");
        System.out.println("Lunas: " + numeroLunas);
        System.out.println("Composicion: " + composicion);
        System.out.println("Año: " + calcularAnio() + " años terrestres");
    }
}
