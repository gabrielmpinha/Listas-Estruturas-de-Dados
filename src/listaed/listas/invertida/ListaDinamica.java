package listaed.listas.invertida;

public class ListaDinamica {

    private NoLista elemento;
    private NoLista fim;
    private int tamanho = 0;


    public void add(int numero){
        if(elemento == null){
            elemento = new NoLista(numero);
            fim = elemento;
        }else{
            NoLista temp = elemento;
            while (temp.getP() != null)
                temp = temp.getP();
            temp.setP(new NoLista(numero));
            temp.getP().setA(fim);
            fim = temp.getP();
        }
        tamanho++;
    }

    public void remover(NoLista removido){
        if(tamanho != 0){
            if(elemento == removido){
                elemento = elemento.getP();
                elemento.setA(null);
                tamanho--;
            }
            else{
                NoLista temp = elemento;
                while (temp.getP() != null){
                    if(temp.getP() == removido){
                        temp.getP().getP().setA(temp);
                        temp.setP(temp.getP().getP());
                        tamanho--;
                        break;
                    }else
                        temp = temp.getP();
                }
            }
        }
    }


    private void inverter(){
        if(tamanho > 1) {
            int c = 0;
            while (c < tamanho) {
                if (elemento != fim) {
                    elemento = fim;
                    c++;
                } else {
                    NoLista temp = elemento;
                    while (temp.getA() != null) {
                        temp.setP(temp.getA());
                        temp = temp.getA();
                        c++;
                    }
                }
            }
        }
    }

    private void excluirIguais(){
        if(tamanho > 1){
            int c1 = 0, c2 = 0;
            NoLista temp = elemento;
            NoLista temp2;
            while(c1 < tamanho){
                temp2 = temp;
                while(c2 < tamanho) {
                    if (temp.getE() == temp2.getE() && temp != temp2) {
                        remover(temp2);
                    }
                    else
                        c2++;
                    temp2=temp2.getP();
                }
                temp = temp.getP();
                c1++;
                c2=0;
            }

        }
    }

    public ListaDinamica listaNova() {

        inverter();
        excluirIguais();
        return this;
    }

    public void print(){
        String lista = "";
        NoLista temp = elemento;
        if(tamanho > 0) {
            for (int i = 0; i < tamanho; i++) {
                lista = lista + temp.getE() + " ";
                temp = temp.getP();
            }
        }
        System.out.println(lista);
    }

}
