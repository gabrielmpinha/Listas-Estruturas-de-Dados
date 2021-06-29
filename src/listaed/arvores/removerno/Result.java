package listaed.arvores.removerno;
import java.io.*;
public class Result {
    private final static BinaryTree tree = new BinaryTree();

    public static void createTree(String values){
        String[] valuesToAdd = values.split(" ");
        for(String value : valuesToAdd){
            tree.add(value);
        }
    }
    public static String removeNodes(String removeValues){
        String r = "";
        String[] valores = removeValues.split(" ");
        for(String valor : valores){
            tree.remove(valor);
        }

        return tree.toString();
    }

    public static void main(String[] args) throws IOException {


        String addValues = "5 7 4 0 2 1 7 2 3 8";

        String removeValues = "";

        Result.createTree(addValues);

        String result = Result.removeNodes(removeValues);

        System.out.println(tree);
    }
}
