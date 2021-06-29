package listaed.listas.cacaniquel;

public class ListaCircular {

    private No primeiroElemento;
    private No fim;
    private int tamanho;
    private No elementoSelecionado;

    public ListaCircular() {
        this.tamanho = 0;
        this.primeiroElemento = null;
        this.fim = null;
    }

    public void inserir(String tambor){
            int c = 1;
            if (primeiroElemento == null) {
                primeiroElemento = new No(tambor);
                fim = primeiroElemento;
                elementoSelecionado = primeiroElemento;
            } else {
                No temp = primeiroElemento;
                while (c < tamanho) {
                    temp = temp.getNext();
                    c++;
                }
                temp.setNext(new No(tambor));
                temp.getNext().setPrior(fim);
                fim = temp.getNext();
            }
            tamanho++;
        primeiroElemento.setPrior(fim);
        fim.setNext(primeiroElemento);
    }

    public void selecionarElemento(int deslocar){
        for(int i = 0; i < deslocar; i++){
            elementoSelecionado = elementoSelecionado.getNext();
        }
    }

    public String getElementoSelecionado(){
        return  elementoSelecionado.getData();
    }

    public void print(){
        String lista = "";
        No temp = primeiroElemento;
        if(tamanho > 0) {
            for (int i = 0; i < tamanho; i++) {
                lista = lista + temp.getData() + " ";
                temp = temp.getNext();
            }
        }
        System.out.println(lista);
    }
}
