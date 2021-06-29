package listaed.fila.inverter;

public class Result {

    public static Queue invertQueue(String input) {
        String[] dados = input.split(" ");
        Queue fila = new Queue();
        for(int i = 0; i < dados.length; i++){//COLOCA NA FILA NA ORDEM DADA
            fila.enqueue(dados[i]);
        }

        for(int i = dados.length-1; i >= 0; i--){//REMOVE DA LISTA E COLOCA NO ARRAY AO CONTRARIO
            dados[i] = fila.dequeue();
        }

        for (int i = 0; i < dados.length; i++){//COLOCA NA FILA DENOVO
            fila.enqueue(dados[i]);
        }
        return fila;
    }

}
