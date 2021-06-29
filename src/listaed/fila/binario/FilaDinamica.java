package listaed.fila.binario;

public class FilaDinamica<T> {

    private int tamanho;
    private NoFila primeiro;
    private NoFila ultimo;

    public FilaDinamica(){
        this.tamanho = 0;
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

    public void inserir(T e){

        NoFila temp = new NoFila(e);
            if (primeiro == null) {
                primeiro = temp;
                ultimo = temp;
            }
            else{
                ultimo.setP(temp);
                ultimo = ultimo.getP();
            }
            tamanho++;
    }

    public String print(){
        String fila = "";
        NoFila temp = primeiro;
        while (temp != null){
            fila = fila + temp.getE() + " ";
            temp = temp.getP();
        }
        System.out.println(fila);
        return fila;
    }

}
