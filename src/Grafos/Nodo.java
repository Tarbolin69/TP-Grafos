package Grafos;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
    /*
    1 A Viedma:
    2 B Ushuaia:
    3 C Santiago del Estero:
    4 D Santa Rosa:
    5 E Santa Fe:
    6 F San Salvador de Jujuy:
    7 G San Miguel de Tucumán:
    8 H San Luis:
    9 I San Juan:
    10 J San Fernando del Valle de Catamarca:
    11 K Salta:
    12 L Río Gallegos:
    13 M Resistencia:
    14 N Rawson:
    15 O Posadas:
    16 P Paraná:
    17 Q Neuquén:
    18 R Mendoza:
    19 S La Rioja:
    20 T La Plata:
    21 U Formosa:
    22 V Corrientes:
    23 W Córdoba:
    24 X BSAS:
     */
    private String nombre;
    private List<Flecha> flechas;

    public Nodo (String nombre) {
        this.nombre = nombre;
        this.flechas = new ArrayList<>();
    }

    public void addFlecha (Nodo nodoDestino, int aristaPeso) {
        Flecha flecha = new Flecha(nodoDestino, aristaPeso);
        this.flechas.add(flecha);
    }

    public List<Flecha> getFlechas() {
        return flechas;
    }

    public String getNombre() {
        return nombre;
    }
}
