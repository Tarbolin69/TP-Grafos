package Grafos;

public class Flecha {
    private Nodo nodoDestino;
    private int aristaPeso;

    public Flecha(Nodo nodoDestino, int aristaPeso) {
        this.nodoDestino = nodoDestino;
        this.aristaPeso = aristaPeso;
    }

    public int getAristaPeso() {
        return aristaPeso;
    }

    public Nodo getNodoDestino() {
        return nodoDestino;
    }
}
