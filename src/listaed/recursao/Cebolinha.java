package listaed.recursao;

public class Cebolinha {

    public static String substituir(String s, char problema, char solucao) {

        if(s.isEmpty())
            return s;
        else {
            char novaLetra;
            if (s.charAt(0) == problema)
                novaLetra = solucao;
            else
                novaLetra = s.charAt(0);
            return novaLetra + substituir(s.substring(1), problema, solucao);
        }
    }

}
