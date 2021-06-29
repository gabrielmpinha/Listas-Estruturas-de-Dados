package listaed.arvores.parentesco;

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
                if (e.compareTo((T) aux.getValue()) < 0) {
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


    public String contarParentesco(T nodeA, T nodeB){

        Node<T> acima, abaixo;
        String r = "";
        int c = 0;
        if(consultar(nodeA) != null && consultar(nodeB) != null) {
            if (profundidade(nodeA) == profundidade(nodeB)) {
                return "nao ha parentesco";
            } else if (profundidade(nodeA) > profundidade(nodeB)) {
                abaixo = consultar(nodeA) ;
                acima = consultar(nodeB);
            } else {
                abaixo = consultar(nodeB);
                acima = consultar(nodeA) ;
            }

            while (abaixo != null) {
                abaixo = getPai(abaixo);
                c++;
                if (abaixo == acima)
                    break;
            }
            if (abaixo != null) {
                r = "Pai";
                for (int i = 0; i < c - 1; i++) {
                    r += " do Pai";
                }
            } else {
                r = "nao ha parentesco";
            }
        }else
            r= "nao ha parentesco";

        return r;
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

        }else{
            pai = null;
        }
        return pai;
    }


    private Node consultar(T valor){
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


    public int profundidade(T node){
        int r = -1;
        Node<T> aux = initialNode;
        while(aux!=null){
            if(aux.getValue().compareTo(node) == 0){
                r++;
                break;
            }else if(aux.getValue().compareTo(node) < 0){
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
