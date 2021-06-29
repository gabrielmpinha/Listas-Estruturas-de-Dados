package listaed.fila.reverternelementos;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine().trim());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        int c = Integer.parseInt(bufferedReader.readLine().trim());

        int d = Integer.parseInt(bufferedReader.readLine().trim());

        int e = Integer.parseInt(bufferedReader.readLine().trim());

        int f = Integer.parseInt(bufferedReader.readLine().trim());

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int i = Integer.parseInt(bufferedReader.readLine().trim());

        int j = Integer.parseInt(bufferedReader.readLine().trim());

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        FilaDinamica fila = new FilaDinamica();
        //adicionar os valores na Fila
        fila.add(a);
        fila.add(b);
        fila.add(c);
        fila.add(d);
        fila.add(e);
        fila.add(f);
        fila.add(g);
        fila.add(h);
        fila.add(i);
        fila.add(j);

        //revertendo os elementos da fila
        fila.reverterFila(l);

        //printar a Fila
        fila.print();

        bufferedReader.close();
    }
}
