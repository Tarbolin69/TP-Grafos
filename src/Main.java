import Grafos.Grafo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        "El entregable consiste en la entrega del link del repositorio GitHub con el proyecto
        y un informe describiendo cada una de las etapas del proyecto (diseño, justificación,
        pseudo-código, cálculo de la complejidad temporal)."

          - Informe
          - Repositorio con codigo
          - Diseño
          - Justificación
          - Pseudo-codigo
          - Complejidad temporal

        "Dado un Grafo G dirigido, cuyos nodos representan la ciudad de Buenos Aires y las
        ciudades capitales de las provincias de la Argentina, y las aristas entre esos nodos
        los tiempos de vuelo entre las ciudades. Implementar un algoritmo para determinar
        cuáles ciudades convienen ser alcanzadas desde la ciudad de Buenos Aires a través de
        otra ciudad, y no en forma directa. Suponer que el tiempo de demora de aterrizaje es
        despreciable. Calcular la complejidad temporal."

           - Grafo G dirigido (matriz de adyacencia)
           - Nodos (ciudad de Buenos Aires y capitales de provincias)
           - Aristas (tiempo de vuelo entre nodos (ciudades))

           Objectivo: Calcular camino mas corto entre BSAS y X sin ir directamente a X
         */

        List<List<Integer>> adyacencia = new ArrayList<>();
        adyacencia.add(Arrays.asList(0, 8, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 2));
        adyacencia.add(Arrays.asList(8, 0, 7, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 7, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1));
        adyacencia.add(Arrays.asList(6, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 8, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 4, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 6, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 5, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 5, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 5, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0));
        adyacencia.add(Arrays.asList(3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0));
        adyacencia.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0));
        adyacencia.add(Arrays.asList(2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));

        List<String> cuidades = new ArrayList<>();
        cuidades.add("Viedma");
        cuidades.add("Ushuaia");
        cuidades.add("Santiago del Estero");
        cuidades.add("Santa Rosa");
        cuidades.add("Santa Fe");
        cuidades.add("San Salvador de Jujuy");
        cuidades.add("San Miguel de Tucumán");
        cuidades.add("San Luis");
        cuidades.add("San Juan");
        cuidades.add("San Fernando del Valle de Catamarca");
        cuidades.add("Salta");
        cuidades.add("Río Gallegos");
        cuidades.add("Resistencia");
        cuidades.add("Rawson");
        cuidades.add("Posadas");
        cuidades.add("Paraná");
        cuidades.add("Neuquén");
        cuidades.add("Mendoza");
        cuidades.add("La Rioja");
        cuidades.add("La Plata");
        cuidades.add("Formosa");
        cuidades.add("Corrientes");
        cuidades.add("Córdoba");
        cuidades.add("BSAS");

        Grafo grafoArgentina = new Grafo(cuidades, adyacencia);
        // grafoArgentina.mostrarGrafo();
        grafoArgentina.dijkstra(grafoArgentina.getNodos().getLast());
    }
}