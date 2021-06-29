package listaed.pilhas.uniao;

public class NoPilha {
    private String e;
    private NoPilha p;

    public NoPilha(String e){
        this.e = e;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public NoPilha getP() {
        return p;
    }

    public void setP(NoPilha p) {
        this.p = p;
    }
}
