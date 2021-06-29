package listaed.arvoresavl.arvoresbalanceadas;

public class Result {
    public static String NodeInformation(String values) {
        AVLTree tree = new AVLTree();
        String[] valores = values.split(" ");
        for(String valor : valores){
            tree.add(valor);
        }
        return tree.isBalanced();
    }
}
