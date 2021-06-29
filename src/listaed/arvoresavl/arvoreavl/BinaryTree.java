package listaed.arvoresavl.arvoreavl;

public class BinaryTree<T extends Comparable<T>> {

    private Node<T> initialNode;
    private int quantidade;

    public BinaryTree(){
        this.quantidade = 0;
    }

    public void add(T e){
        Node novo = new Node<>(e);
        if(quantidade == 0){
            initialNode = novo;
        }else{
            Node aux = initialNode;
            while(aux != null) {
                if (e.compareTo((T) aux.getValue()) <= 0) {
                    if(aux.getLeft() == null) {
                        aux.setLeft(novo);
                        break;
                    }
                    else
                        aux = aux.getLeft();
                }else if(e.compareTo((T) aux.getValue()) > 0){
                    if(aux.getRight() == null) {
                        aux.setRight(novo);
                        break;
                    }
                    else
                        aux = aux.getRight();
                }
            }
        }
        quantidade++;
        if(!isBalanced())
            rebalance(novo);
    }

    private void rebalance(Node novo){
        Node w = novo;
        while(isBalanced(novo)){
            novo = getPai(novo);
        }
        Node z = novo;
        Node y = getHeight(z.getLeft()) > getHeight(z.getRight()) ? z.getLeft() : z.getRight();
        Node x = getHeight(y.getLeft()) > getHeight(y.getRight()) ? y.getLeft() : y.getRight();

        if(z.getRight() == y && y.getRight() == x)//simples a direita
            simplesDireita(w, x, y, z);
        else if(z.getLeft() == y && y.getLeft() == x)//simples a esquerda
            simplesEsquerda(w, x, y, z);
        else if(z.getRight() == y && y.getLeft() == x)//dupla a direita
            duplaDireita(w, x, y, z);
        else if(z.getLeft() == y && y.getRight() == x)//dupla esquerda
            duplaEsquerda(w, x, y, z);

    }

    private void simplesEsquerda(Node w, Node x, Node y, Node z){
        Node paiDeZ = getPai(z);
        if(w == x){
            if(paiDeZ == null)
                initialNode = y;
            else {
                if (paiDeZ.getRight() == z)
                    paiDeZ.setRight(y);
                else
                    paiDeZ.setLeft(y);
            }
            y.setRight(z);
            z.setLeft(null);
        }else{
            Node t0 = x.getLeft();
            Node t1 = x.getRight();
            Node t2 = y.getRight();
            Node t3 = z.getRight();

            if(paiDeZ == null)
                initialNode = y;
            else {
                if (paiDeZ.getRight() == z)
                    paiDeZ.setRight(y);
                else
                    paiDeZ.setLeft(y);
            }

            y.setRight(z);
            z.setLeft(t2);

        }
    }

    private void simplesDireita(Node w, Node x, Node y, Node z){
        Node paiDeZ = getPai(z);
        if(w == x){
            if(paiDeZ == null)
                initialNode = y;
            else {
                if (paiDeZ.getRight() == z)
                    paiDeZ.setRight(y);
                else
                    paiDeZ.setLeft(y);
            }
            y.setLeft(z);
            z.setRight(null);
        }else{
            Node t0 = z.getLeft();
            Node t1 = y.getLeft();
            Node t2 = x.getLeft();
            Node t3 = x.getRight();

            if(paiDeZ == null)
                initialNode = y;
            else {
                if (paiDeZ.getRight() == z)
                    paiDeZ.setRight(y);
                else
                    paiDeZ.setLeft(y);
            }

            y.setLeft(z);
            z.setRight(t1);

        }
    }

    private void duplaDireita(Node w, Node x, Node y, Node z){
        Node paiDeZ = getPai(z);
        if(w == x){
            if(paiDeZ == null)
                initialNode = x;
            else {
                if (paiDeZ.getRight() == z)
                    paiDeZ.setRight(x);
                else
                    paiDeZ.setLeft(x);
            }
            x.setLeft(z);
            z.setRight(null);
            x.setRight(y);
            y.setLeft(null);
        }else{
            Node t0 = z.getLeft();
            Node t1 = x.getLeft();
            Node t2 = x.getRight();
            Node t3 = y.getRight();

            if(paiDeZ == null)
                initialNode = x;
            else {
                if (paiDeZ.getRight() == z)
                    paiDeZ.setRight(x);
                else
                    paiDeZ.setLeft(x);
            }

            x.setLeft(z);
            z.setRight(t1);
            x.setRight(y);
            y.setLeft(t2);

        }
    }

    private void duplaEsquerda(Node w, Node x, Node y, Node z){
        Node paiDeZ = getPai(z);
        if(w == x){
            if(paiDeZ == null)
                initialNode = x;
            else {
                if (paiDeZ.getRight() == z)
                    paiDeZ.setRight(x);
                else
                    paiDeZ.setLeft(x);
            }
            x.setLeft(y);
            y.setRight(null);
            x.setRight(z);
            z.setLeft(null);
        }else{
            Node t0 = y.getLeft();
            Node t1 = x.getLeft();
            Node t2 = x.getRight();
            Node t3 = z.getRight();

            if(paiDeZ == null)
                initialNode = x;
            else {
                if (paiDeZ.getRight() == z)
                    paiDeZ.setRight(x);
                else
                    paiDeZ.setLeft(x);
            }

            x.setLeft(y);
            y.setRight(t1);
            x.setRight(z);
            z.setLeft(t2);

        }
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

    public boolean isBalanced(){

        return isBalanced(initialNode);

    }

    private boolean isBalanced(Node<T> no){
        if(no == null)
            return true;

        if (!isBalanced(no.getLeft()) || !isBalanced(no.getRight())){
            return false;
        }

        return Math.abs(getHeight(no.getLeft()) - getHeight(no.getRight())) <= 1;
    }

    private Node getPai(Node<T> node){
        Node<T> pai = initialNode;
        Node<T> aux = null;
        if(pai != node) {
            if(node.getValue().compareTo(initialNode.getValue()) > 0)
                aux = pai.getRight();
            else
                aux = pai.getLeft();
            while(aux != node){
                if(node.getValue().compareTo(aux.getValue()) > 0){
                    pai = aux;
                    aux = aux.getRight();
                }else if(node.getValue().compareTo(aux.getValue()) <= 0){
                    pai = aux;
                    aux = aux.getLeft();
                }
            }

        }
        else{
            return null;
        }
        return pai;
    }

    private boolean isLeaf(Node node){
        boolean r = false;
        if(node.getRight() == null && node.getLeft() == null)
            r = true;
        return r;
    }

    private String treeSearch(Node actual) {
        if (actual == null) {
            return "(null)";
        }
        if(actual.getLeft() == null && actual.getRight() == null )
            return Integer.toString((int)actual.getValue());
        return String.format("l(%s) - %s - r(%s)", treeSearch(actual.getLeft()), actual.getValue(), treeSearch(actual.getRight()));
    }

    public String toString() {
        return treeSearch(initialNode);
    }

}
