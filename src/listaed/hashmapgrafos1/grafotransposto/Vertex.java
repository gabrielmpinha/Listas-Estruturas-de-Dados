package listaed.hashmapgrafos1.grafotransposto;

public class Vertex<T extends Comparable<T>> implements Comparable<Vertex<T>> {

    private T valor;

    public Vertex(T valor){
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public int compareTo(Vertex o) {
        return valor.compareTo((T)o.getValor());
    }
}
