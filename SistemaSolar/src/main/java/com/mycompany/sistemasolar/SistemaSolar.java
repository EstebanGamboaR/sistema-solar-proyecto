package com.mycompany.sistemasolar;

import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 * Clase principal del sistema solar
 */
public class SistemaSolar {
    
    private static ArrayList<Planeta> planetas = new ArrayList<>();

    public static void main(String[] args) {

        // Agregar los planetas del sistema solar
        planetas.add(new PlanetaRocoso("Mercurio", 4879, 0.39, 0, "Hierro"));
        planetas.add(new PlanetaRocoso("Venus", 12104, 0.72, 0, "Roca"));
        planetas.add(new PlanetaRocoso("Tierra", 12742, 1.0, 1, "Silicato"));
        planetas.add(new PlanetaRocoso("Marte", 6779, 1.52, 2, "Oxido de Hierro"));
        
        planetas.add(new PlanetaGaseoso("Jupiter", 139820, 5.2, 79, true));
        planetas.add(new PlanetaGaseoso("Saturno", 116460, 9.5, 83, true));
        planetas.add(new PlanetaGaseoso("Urano", 50724, 19.2, 27, true));
        planetas.add(new PlanetaGaseoso("Neptuno", 49244, 30.1, 14, true));

        // Menu principal
        boolean continuar = true;
        while (continuar) {
            String menu = "=== SISTEMA SOLAR ===\n\n"
                    + "1. Mostrar todos los planetas\n"
                    + "2. Buscar planeta\n"
                    + "3. Comparar dos planetas\n"
                    + "4. Ordenar por tamaño\n"
                    + "5. Ordenar por distancia\n"
                    + "6. Planeta mas grande\n"
                    + "7. Planeta mas lejano\n"
                    + "0. Salir\n\n"
                    + "Seleccione una opcion:";

            String opcion = JOptionPane.showInputDialog(menu);

            if (opcion == null || opcion.equals("0")) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Adios!");
            } else {
                procesarOpcion(opcion);
            }
        }
    }

    // Procesa la opcion del menu
    private static void procesarOpcion(String opcion) {
        switch (opcion) {
            case "1":
                mostrarTodos();
                break;
            case "2":
                buscarPlaneta();
                break;
            case "3":
                compararPlanetas();
                break;
            case "4":
                ordenarPorTamanio();
                break;
            case "5":
                ordenarPorDistancia();
                break;
            case "6":
                planetaMasGrande();
                break;
            case "7":
                planetaMasLejano();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
        }
    }

    // Muestra todos los planetas
    private static void mostrarTodos() {
        String resultado = "PLANETAS DEL SISTEMA SOLAR\n\n";
        for (Planeta p : planetas) {
            resultado += p.getNombre() + " - " + p.getTipo() + " - " 
                      + p.getTamanio() + " km\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    // Busca un planeta por nombre
    private static void buscarPlaneta() {
        String nombre = JOptionPane.showInputDialog("Nombre del planeta:");
        if (nombre != null) {
            for (Planeta p : planetas) {
                if (p.getNombre().equalsIgnoreCase(nombre)) {
                    String info = "Nombre: " + p.getNombre() + "\n"
                            + "Tipo: " + p.getTipo() + "\n"
                            + "Tamaño: " + p.getTamanio() + " km\n"
                            + "Distancia: " + p.getDistanciaAlSol() + " UA\n"
                            + "Lunas: " + p.getNumeroLunas() + "\n"
                            + "Año: " + p.calcularAnio() + " años terrestres";
                    JOptionPane.showMessageDialog(null, info);
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Planeta no encontrado");
        }
    }

    // Compara dos planetas
    private static void compararPlanetas() {
        String nombre1 = JOptionPane.showInputDialog("Primer planeta:");
        String nombre2 = JOptionPane.showInputDialog("Segundo planeta:");

        Planeta p1 = buscarPorNombre(nombre1);
        Planeta p2 = buscarPorNombre(nombre2);

        if (p1 != null && p2 != null) {
            String resultado = "COMPARACION\n\n";
            
            // Comparar tamaño
            if (p1.getTamanio() > p2.getTamanio()) {
                resultado += p1.getNombre() + " es mas grande\n";
            } else {
                resultado += p2.getNombre() + " es mas grande\n";
            }
            
            // Comparar distancia
            if (p1.getDistanciaAlSol() > p2.getDistanciaAlSol()) {
                resultado += p1.getNombre() + " esta mas lejos del Sol\n";
            } else {
                resultado += p2.getNombre() + " esta mas lejos del Sol\n";
            }
            
            // Comparar lunas
            resultado += "\nLunas:\n";
            resultado += p1.getNombre() + ": " + p1.getNumeroLunas() + "\n";
            resultado += p2.getNombre() + ": " + p2.getNumeroLunas();
            
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Planeta no encontrado");
        }
    }

    // Ordena los planetas por tamaño
    private static void ordenarPorTamanio() {
        ArrayList<Planeta> ordenados = new ArrayList<>(planetas);
        ordenados.sort(Comparator.comparingDouble(Planeta::getTamanio).reversed());

        String resultado = "PLANETAS ORDENADOS POR TAMAÑO\n\n";
        int pos = 1;
        for (Planeta p : ordenados) {
            resultado += pos + ". " + p.getNombre() + " - " + p.getTamanio() + " km\n";
            pos++;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    // Ordena los planetas por distancia al sol
    private static void ordenarPorDistancia() {
        ArrayList<Planeta> ordenados = new ArrayList<>(planetas);
        ordenados.sort(Comparator.comparingDouble(Planeta::getDistanciaAlSol));

        String resultado = "PLANETAS ORDENADOS POR DISTANCIA\n\n";
        int pos = 1;
        for (Planeta p : ordenados) {
            resultado += pos + ". " + p.getNombre() + " - " + p.getDistanciaAlSol() + " UA\n";
            pos++;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    // Encuentra el planeta mas grande
    private static void planetaMasGrande() {
        Planeta masGrande = planetas.get(0);
        for (Planeta p : planetas) {
            if (p.getTamanio() > masGrande.getTamanio()) {
                masGrande = p;
            }
        }
        JOptionPane.showMessageDialog(null, 
                "Planeta mas grande: " + masGrande.getNombre() + 
                "\nTamaño: " + masGrande.getTamanio() + " km");
    }

    // Encuentra el planeta mas lejano
    private static void planetaMasLejano() {
        Planeta masLejano = planetas.get(0);
        for (Planeta p : planetas) {
            if (p.getDistanciaAlSol() > masLejano.getDistanciaAlSol()) {
                masLejano = p;
            }
        }
        JOptionPane.showMessageDialog(null, 
                "Planeta mas lejano: " + masLejano.getNombre() + 
                "\nDistancia: " + masLejano.getDistanciaAlSol() + " UA");
    }

    // Busca un planeta por nombre
    private static Planeta buscarPorNombre(String nombre) {
        if (nombre != null) {
            for (Planeta p : planetas) {
                if (p.getNombre().equalsIgnoreCase(nombre)) {
                    return p;
                }
            }
        }
        return null;
    }
}
