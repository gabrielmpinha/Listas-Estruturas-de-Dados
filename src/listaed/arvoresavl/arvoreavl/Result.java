package listaed.arvoresavl.arvoreavl;

public class Result {
    private final static BinaryTree tree = new BinaryTree();

    public static void addToTree(String values){
        String[] valuesToAdd = values.split(" ");
        for(String value : valuesToAdd){
            tree.add(Integer.parseInt(value));
        }
    }
    public static String printTree(){
        return tree.toString();
    }
}
