package listaed.pilhas.gabarito;

public class NoPilha {

    private Character e;
    private NoPilha p;

    public NoPilha(Character e){
        this.e = e;
    }

    public Character getE() {
        return e;
    }

    public void setE(Character e) {
        this.e = e;
    }

    public NoPilha getP() {
        return p;
    }

    public void setP(NoPilha p) {
        this.p = p;
    }
}
