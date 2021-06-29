package listaed.pilhas.adega;


public class Pilha<T> {

    private int tamanho;
    private Node<T> topo;

    public Pilha(){
        tamanho = 0;
    }

    public void push(T elemento){
        Node<T> novo = new Node(elemento);
        if(!isEmpty()) {
            novo.setP(topo);
        }
        topo = novo;
        tamanho++;
    }

    public T pop(){
        T temp = null;
        if(!isEmpty()){
            temp = topo.getE();
            topo = topo.getP();
            tamanho--;
        }
        return temp;
    }

    public T top(){
        T temp = null;
        if(!isEmpty()){
            temp = topo.getE();
        }
        return temp;
    }

    public int size(){
        return tamanho;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

}
