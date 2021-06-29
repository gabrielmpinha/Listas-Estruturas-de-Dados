package listaed.hashmapgrafos1.grafoexplicito;

public class Edges<T extends Comparable<T>> implements Comparable<Edges<T>> {

    private Vertex<T> origem, destino;

    public Edges(Vertex<T> origem, Vertex<T> destino){
        this.origem = origem;
        this.destino = destino;
    }

    public Vertex<T> getOrigem() {
        return origem;
    }

    public void setOrigem(Vertex<T> origem) {
        this.origem = origem;
    }

    public Vertex<T> getDestino() {
        return destino;
    }

    public void setDestino(Vertex<T> destino) {
        this.destino = destino;
    }

    @Override
    public int compareTo(Edges<T> o) {
        if(origem.compareTo(o.origem) == 0 && destino.compareTo(o.destino) == 0){
            return 0;
        }
        else
            return -1;
    }
}
