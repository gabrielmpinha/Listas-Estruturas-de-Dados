package listaed.fila.mdc;

public class Fila {

    private int tamanho;
    private Node primeiro;
    private Node ultimo;

    public Fila(){
        tamanho = 0;
    }

    public void add(int value){
        Node temp = new Node(value);
        if(tamanho == 0){
            primeiro = temp;
            ultimo = temp;
        }
        else{
            ultimo.setP(temp);
            ultimo = ultimo.getP();
        }
        tamanho++;
    }
    public int remove(){
        Integer removido = null;
        if(tamanho > 0){
            removido = primeiro.getE();
            primeiro = primeiro.getP();
            tamanho--;
            if (tamanho==0){
                ultimo = null;
            }
        }
        return removido;
    }

    public Integer peek(){
        Integer prox = null;
        if(tamanho != 0)
            prox = primeiro.getE();
        return prox;
    }

}
