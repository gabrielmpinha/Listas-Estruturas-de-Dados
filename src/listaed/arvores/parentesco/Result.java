package listaed.arvores.parentesco;

public class Result {

    public static String nodeGenealogy(String values, String nodeA, String nodeB) {
        BinaryTree<String> arvore = new BinaryTree<>();
        String[] valores = values.split(" ");

        for(String valor : valores){
            arvore.add(valor);
        }

        return arvore.contarParentesco(nodeA, nodeB);
    }

}
