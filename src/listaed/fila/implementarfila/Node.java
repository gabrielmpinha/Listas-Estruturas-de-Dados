package listaed.fila.implementarfila;

public class Node<T> {

    private T e;
    private Node p;

    public Node(T e) {
        this.e = e;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }

    public Node getP() {
        return p;
    }

    public void setP(Node p) {
        this.p = p;
    }
}
