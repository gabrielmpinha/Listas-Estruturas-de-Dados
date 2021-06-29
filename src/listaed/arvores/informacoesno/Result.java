package listaed.arvores.informacoesno;

public class Result {

    public static String nodeInformation(String values, String nodeValue) {
        if(nodeValue.split(" ").length != 1) return "-1 -1";
        String r = "";
        BinaryTree arvore = new BinaryTree<>();
        String[] numeros = values.split(" ");
        if(Character.isDigit(numeros[0].charAt(0))){
            for(int i = 0; i < numeros.length; i++) {
                arvore.inserir(Integer.parseInt(numeros[i]));
            }
            r = arvore.profundidade(Integer.parseInt(nodeValue)) + " " + arvore.isLeaf(Integer.parseInt(nodeValue));
        }else{
            for(int i = 0; i < numeros.length; i++) {
                arvore.inserir(numeros[i]);
            }
            r = arvore.profundidade(nodeValue) + " " + arvore.isLeaf(nodeValue);
        }
        return r;
    }
}
