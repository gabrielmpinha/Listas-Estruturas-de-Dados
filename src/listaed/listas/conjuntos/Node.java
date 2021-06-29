package listaed.listas.conjuntos;

public class Node {

    private Node p;
    private String e;

    public Node(String e){
        this.e = e;
    }

    public Node getP() {
        return p;
    }

    public void setP(Node p) {
        this.p = p;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }
}
