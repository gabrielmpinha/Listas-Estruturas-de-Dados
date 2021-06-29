package listaed.arvoresavl.arvoresbalanceadas;

public class AVLTree<T extends Comparable<T>> {

    private Node<T> initialNode;
    private int quantidade;

    public AVLTree(){
        this.quantidade = 0;
    }

    public void add(T e){
        if(quantidade == 0){
            initialNode = new Node<>(e);
        }else{
            Node aux = initialNode;
            while(aux != null) {
                if (e.compareTo((T) aux.getValue()) <= 0) {
                    if(aux.getLeft() == null) {
                        aux.setLeft(new Node<>(e));
                        break;
                    }
                    else
                        aux = aux.getLeft();
                }else if(e.compareTo((T) aux.getValue()) > 0){
                    if(aux.getRight() == null) {
                        aux.setRight(new Node<>(e));
                        break;
                    }
                    else
                        aux = aux.getRight();
                }
            }
        }
        quantidade++;
    }

    public int getHeight(Node<T> no){
        int v = 0;
        if(no == null)
            return -1;
        else {
            if (!isLeaf(no)) {
                v = getHeight(no.getLeft()) > getHeight(no.getRight()) ? getHeight(no.getLeft()) + 1 : getHeight(no.getRight()) + 1;
            }
        }
        return v;
    }

    public String isBalanced(){
        return isBalanced(initialNode);
    }

    private String isBalanced(Node<T> no){

        if(no != null) {
            if (Math.abs(getHeight(no.getLeft()) - getHeight(no.getRight())) > 1)
                return "Nao e balanceada";
            else {
                isBalanced(no.getLeft());
                isBalanced(no.getRight());
            }
        }

        return "E balanceada";
    }


    private boolean isLeaf(Node node){
        boolean r = false;
        if(node.getRight() == null && node.getLeft() == null)
            r = true;
        return r;
    }

}
