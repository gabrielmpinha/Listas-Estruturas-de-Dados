package listaed.pilhas.uniao;

public class Stack {

    private int tamanho;
    private NoPilha topo;

    public Stack(){
        tamanho = 0;
    }

    public void push(String elemento){
       NoPilha novo = new NoPilha(elemento);
        if(!isEmpty()) {
            novo.setP(topo);
        }
        topo = novo;
        tamanho++;
    }

    public String pop(){
        String temp = null;
        if(!isEmpty()){
            temp = topo.getE();
            topo = topo.getP();
            tamanho--;
        }
        return temp;
    }

    public String peek(){
        String temp = null;
        if(!isEmpty()){
            temp = topo.getE();
        }
        return temp;
    }

    public int size(){
        return tamanho;
    }

    public String toString(){
        String r = "";
        NoPilha temp = topo;
        while (temp != null){
            r = r + temp.getE() + " ";
            temp = temp.getP();
        }

        return r;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

}
