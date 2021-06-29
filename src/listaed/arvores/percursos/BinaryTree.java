package listaed.arvores.percursos;

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

    public String preOrder(){
        return "Pre ordem:\n" + preOrder(raiz);
    }

    private String preOrder(BinaryNode<T> no){
        if (no != null) {
            if(!isLeaf(no))//SE NAO FOR UMA FOLHA, OU SEJA, EH UMA RAIZ, IRA RETORNAR SEU CONTEUDO, E CHAMAR A RECURSAO, PRIMEIRO COM LEFT E DPS COM RIGHT
                return no.getInfo() + " " + preOrder(no.getLeft()) + preOrder(no.getRight());
            else {
                return no.getInfo() + " ";//SE FOR UMA FOLHA IRA RETORNAR APENAS SEU CONTEUDO
            }
        }
        //SE FOR NULO RETORNA UMA STRING VAZIA
        return "";
    }

    public String inOrder(){
        return "Em ordem:\n" + inOrder(raiz);
    }

    private String inOrder(BinaryNode<T> no){
        if (no != null) {
            if(!isLeaf(no)) {//SE NAO FOR UMA FOLHA, OU SEJA, EH UMA RAIZ, IRA CHAMAR A RECURSAO PRA ESQUERDA, COLOCAR SEU CONTEUDO E CHAMAR A RECURSAO PRA DIREITA
                return inOrder(no.getLeft()) + no.getInfo() + " " + inOrder(no.getRight());
            }
            else {
                return no.getInfo() + " ";//SE FOR UMA FOLHA IRA RETORNAR APENAS SEU CONTEUDO
            }
        }
        //SE FOR NULO RETORNA UMA STRING VAZIA
        return "";
    }

    public String postOrder(){
        return "Pos ordem:\n" + postOrder(raiz);
    }

    private String postOrder(BinaryNode<T> no){
        if (no != null) {
            if(!isLeaf(no)) {//SE NAO FOR UMA FOLHA, OU SEJA, EH UMA RAIZ, IRA CHAMAR A RECURSAO PRA ESQUERDA, COLOCAR SEU CONTEUDO E CHAMAR A RECURSAO PRA DIREITA
                return postOrder(no.getLeft()) + postOrder(no.getRight()) + no.getInfo() + " ";
            }
            else {
                return no.getInfo() + " ";//SE FOR UMA FOLHA IRA RETORNAR APENAS SEU CONTEUDO
            }
        }
        //SE FOR NULO RETORNA UMA STRING VAZIA
        return "";
    }

    private boolean isLeaf(BinaryNode node){
        boolean r = false;
        if(node.getRight() == null && node.getLeft() == null)
            r = true;
        return r;
    }

    public void questao(){
        System.out.println(inOrder() + "\n" +preOrder() + "\n" + postOrder());
    }

}
