import Grafos.Grafo;

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
        int[] CIUDADES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        int GRAFO_LARGO = CIUDADES.length;
        Grafo grafoArgentina = new Grafo(GRAFO_LARGO);
    }
}