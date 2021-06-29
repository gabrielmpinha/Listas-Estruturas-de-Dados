package listaed.hashmapgrafos1.grafoexplicito;

public class NoLista<T> {

    private NoLista p;
    private NoLista a;
    private T e;

    public NoLista(T e){
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

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }
}
