package listaed.listas.invertida;

public class NoLista {

    private NoLista p;
    private NoLista a;
    private int e;

    public NoLista(int e){
        this.e = e;
    }

    public NoLista getA() {
        return a;
    }

    public void setA(NoLista a) {
        this.a = a;
    }

    public NoLista getP() {
        return p;
    }

    public void setP(NoLista p) {
        this.p = p;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }
}
