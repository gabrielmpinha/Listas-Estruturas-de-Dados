package listaed.pilhas.gabarito;


public class Pilha {

    private int tamanho;
    private NoPilha topo;

    public Pilha(){
        tamanho = 0;
    }

    public void push(Character elemento){
        NoPilha novo = new NoPilha(elemento);
        if(size() != 0) {
            novo.setP(topo);
        }
        topo = novo;
        tamanho++;
    }

    public Character pop(){
        Character temp = null;
        if(tamanho != 0){
            temp = topo.getE();
            topo = topo.getP();
            tamanho--;
        }
        return temp;
    }

    public Character top(){
        Character temp = null;
        if(tamanho != 0){
            temp = topo.getE();
        }
        return temp;
    }

    public int size(){
        return tamanho;
    }

}
