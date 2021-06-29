package listaed.hashmapgrafos1.grafotransposto;

public class ImplementedList<T extends Comparable<T>>  {

    private NoLista<T> elemento;
    private NoLista<T> fim;
    private int tamanho = 0;


    public void add(T valor){
        if(elemento == null){
            elemento = new NoLista(valor);
            fim = elemento;
        }else{
            NoLista temp = elemento;
            while (temp.getP() != null)
                temp = temp.getP();
            temp.setP(new NoLista(valor));
            temp.getP().setA(fim);
            fim = temp.getP();
        }
        tamanho++;
    }

    public T get(int i){
        if(i > tamanho-1)
            return null;
        NoLista<T> aux = elemento;
        for(int j = 0; j < i; j++){
            aux = aux.getP();
        }
        return aux.getE();
    }

    public void set(int i, T objeto){

        NoLista<T> aux = elemento;
        for(int j = 0; j < size(); j++){

            if (j == i){
                aux.setE(objeto);
            }
            aux = aux.getP();
        }
    }

    public boolean contains(T e){
        boolean r = false;
        NoLista<T> temp = elemento;
        for(int i = 0; i < tamanho; i++){
            if(temp.getE().compareTo(e) == 0){
                r = true;
                break;
            }else{
                temp = temp.getP();
            }
        }
        return r;
    }

    public int size(){
        return tamanho;
    }

}
