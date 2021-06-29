package listaed.arvores.inverter;

public class ArvoreBinaria<T extends Comparable<T>> {

    private No<T> raiz;
    private int quantidade;

    public ArvoreBinaria(){
        this.quantidade = 0;
    }

    public void add(T e){
        if(quantidade == 0){
            raiz = new No<>(e);
        }else{
            No aux = raiz;
            while(aux != null) {
                if (e.compareTo((T) aux.getInfo()) < 0) {
                    if(aux.getLeft() == null) {
                        aux.setLeft(new No<>(e));
                        break;
                    }
                    else
                        aux = aux.getLeft();
                }else if(e.compareTo((T) aux.getInfo()) > 0){
                    if(aux.getRight() == null) {
                        aux.setRight(new No<>(e));
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

    public void inverterArvore(){
        inverterArvore(raiz.getLeft(), raiz.getRight());
    }

    private void inverterArvore(No<T> noL, No<T> noR) {
        if(noL != null || noR != null){
            T aux = noL.getInfo();

            inverterArvore(noL.getLeft(), noR.getRight());
            inverterArvore(noL.getRight(), noR.getLeft());
            noL.setInfo(noR.getInfo());
            noR.setInfo(aux);
        }
    }

    public void percursoEmOrdem(){
        System.out.print(percursoEmOrdem(raiz));
    }

    private String percursoEmOrdem(No<T> no){
        if (no != null) {
            if(!isLeaf(no)) {//SE NAO FOR UMA FOLHA, OU SEJA, EH UMA RAIZ, IRA CHAMAR A RECURSAO PRA ESQUERDA, COLOCAR SEU CONTEUDO E CHAMAR A RECURSAO PRA DIREITA
                return percursoEmOrdem(no.getLeft()) + no.getInfo() + " " + percursoEmOrdem(no.getRight());
            }
            else {
                return no.getInfo() + " ";//SE FOR UMA FOLHA IRA RETORNAR APENAS SEU CONTEUDO
            }
        }
        //SE FOR NULO RETORNA UMA STRING VAZIA
        return "";
    }



    private boolean isLeaf(No node){
        boolean r = false;
        if(node.getRight() == null && node.getLeft() == null)
            r = true;
        return r;
    }

}
