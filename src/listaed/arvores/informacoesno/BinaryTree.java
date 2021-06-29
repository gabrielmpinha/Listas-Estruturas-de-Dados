package listaed.arvores.informacoesno;

public class BinaryTree<T extends Comparable<T>> {

    private BinaryNode<T> raiz;
    private int quantidade;

    public BinaryTree(){
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

    public int isLeaf(T node){
        int r = -1;
        BinaryNode<T> aux = raiz;
        while(aux!=null){
            if(aux.getInfo().compareTo(node) == 0){
                r = isLeaf(aux)? 1:0;
                break;
            }else if(aux.getInfo().compareTo(node) < 0){
                aux = aux.getRight();
            }else{
                aux = aux.getLeft();
            }
        }
        return r;
    }

    private boolean isLeaf(BinaryNode node){
        boolean r = false;
        if(node.getRight() == null && node.getLeft() == null)
            r = true;
        return r;
    }

    public int profundidade(T node){
        int r = -1;
        BinaryNode<T> aux = raiz;
        while(aux!=null){
            if(aux.getInfo().compareTo(node) == 0){
                r++;
                break;
            }else if(aux.getInfo().compareTo(node) < 0){
                aux = aux.getRight();
                r++;
            }else{
                aux = aux.getLeft();
                r++;
            }
        }
        if(aux == null) r = -1;
        return r;
    }

}
