package listaed.fila.reverternelementos;

public class NoFila {

    private int e;
    private NoFila p;

    public NoFila(int e){
        this.e = e;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public NoFila getP() {
        return p;
    }

    public void setP(NoFila p) {
        this.p = p;
    }
}
