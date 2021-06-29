package listaed.pilhas.textosequencial;
import java.io.*;
public class Solution {
    private static Pilha pilha = new Pilha();

    public static void inserir(String t){
        if(!pilha.isEmpty()) {
            t = pilha.top() + t;
            if(pilha.top().charAt((pilha.top().length()-1)) == '\"' && t.charAt(0) == '\"')
                t = "\"" + t.replaceAll("\"", "") + "\"";
        }
        pilha.push(t);
    }

    public static void alteracoes(){
        pilha.print();
    }

    public static void desfazer(){
        pilha.pop();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();

        Solution.inserir(a);
        Solution.alteracoes();
        Solution.inserir(b);
        Solution.alteracoes();
        Solution.inserir(c);
        Solution.alteracoes();
        Solution.desfazer();
        Solution.alteracoes();
        bufferedReader.close();
    }
}
