package listaed.fila.mdc;


public class Node {
    private int e;
    private Node p;

    public Node(int e){
        this.e = e;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public Node getP() {
        return p;
    }

    public void setP(Node p) {
        this.p = p;
    }
}
