package Grafos;

import java.util.*;

public class Grafo {
    /*
        A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X
  01 A[[0, 8, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 2],
  02 B [8, 0, 7, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  03 C [0, 7, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1],
  04 D [6, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  05 E [0, 0, 0, 8, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1],
  06 F [0, 0, 0, 0, 4, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  07 G [0, 0, 0, 0, 0, 6, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  08 H [0, 0, 0, 0, 0, 0, 5, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  09 I [0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2],
  10 J [0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  11 K [0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  12 L [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0],
  13 M [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0],
  14 N [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0],
  15 O [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2],
  16 P [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 5, 0, 0, 0],
  17 Q [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 5, 0, 0],
  18 R [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0],
  19 S [3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0],
  20 T [0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0],
  21 U [0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0],
  22 V [0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0],
  23 W [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0],
  24 X [2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]]
     */
    private List<Nodo> nodos;

    public Grafo(List<String> nodoNombres, List<List<Integer>> listaAdyacencia) {
        this.nodos = new ArrayList<>();
        for (String nodoNombre : nodoNombres) {
            nodos.add(new Nodo(nodoNombre));
        }
        for (int i = 0; i < listaAdyacencia.size(); i++) {
            for (int j = 0; j < listaAdyacencia.get(i).size(); j++) {
                int x = listaAdyacencia.get(i).get(j);
                if (x != 0) {
                    nodos.get(i).addFlecha(nodos.get(j), x);
                }
            }
        }
    }

    public Map<Nodo, Integer> dijkstra(Nodo raiz) {
        Map<Nodo, Integer> distancias = new HashMap<>();
        PriorityQueue<Nodo> cola = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

        for (Nodo nodo : nodos) {
            distancias.put(nodo, Integer.MAX_VALUE);
        }

        distancias.put(raiz, 0);
        cola.add(raiz);

        while (!cola.isEmpty()) {
            Nodo u = cola.poll();

            for (Flecha flecha : u.getFlechas()) {
                Nodo v = flecha.getNodoDestino();
                int peso = flecha.getAristaPeso();
                int distanciaU = distancias.get(u);
                int distanciaV = distancias.get(v);

                if (distanciaU + peso < distanciaV) {
                    cola.remove(v);
                    distancias.put(v, distanciaU + peso);
                    cola.add(v);
                }
            }
        }
        System.out.println("Camino mas corto desde BSAS" + raiz.getNombre() + ":");
        for (Nodo nodo : distancias.keySet()) {
            System.out.println(nodo.getNombre() + ": " + distancias.get(nodo));
        }
        return distancias;
    }

    public void mostrarGrafo() {
        for (Nodo nodo : nodos) {
            System.out.println(nodo.getNombre() + ":");
            for (Flecha flecha : nodo.getFlechas()) {
                System.out.println(" * " + nodo.getNombre() + " -> " + flecha.getNodoDestino().getNombre() + ": " + flecha.getAristaPeso() + "hs");
            }
        }
    }

    public List<Nodo> getNodos() {
        return nodos;
    }
}
