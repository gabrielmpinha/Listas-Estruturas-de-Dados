package listaed.pilhas.textosequencial;

public class Pilha {

    private int tamanho;
    private NoPilha topo;

    public Pilha(){
        tamanho = 0;
    }

    public void push(String elemento) {
        NoPilha novo = new NoPilha(elemento);
        if (!isEmpty()){
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

    public String top(){
        String temp = null;
        if(!isEmpty()){
            temp = topo.getE();
        }
        return temp;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public void print(){
        NoPilha temp = topo;
        String r = "Topo";
        while (temp != null){
            r = r + "->" + temp.getE();
            temp = temp.getP();
        }
        System.out.println(r);
    }


}
