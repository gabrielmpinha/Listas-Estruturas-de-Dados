package listaed.arvores.removerno;

public class BinaryTree<T extends Comparable<T>> {

    private Node<T> initialNode;
    private int quantidade;

    public BinaryTree(){
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

    public boolean remove(T e){
        Node<T> elemento = consultar(e);
        boolean r = false;
        if(initialNode != null && elemento != null){
            if(elemento == initialNode){
                if(initialNode.getLeft() == null)
                    initialNode = initialNode.getRight();
                else if(initialNode.getRight() == null)
                    initialNode = initialNode.getLeft();
                else{
                    removerRaiz(elemento);
                }
            }else{
                if(isLeaf(elemento)){
                    Node<T> pai = getPai(elemento);
                    if(pai.getLeft() == elemento)
                        pai.setLeft(null);
                    else if(pai.getRight() == elemento)
                        pai.setRight(null);
                }else{
                    removerRaiz(elemento);
                }
            }
            r = true;


        }

        if(r) quantidade--;
        return r;
    }

    private void removerRaiz(Node<T> elemento){
        if(elemento.getLeft() == null){
            if(getPai(elemento).getRight() == elemento)
                getPai(elemento).setRight(elemento.getRight());
            else
                getPai(elemento).setLeft(elemento.getRight());
        }

        else if(elemento.getRight() == null){
            if(getPai(elemento).getRight() == elemento)
                getPai(elemento).setRight(elemento.getLeft());
            else
                getPai(elemento).setLeft(elemento.getLeft());
        }
        else{
            Node<T> aux = elemento.getLeft();
            while(aux.getRight() != null){
                aux = aux.getRight();
            }
            Node<T> pai = getPai(aux);
            elemento.setValue(aux.getValue());
            if(pai != elemento)
                pai.setRight(aux.getLeft());
            else
                pai.setLeft(aux.getLeft());
        }
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
        return pai;
    }


    public Node consultar(T valor){
        Node<T> r = null;
        Node<T> aux = initialNode;
        while (aux != null){
            if(valor.compareTo(aux.getValue()) == 0){
                r = aux;
                break;
            }else if(valor.compareTo(aux.getValue()) < 0) {
                aux = aux.getLeft();
            }else{
                aux = aux.getRight();
            }
        }

        return r;
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
            return (String)actual.getValue();
        return String.format("l(%s) - %s - r(%s)", treeSearch(actual.getLeft()), actual.getValue(), treeSearch(actual.getRight()));
    }


    public String toString() {
        return treeSearch(initialNode);
    }

}
