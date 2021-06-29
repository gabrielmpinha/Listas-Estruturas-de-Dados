package listaed.fila.inverter;

public class Node {
    private String e;
    private Node p;

    public Node(String e){
        this.e = e;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public Node getP() {
        return p;
    }

    public void setP(Node p) {
        this.p = p;
    }
}
