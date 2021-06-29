package listaed.fila.binario;

public class NoFila<T> {
    private T e;
    private NoFila p;

    public NoFila(T e) {
        this.e = e;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }

    public NoFila getP() {
        return p;
    }

    public void setP(NoFila p) {
        this.p = p;
    }
}
