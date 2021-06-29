package listaed.fila.inverter;

public class Queue {

    private int tamanho;
    private Node primeiro;
    private Node ultimo;

    public Queue(){
        tamanho = 0;
    }

    public void enqueue(String value){
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
    public String dequeue(){
        String removido = null;
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

    public String imprimirFila(){
        String fila = "";
        Node temp = primeiro;
        while (temp != null){
            fila = fila + temp.getE() + " ";
            temp = temp.getP();
        }
        return fila;
    }


    public boolean isEmpty() {
        return tamanho==0;
    }
}
