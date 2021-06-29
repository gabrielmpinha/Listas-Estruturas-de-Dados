package listaed.pilhas.parenteses;

public class Pilha {

    private int tamanho;
    private NoPilha topo;

    public Pilha(){
        tamanho = 0;
    }

    public void push(Character elemento){
        NoPilha novo = new NoPilha(elemento);
        if(!isEmpty()) {
            novo.setP(topo);
        }
        topo = novo;
        tamanho++;
    }

    public Character pop(){
        Character temp = null;
        if(!isEmpty()){
            temp = topo.getE();
            topo = topo.getP();
            tamanho--;
        }
        return temp;
    }

    public Character top(){
        Character temp = null;
        if(!isEmpty()){
            temp = topo.getE();
        }
        return temp;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

}
