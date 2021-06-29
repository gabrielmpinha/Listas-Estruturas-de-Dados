package listaed.arvores.percursos;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Teste {
//        public static void main(String[] args) {
//        BinaryTree<Integer> a = new BinaryTree<>();
//        a.inserir(1);
//        a.inserir(2);
//        a.inserir(3);
//        a.inserir(4);
//        a.inserir(5);
//        a.inserir(20);
//        a.questao();
//
//    }
    public static void addArvore(String entrada, BinaryTree a) {
        String[] numeros = entrada.split(",");
        for(int i = 0; i < numeros.length; i++){
            a.inserir(Integer.parseInt(numeros[i]));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String entrada = bufferedReader.readLine();
        BinaryTree a = new BinaryTree();
        addArvore(entrada,a);
        a.questao();

        bufferedReader.close();
    }
}
