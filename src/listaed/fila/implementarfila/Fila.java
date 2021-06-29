package listaed.fila.implementarfila;

public class Fila<T> {

    private int tamanho;
    private int tamanhoMaximo;
    private Node primeiro;
    private Node ultimo;

    public Fila(int size){
        this.tamanho = 0;
        this.tamanhoMaximo = size;
    }

    public T remover(){
        T removido = null;
        if(tamanho > 0) {
            removido = (T) primeiro.getE();
            primeiro = primeiro.getP();
            tamanho--;
            if(tamanho == 0){
                ultimo = null;
            }
        }
        return removido;
    }

    public boolean inserir(T e){
        boolean r = false;
        if(tamanho < tamanhoMaximo) {
            Node temp = new Node(e);
            if (primeiro == null) {
                primeiro = temp;
                ultimo = temp;
            }
            else{
                ultimo.setP(temp);
                ultimo = ultimo.getP();
            }
            tamanho++;
            r = true;
        }
        return r;
    }

    public T peek(){
        T e = null;
        if(tamanho != 0)
            e = (T) primeiro.getE();
        return e;
    }

    public String imprimirFila(){
        String fila = "";
        Node temp = primeiro;
        while (temp != null){
            fila = fila + temp.getE() + " ";
            temp = temp.getP();
        }
        return fila;
    }

}
