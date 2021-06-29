package listaed.fila.binario;
import java.io.*;

public class Solution {
    public static FilaDinamica<String> numerosBinarios(int n){
        FilaDinamica<String> fila = new FilaDinamica();

        for(int i= 1; i <= n; i++){
            String numeroBinario = "";
            int numeroDecimal = i;

            while(numeroDecimal > 0){
                int resto = numeroDecimal % 2;
                numeroBinario = resto + numeroBinario;
                numeroDecimal = numeroDecimal / 2;
            }

            fila.inserir(numeroBinario);
        }

        return fila;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine().trim());

        FilaDinamica<String> fila = new FilaDinamica<String>();
        //chamando o método e atribuindo a fila
        fila = numerosBinarios(a);

        //printar a Fila
        fila.print();

        bufferedReader.close();
    }
}
