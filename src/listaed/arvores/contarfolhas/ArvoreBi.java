package listaed.arvores.contarfolhas;

public class ArvoreBi<T extends Comparable<T>> {

    private BinaryNode<T> raiz;
    private int quantidade;

    public ArvoreBi(){
        this.quantidade = 0;
    }

    public void inserir(T e){
        if(quantidade == 0){
            raiz = new BinaryNode<>(e);
        }else{
            BinaryNode aux = raiz;
            while(aux != null) {
                if (e.compareTo((T) aux.getInfo()) < 0) {
                    if(aux.getLeft() == null) {
                        aux.setLeft(new BinaryNode<>(e));
                        break;
                    }
                    else
                        aux = aux.getLeft();
                }else if(e.compareTo((T) aux.getInfo()) > 0){
                    if(aux.getRight() == null) {
                        aux.setRight(new BinaryNode<>(e));
                        break;
                    }
                    else
                        aux = aux.getRight();
                }else//quando ja existir na arvore
                    return;
            }
        }
        quantidade++;
    }


    public int contarFolhas(){
        return contarFolhas(raiz, 0);
    }

    private int contarFolhas(BinaryNode<T> no, int quant){
        if (no != null) {
            if(!isLeaf(no)) {
                return contarFolhas(no.getLeft(), quant) + contarFolhas(no.getRight(), quant);
            }
            else {
                return quant+1;
            }
        }
        return 0;
    }



    private boolean isLeaf(BinaryNode node){
        boolean r = false;
        if(node.getRight() == null && node.getLeft() == null)
            r = true;
        return r;
    }



}
