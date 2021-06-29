package listaed.fila.reverternelementos;

public class FilaDinamica {

    private int tamanho;
    private NoFila primeiro;
    private NoFila ultimo;

    public FilaDinamica(){
        tamanho = 0;
    }

    public void reverterFila(int n) {

        int[] fila = new int[tamanho];
        for(int i = 0; i < fila.length; i++){ //COLOCA TODOS OS ELEMENTOS DA FILA(E REMOVE DELA) NUM ARRAY
            fila[i] = dequeue();
        }

        for(int i = n-1; i >= 0; i--){ //COLOCA OS INVERTIDOS NA FILA
            add(fila[i]);
        }
        for(int i = n; i < fila.length; i++){//COLOCA OS OUTROS NA FILA
            add(fila[i]);
        }

    }

    public void add(int value){
        NoFila temp = new NoFila(value);
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
    public int dequeue(){
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
