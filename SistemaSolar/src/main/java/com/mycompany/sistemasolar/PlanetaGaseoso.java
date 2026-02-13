package com.mycompany.sistemasolar;

/**
 * Clase que representa un planeta gaseoso
 */
public class PlanetaGaseoso extends CuerpoCeleste implements Planeta {

    private int numeroLunas;
    private boolean tieneAnillos;

    // Constructor
    public PlanetaGaseoso(String nombre, double tamanio, double distanciaAlSol, 
                          int numeroLunas, boolean tieneAnillos) {
        super(nombre, tamanio, distanciaAlSol);
        this.numeroLunas = numeroLunas;
        this.tieneAnillos = tieneAnillos;
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
        return "Gaseoso";
    }

    public boolean isTieneAnillos() {
        return tieneAnillos;
    }

    public void setTieneAnillos(boolean tieneAnillos) {
        this.tieneAnillos = tieneAnillos;
    }

    public void setNumeroLunas(int numeroLunas) {
        this.numeroLunas = numeroLunas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n--- Planeta Gaseoso ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tamaño: " + tamanio + " km");
        System.out.println("Distancia al Sol: " + distanciaAlSol + " UA");
        System.out.println("Lunas: " + numeroLunas);
        System.out.println("Tiene anillos: " + (tieneAnillos ? "Si" : "No"));
        System.out.println("Año: " + calcularAnio() + " años terrestres");
    }
}
